import java.util.Scanner;

public class Title_Case {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String :");
		String s = sc.nextLine();
		char c[]=s.toLowerCase().toCharArray();
		boolean found = false;
		 for (int i = 0; i < c.length; i++) {
			    if (!found && Character.isLetter(c[i])) {
			      c[i] = Character.toUpperCase(c[i]);
			      found = true;
			    } else if (Character.isWhitespace(c[i]) || c[i]=='.' || c[i]=='\'')  
			    { found = false;}
	}
              System.out.println(c);
}
}