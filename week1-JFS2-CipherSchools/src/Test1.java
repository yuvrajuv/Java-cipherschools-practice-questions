import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter any number !");
			int num= sc.nextInt();
			if (num>0){
			System.out.println("+ve");
			}
			else if (num==0) {
			System.out.println("Neutral");
			}
			else {
			System.out.println("-ve");
			}
		}
	}
}