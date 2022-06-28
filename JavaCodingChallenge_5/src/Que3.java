
public class Que3 {
	public static void main(String[] args) {
		char arr [] = new char[] {'A', 'Z', 'B', 'N', 'P', 'T', 'X', 'C'};
		char user = 'E';
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == user) { // Logic to match the character.
				System.out.println(user + " is found");
				return; // If a particular character found, exit out of the for loop.
			}
		}
		System.out.println(user + " is not found");
	}
}
