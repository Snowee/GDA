package gui;
import gda.Answer;
import gda.Assignment;

import javax.swing.JFrame;


public class Interface {
	
	private JFrame frame ;
	public Interface(){
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
	}
	public Answer ask(Assignment assignment){
		AssignmentInterface inter = new AssignmentInterface(frame);
		return inter.ask(assignment);
	}
	public Assignment createAssignment(){
		AssignmentCreationInterface inter = new AssignmentCreationInterface(frame);
		return inter.create(0);
	}
	public void close(){
		frame.dispose();
	}
}
