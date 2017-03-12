
public class ElementUniqueness {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] testArray = {1, 2, 3, 4, 5};
		ElementUniqueness unique = new ElementUniqueness();
		
		if(unique.uniqueElements(testArray) == true){
			System.out.println("true");
		} else{
			System.out.println("false");
		}
		

	}
	
	public boolean uniqueElements(int[] numbers){
		//determines if elements are distinct, returns true if they are, false if they aren't
		int length = numbers.length;
		for(int i = 0; i<length-1; i++){
			for (int j = i+1; j<length; j++){
				if (numbers[i] == numbers[j]){
					return false;
				}
			}
		}
		return true;
	}

}
