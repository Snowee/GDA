package gda;

public class Answer {
	
	private Assignment 	assignment   ;
	private boolean 	correct      ;
	private Option		option	     ;
	private Strategy 	strategy     ;
	private Feedback	feedback     ;
	private boolean 	secondGuess  ;
	private Option		secondOption ;
	
	
	public Answer( Assignment assignment ){
		this.assignment = assignment ;
		this.correct    = false ;
	}
	public Answer(Assignment assignment, int choice){
		this.assignment = assignment ;
		this.option 	= assignment.options()[choice];
		this.correct 	= assignment.isCorrect(choice);
	}
	public boolean correct(){
		if( option == null)
			return false ;
		return correct ;
	}
	public void setFirstChoice(int choice){
		this.option 	= assignment.options()[choice] ;
		this.correct 	= assignment.isCorrect(choice) ;
	}
	public Assignment getAssignment(){
		return assignment ;
	}
	public int getFirstChoice(){
		for( int i = 0 ; i < assignment.options().length ;i++){
			if(assignment.options()[i].equals(option))
				return i;
		}
		return -1;
	}
}
