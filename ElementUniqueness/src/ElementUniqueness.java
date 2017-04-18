import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ElementUniqueness {

	//public static int numOps = 0;
	public static void main(String[] args) {
		
		ElementUniqueness unique = new ElementUniqueness();
		try {
			unique.readWrite();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//System.out.println(numOps);
		
	}
	public void readWrite()throws IOException{
		//Create variables and things
		File input = new File("pa1_input.txt");
		FileWriter output = new FileWriter("output.txt");
		Scanner sc = null;
		boolean unique = false;
		String newLine = System.getProperty("line.separator");
		
		try{
			sc = new Scanner(input);
		} catch(FileNotFoundException e){
			e.printStackTrace();
		}
		
		//read each line, get first value, then put the rest in the array
		while(sc.hasNext()){
			//get first int, set that to the array length
			int[] lineArray = new int[sc.nextInt()];
			//numOps++;
			//for each int found,put it in the lineArray
			for(int i=0; i<lineArray.length; i++){
				lineArray[i] = sc.nextInt();
				//numOps++;
			}
			unique = uniqueElements(lineArray);
			//System.out.println(lineArray.length);
			if(!unique){
				output.write("False" + newLine);
				//System.out.println("false");
			} else{
				output.write("True" + newLine);
				//System.out.println("true");
			}

		}
		output.close();
	}
	
	
	public boolean uniqueElements(int[] numbers){
		//determines if elements are distinct, returns true if they are, false if they aren't
		int length = numbers.length;
		for(int i = 0; i<length-1; i++){
			//numOps++;
			for (int j = i+1; j<length; j++){
				//numOps++;
				if (numbers[i] == numbers[j]){
					return false;
				}
			}
		}
		return true;
	}

}
