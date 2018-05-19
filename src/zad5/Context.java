package zad5;

public class Context {
	
	private ErrorStrategy errorStrategy;
	
	public Context(ErrorStrategy errorStrategy){
		this.errorStrategy=errorStrategy;
	}
	public void executeStrategy(){
		errorStrategy.reactOnError();
	}
}
