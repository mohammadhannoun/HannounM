package edu.htu.assignment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
public class EventDrivenTwoPointTwo {
	public static void main(String[] args) {
		JFrame frame= new JFrame();
			frame.setSize(300, 150);
				frame.setLocationRelativeTo(null);
					frame.setTitle("Square area calculator");
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						JPanel pnl= new JPanel();
		JLabel lblOne= new JLabel("Side Length");
			final JTextField lengthTxt= new JTextField(10);
				JButton btn= new JButton("Calculate");
					btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String length= lengthTxt.getText();
					double lengthNum= Double.parseDouble(length);
						double area= Math.pow(lengthNum, 2);
							System.out.println("The area of the square= "+area);
				}
					});
		pnl.add(lblOne);
			pnl.add(lengthTxt);
				pnl.add(btn);
					frame.add(pnl);
						frame.setVisible(true);
	}
}
