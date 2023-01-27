import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("How Long is Your Burp ?");
			int burpLength = sc.nextInt ();
			
			String msg="";
			for (int i=1;i<= burpLength; i++) {
			msg= msg+"r"; // can also be written as msg+="r"
			}
			System.out.println("Bu"+msg+"p");
		}
	}
}