package gda;
import gui.AssignmentCreationInterface;
import gui.Interface;

import javax.swing.JFrame;


public class GeoDigiAssistant {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame("GeoDigiAssistant");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Interface inter = new Interface();
		
		Assignment ass = new Assignment("Wat is de omtrek van deze figuur?");
		ass.addOption(new Option("36m\u00B2"));
		ass.addOption(new Option("16m"));
		ass.addOption(new Option("32m"), true );
		ass.addOption(new Option("9m\u00B2"));
		
		ass.addPicture(0, "images/omtrek.jpg");
		
		//Answer ans = inter.ask(ass);
		ass = inter.createAssignment();
		inter.close();
		
		/*if( ans.correct() ){
			System.out.println("Je krijgt een 10 motherfucker.");
		} else {
			System.out.println("zucht.");
		}*/
		frame.dispose();
		System.exit(0);
	}

}
