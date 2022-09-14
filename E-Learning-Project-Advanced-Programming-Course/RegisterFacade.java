package srs20120042;

import java.util.Map;

public class RegisterFacade {

	public void registerCourses(Student student, boolean paid, Section... sections) {

		// Constructing a new object of type Payment
		Payment payment = new Payment();
		// inserting the value of paid (boolean)
		payment.setPayment(paid);
		// if the student has paid successfully then continue
		if (payment.isPayment()) {
			// updating the student's payment attribute value to be true to give access to
			// the addSections method
			student.payment = true;
			// adding the sections the student wants to register
			student.addSections(sections);
			// printing a new empty line for readability
			System.out.println();
			// Showing the name, id, and the courses the student has registered in addition
			// to total hours
			System.out.println("The student has successfully registered the following courses");
			System.out.println("[Name :" + student.getName() + "]   [Id :  " + student.getId() + "]");
			for (Map.Entry<Section, String> entry : student.getStudentSections().entrySet()) {
				System.out.println(entry.getKey() + "    [Hours : " + entry.getKey().getCourse().getCreditHours() + "]");
			}
			System.out.println("Total Registered Hours = " + student.getTotalHours());
		}
		// Warning the student that he/she hasn't yet completed the payment process.
		else {
			System.out.println("You have to pay firstly to be able of Registering courses.");
		}
	}
}
