package external_exercises;

import javax.swing.JOptionPane;

public class ExThirtySix {
	public static void main(String[] args) {
		double[] latitude1=new double[2];
		double[] longtitude1=new double[2];
		for(int i=0; i<=1; i++) {
			String latitude=JOptionPane.showInputDialog("Input the latitude of coordinate"+(i+1)+" : ");
			latitude1[i]=Double.parseDouble(latitude); 
			String longtitude=JOptionPane.showInputDialog("Input the longtitude of coordinate"+(i+1)+" : ");
			longtitude1[i]=Double.parseDouble(longtitude); 
		}
		double distance=distance(latitude1[0], longtitude1[0], latitude1[1], longtitude1[1]);
		System.out.println("The distance between the two points = "+distance);
	}
	public static double distance(double latitude0, double longtitude0, double latitude1, double longtitude1) {
		double latitude00=Math.toRadians(latitude0);
		double longtitude00=Math.toRadians(longtitude0);
		double latitude11=Math.toRadians(latitude1);
		double longtitude11=Math.toRadians(longtitude1);
		double distance;	
		distance=6371.01*Math.acos(Math.sin(latitude00)*Math.sin(latitude11)+Math.cos(latitude00)*Math.cos(latitude11)*Math.cos(longtitude00-longtitude11));
			return distance;
	}
}
