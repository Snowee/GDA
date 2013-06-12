package gda;

import javax.swing.JLabel;

public class Assignment {
	/*
	\item Vier antwoorden
	\item Strategie\"en per antwoord
	\item De vraag + e.v. plaatjes
	\item Opgave speficieke feedback per strategie
	\item Per strategie nakijkwerk
	\item verdeling strategie\"en
	\item percentage eerste keer correct per strategie
	\item percentage tweede keer correct per strategie
	*/
	private int		 id			  ;
	private Option[] options  	  ;
	private String   question 	  ;
	private Picture  picture  	  ;
	private int      correct 	  ;
	private int      totalOptions ;
	
	public Assignment(String question){
		this.question = question ;
		options       = new Option[4] ;
	}
	
	public Assignment(String question, Option[] options, int totalOptions){
		this.question 		= question ;
		this.options  		= new Option[4] ;
		this.totalOptions 	= Math.min(4, totalOptions) ;
		System.arraycopy(options, 0, this.options, 0, this.totalOptions);
	}
	
	public boolean addPicture(int id, String path){
		picture = new Picture(id,path);
		boolean succes = picture.load();
		picture.deload();
		if( !succes )
			picture = null ;
		return succes ;
	}
	
	public void setOptions(Option[] options, int totalOptions){
		this.options  		= new Option[4] ;
		this.totalOptions 	= Math.min(4, totalOptions) ;
		System.arraycopy(options, 0, this.options, 0, this.totalOptions);
	}
	
	public void addOption(Option option){
		addOption(option, false);
	}
	public void addOption(Option option, boolean correct){
		this.options[Math.min(3, totalOptions)] = option ;
		this.totalOptions = Math.min(4, totalOptions+1) ;
		if(correct){
			this.correct = totalOptions - 1 ;
		}
	}
	
	public String  question() {						return question;							}
	
	public Option[] options() {						return options;								}
	
	public int correctIndex(){						return correct ;							}
	public Option correctOption(){					return options[correct];					}
	public boolean isCorrect(int index){			return index == correct ;					}
	public boolean isCorrect( Option choice ){		return options[correct].equals(choice) ;	}

	public Option getAnswer(int id) {
		try{
			return options[id];
		} catch(NullPointerException e){
			return null;
		}
	}
	public boolean hasPicture(){
		return picture != null ;
	}
	public JLabel getPicture(){
		if( !picture.isLoaded() )
				picture.load();
		return picture.getLabel();
	}
}
