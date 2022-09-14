package srs20120042;

public class Main {
	public static void main(String[] args) {
		HTUConfig g = HTUConfig.getInstance();
		
		Degree bachelor = new Degree("Bachelor");
		Degree master = new Degree("Master");
		
		School ENG = new School("1", "School of Engineering Technology", "ENG");
		School IT = new School("2", "School of Informatics", "IT");
		
		Program ELENG = new Program("1", "Electrical Engineering", "ELENG");
		Program ENENG = new Program("2", "Energy Engineering", "ENENG");
		
		Program CS = new Program("3", "Computer Science", "CS");
		Program DS = new Program("4", "Data Science", "DS");
		Program CYS = new Program("5", "Cybersecurity", "CYS");
		
		ENG.addPrograms(ELENG, ENENG);
		IT.addPrograms(CS, DS, CYS);
		
		Course advProg = new Course("1", "Advanced Programming", 3);
		Course net = new Course("2", "Networking", 3);
		Course stem = new Course("3", "Stem Lab", 2);
		Course dB = new Course("4", "DataBase Design and Development", 3);
		Course dS = new Course("5", "Data Structures", 3);
		Course math = new Course("6", "Functional Math", 3);
		Course phy = new Course("7", "Functional Physics", 3);
		Course art = new Course("8", "Art and Civilization", 1);
		
		CS.addCourse(advProg, net, stem, dB, dS, math, phy, art);

		Instructor hamzeh = new Instructor(1, "Hamzeh Isefan", IT, 2800);
		Instructor raneem = new Instructor(2, "Raneem Qadoura", IT, 2650);
		Instructor malik = new Instructor(3, "Malik Al-Louzi", IT, 2200.5);
		Instructor rasha = new Instructor(4, "Rasha Shaheen", IT, 2150);
		Instructor ahmad = new Instructor(5, "Ahmad Orabi", IT, 2300);
		Instructor geda = new Instructor(6, "Geda Hamam", IT, 1700);
		Instructor moath = new Instructor(7, "Moath Sulieman", IT, 1900);
		Instructor rola = new Instructor(8, "Rola sami", IT, 1500);
		
		
		Section advFS = new Section(1, advProg, hamzeh);
		Section advSS = new Section(2, advProg, hamzeh);
		Section netFS = new Section(1, net, moath);
		Section netSS = new Section(2, net, moath);
		Section stemFS = new Section(1, stem, rola);
		Section stemSS = new Section(2, stem, rola);
		Section dBFS = new Section(1, dB, raneem);
		Section dBSS = new Section(2, dB, raneem);
		Section dSFS = new Section(1, dS, malik);
		Section dSSS = new Section(2, dS, malik);
		Section mathFS = new Section(1, math, ahmad);
		Section mathSS = new Section(2, math, ahmad);
		Section mathTS = new Section(3, math, ahmad);
		Section phyFS = new Section(1, phy, rasha);
		Section phySS = new Section(2, phy, rasha);
		Section artFS = new Section(1, art, geda);
		Section artSS = new Section(2, art, geda);
		
		
		
		Student moh = new Student(1, "Mohmmad Hannoun", IT, bachelor, CS, "Regular");
		Student abd = new Student(2, "Abedalrahman Ahmad", IT, bachelor, DS, "Regular");
		Student ahmd = new Student(3, "Ahmad faris", IT, bachelor, CYS, "Regular");
		
		
		System.out.println("All the users of the system have the same year and semester : ");
		System.out.println("------------------------------------------------------------------");
		System.out.println("Instructors");
		System.out.println(rasha);
		System.out.println(geda);
		System.out.println("------------------------------------------------------------------");
		System.out.println("Students");
		System.out.println(moh);
		System.out.println(abd);
		System.out.println("------------------------------------------------------------------");
		System.out.println("Sections");
		System.out.println(advFS);
		System.out.println(netSS);
		System.out.println("------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------");
		System.out.println("The following example shows that a student can register until he/she has paid the fees : ");
		
		RegisterFacade reg = new RegisterFacade();
		reg.registerCourses(abd, false, advFS, netSS);
		System.out.println("------------------------------------------------------------------");
		System.out.println("The following demonstrates that the courses haven't been added to the student : ");
		System.out.println(abd);
		
		System.out.println("------------------------------------------------------------------");
		reg.registerCourses(moh, true, advFS, netSS, dBFS, phySS, mathSS, dSSS);
		System.out.println("------------------------------------------------------------------");
		System.out.println("The following ensures that the courses have been added to the student : ");
		System.out.println(moh);
		System.out.println("------------------------------------------------------------------");
		System.out.println("The following example shows that Instructors can add grades to the student and that students can calculate their average : ");
		moh.addGrades(advFS, "4");
		moh.addGrades(netSS, "3.2");
		moh.addGrades(dBFS, "4");
		moh.addGrades(phySS, "3.2");
		moh.addGrades(mathSS, "2.4");
		moh.addGrades(dSSS, "4");
		
		moh.calcSmstrAvg();
		System.out.println("------------------------------------------------------------------");
		reg.registerCourses(ahmd, true, advSS, netSS, dBSS, mathSS, phyFS, stemFS, artSS);
		System.out.println("------------------------------------------------------------------");
		System.out.println("The following example shows that a student can't add more than 18 hours : ");
		ahmd.addSections(dSSS);
		System.out.println("------------------------------------------------------------------");
		System.out.println("The following example shows that a student can drop courses : ");
		ahmd.removeSections(advSS, mathSS);
		System.out.println(ahmd);
		System.out.println("------------------------------------------------------------------");
		System.out.println("The following exmples demonstrates the requirements in the assignment : ");
		System.out.println(bachelor);
		System.out.println("------------------------------------------------------------------");
		System.out.println(master);
		System.out.println("------------------------------------------------------------------");
		System.out.println(IT);
		System.out.println("------------------------------------------------------------------");
		System.out.println(ENG);
		System.out.println("------------------------------------------------------------------");
		System.out.println(CS);
		System.out.println("------------------------------------------------------------------");
		System.out.println(DS);
		System.out.println("------------------------------------------------------------------");
		System.out.println(CYS);
		System.out.println("------------------------------------------------------------------");
		System.out.println(ELENG);
		System.out.println("------------------------------------------------------------------");
		System.out.println(ENENG);
		System.out.println("------------------------------------------------------------------");
		System.out.println(advProg);
		System.out.println("------------------------------------------------------------------");
		System.out.println("The following example shows the courses for each program : ");
		CS.showProgramCourses();
		System.out.println("------------------------------------------------------------------");
		System.out.println("The following example shows the programs of a school : ");
		IT.showSchoolPrograms();
		System.out.println("------------------------------------------------------------------");
		System.out.println("The following example shows the programs of a school : ");
		ENG.showSchoolPrograms();
		System.out.println("------------------------------------------------------------------");
		System.out.println("The following example shows that an Instructor have salary : ");
		System.out.println(hamzeh.getSalary());
		System.out.println("------------------------------------------------------------------");
		System.out.println(hamzeh);
		System.out.println("------------------------------------------------------------------");
		System.out.println("The following example shows the section : ");
		System.out.println(advFS);
		System.out.println("------------------------------------------------------------------");
		System.out.println("The following example shows the student : ");
		System.out.println(moh);
		System.out.println("------------------------------------------------------------------");
		System.out.println("The following example shows that a student can check the total hours : ");
		System.out.println(moh.getTotalHours());
		System.out.println("------------------------------------------------------------------");
		System.out.println("The following example shows that a student can change the program : ");
		System.out.println("Old PROGRAM : " + abd.getProgram());
		System.out.println(abd);
		System.out.println("------------------------------------------------------------------");
		abd.setProgram(CYS);
		System.out.println("New Program : " + abd.getProgram());
		System.out.println(abd);
		System.out.println("------------------------------------------------------------------");
		moh.viewGrades();
		System.out.println("------------------------------------------------------------------");
		
		ahmd.addGrades(netSS, "4");
		ahmd.addGrades(dBSS, "3.2");
		ahmd.addGrades(phyFS, "2.6");
		ahmd.addGrades(stemFS, "2.4");
		ahmd.addGrades(artSS, "2.4");
		
		ahmd.calcSmstrAvg();
	}
}