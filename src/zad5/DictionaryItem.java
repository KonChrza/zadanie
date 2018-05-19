package zad5;

public class DictionaryItem {

		private int id;
		private int intKey;
		private String stringKey;
		private String value;
		private String enumerationValue;
		
		
		
		@Override
		public String toString() {
			return "DictionaryItem [id=" + id + ", intKey=" + intKey
					+ ", stringKey=" + stringKey + ", value=" + value
					+ ", enumerationValue=" + enumerationValue + "]";
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getIntKey() {
			return intKey;
		}
		public void setIntKey(int intKey) {
			this.intKey = intKey;
		}
		public String getStringKey() {
			return stringKey;
		}
		public void setStringKey(String stringKey) {
			this.stringKey = stringKey;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
		public String getEnumerationValue() {
			return enumerationValue;
		}
		public void setEnumerationValue(String enumerationValue) {
			this.enumerationValue = enumerationValue;
		}
	
}
