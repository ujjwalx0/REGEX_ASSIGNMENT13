import java.util.Scanner;


public class Palindrome_String {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter The String :");
	String st = sc.nextLine();
	int  j=st.length()-1;
	String rev = "";
	
for(int i=j;i>=0;i--) {
	rev += st.charAt(i);}
	if(st.equals(rev)) {
		System.out.println("PALINDROME");
	}
	else {
		System.out.println("NOT PALINDROME");
	
}
	}

}
