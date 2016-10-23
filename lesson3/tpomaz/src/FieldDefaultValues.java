
class FieldDefaultValues {
	
	public static void main (String[] args){
		FieldDefaultValuesExample defValues = new FieldDefaultValuesExample();
		
		System.out.println("Default values of primitive : ");
		System.out.println(defValues.toString());
	}
	
}

class FieldDefaultValuesExample {
	byte byteValue;
	short shortValue;
	int intValue;
	long longValue;
	
	char charValue;
	
	float floatValue;
	double doubleValue;
	
	boolean booleanValue;
	
	
	public String toString() {
		return "byte = " + byteValue + "\n" 
				+ "short = " + shortValue + "\n" 
				+ "int = " + intValue + "\n" 
				+ "long = " + longValue + "\n" 
				+ "char = " + charValue + "\n" 
				+ "float = " + floatValue + "\n" 
				+ "double = " + doubleValue + "\n" 
				+ "boolean = " + booleanValue + "\n";
	}	
}