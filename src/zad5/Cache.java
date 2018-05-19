package zad5;

import java.util.List;

//singleton


public class Cache {

		private static Cache INSTANCE;
		
		private List<DictionaryItem> dicionaryItems;
		
		private Cache(){}
		
		public static  Cache getInstance(){
			if (INSTANCE == null){
				INSTANCE = new Cache();
			}
			return INSTANCE;
			
		}

		public List<DictionaryItem> getDicionaryItems() {
			return dicionaryItems;
		}

		public void setDicionaryItems(List<DictionaryItem> dicionaryItems) {
			this.dicionaryItems = dicionaryItems;
		}
	
}
