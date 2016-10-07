import java.util.*;



public class CreateStrings {
	
	public static String creation(String str, int n){
		
		String repeated = new String(new char[n]).replace("\0", str);
		
		return repeated;
	}

	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter a string and an int");
		String test=scan.nextLine();
		String[] split = test.split(" ");
		String firstString=split[0];
		int secondPart = Integer.parseInt(split[1]);
		
		System.out.println("The string is "+creation(firstString,secondPart));
	
	}
	
}
