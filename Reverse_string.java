import java.util.Scanner;

public class Reverse_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String :");
		String st = sc.nextLine();
		int  j=st.length()-1;
		String rev = "";
		for(int i=j;i>=0;i--) {
			rev+=st.charAt(i);
		}
         System.out.println("Reverse of "+st+" is :" +rev);
	}

}
