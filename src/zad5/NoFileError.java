package zad5;


public class NoFileError implements ErrorStrategy {

	
	public void reactOnError() {
		System.out.println("Brak pliku");
		System.exit(0);

	}

}
