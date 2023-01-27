import java.util.Scanner;
public class Test7 {
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter speed: ");
			int speed = sc.nextInt();
			System.out.println("Today is your birthday :");
			boolean isbirhday=sc.nextBoolean();
			
			if(isbirhday==true)
			{
			speed -= 5;
			}
			
			if(speed>80)
			System.out.printf("High ticket");
			else if(speed>=60)
			System.out.printf("Mid ticket");
			else
			System.out.printf("No ticket");
		}
		}
}
