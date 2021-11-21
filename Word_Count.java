import java.util.Scanner;
public class Word_Count {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String :");
		String s = sc.nextLine();
		String s1 [] = s.split(" ");
		for (String s2:s1) {
			count++;
			
			
		}
			
		System.out.println("Total Number of words in String : "+count);
	

	}

}
