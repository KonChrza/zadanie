package zad5;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class main {

	public static void main(String[] args) {
		
		final main main = new main();
		
		Timer timer = new Timer();
		
		timer.schedule(new TimerTask(){
			public void run(){
				main.run();
			}}, 0,3*1000);
		
		}
		
		
	
	private void run(){
		
		DictionaryReader dictionaryReader = new DictionaryReader();
		List<DictionaryItem> dictionaryItems = dictionaryReader.readDictionaryFromFile();
		
		Cache cache = Cache.getInstance();
	
		cache.setDicionaryItems(dictionaryItems);
		
		
	}

}
