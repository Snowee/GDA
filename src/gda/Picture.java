package gda;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Picture {
	private int 	id 		;
	private String  path 	;
	private boolean loaded 	;
	private JLabel  label   ;
	
	public Picture( int id, String path ){
		this.id   	= id    ;
		this.path 	= path  ;
		this.loaded = false ;
	}
	public boolean load(){
		label = new JLabel();
		ImageIcon im = new ImageIcon(path);
		label.setIcon(im);
	    return true ;
	}
	public JLabel image(){
		return label ;
	}
	public void deload(){
		label.removeAll();
	}
	public JLabel getLabel(){
		return label ;
	}
	public boolean isLoaded(){
		return loaded ;
	}
	
}
