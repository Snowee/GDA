package gda;

public class SuperStrategy {
	private int id;
	private boolean correct ;
	private String name, description ;
	
	public SuperStrategy( int id, String name, boolean correct, String description ){
		this.id 		 = id ;
		this.name 		 = name ;
		this.correct 	 = correct ;
		this.description = description ;
	}
	
	public int 		id(){				return id ;			}
	public boolean 	correct(){			return correct ;	}
	public String 	name() {			return name ;		}
	public String 	description() {		return description ;}
}
