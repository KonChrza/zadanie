package zad5;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class DictionaryReader {
	
	public List<DictionaryItem> readDictionaryFromFile(){
		Context context = null;
		List<DictionaryItem> dictionaryItems = new ArrayList<>();
		
		File file = new File("/home/PJWSTK/s17404/java/zad5/dic/dic.csv"); //mozna forcowac foldery w ustawieniach run
		
		if(!file.exists()){
			context = new Context(new NoFileError());
		}
		else {
		
		try {
			List<String> allLines = Files.readAllLines(file.toPath(), Charset.forName("UTF-8"));
			
			dictionaryItems = map(allLines);
			
			
			
			System.out.println(allLines);
			
		} catch (Exception e) {
			context = new Context(new WrongDataError());
			}
		
		if (context != null){
			context.executeStrategy();
			}
		}
		return dictionaryItems;
		
	}

	private List<DictionaryItem> map(List<String> allLines) {
		
		List<DictionaryItem> dictionaryItems = new ArrayList<>();
		
		for (int i =1; i<allLines.size(); i++){
			String line = allLines.get(i);
			String[] elementsInLine = line.split(";");
			
			DictionaryItem dictionaryItem = new DictionaryItem();
			dictionaryItem.setId(Integer.parseInt(elementsInLine[0]));
			dictionaryItem.setIntKey(Integer.parseInt(elementsInLine[1]));
			dictionaryItem.setStringKey(elementsInLine[2]);
			dictionaryItem.setValue(elementsInLine[3]);
			dictionaryItem.setEnumerationValue(elementsInLine[4]);
			
			dictionaryItems.add(dictionaryItem);
			
		}
		
		
		
		return dictionaryItems;
	}

}
