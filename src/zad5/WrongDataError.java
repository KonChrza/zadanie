package zad5;

public class WrongDataError implements ErrorStrategy{

	
	public void reactOnError() {
		System.out.println("Bledne dane w pliku");
		System.exit(0);
		
	}

}
