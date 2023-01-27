 // Dynamic Polymorphism: overriding
 abstract class Doctor{
     abstract void treatPatient();
 }
 
class Physician extends Doctor{

	@Override
	void treatPatient() {
		System.out.println("Hi! I am Physician \nI treat pateints using Medicines");
		
	}
	
}
class Surgeon extends Doctor{

	@Override
	void treatPatient() {
		System.out.println("Hi! I am Surgeon \nI treat pateints using Surgery");
		
	}
	
}
class Dentist extends Doctor{

	@Override
	void treatPatient() {
		System.out.println("Hi! I am Dentist \nI treat pateints Teeth");
		
	}
}
public class program {
	public static void main(String[] args) {
	     System.out.println("HI! I am Lucy! Receptioninst at Max Care");
	     System.out.println("Who you are looking for ?");
	     System.out.println("Press \n1. Physician \n2. Surgeon \n3. Dentist");
	     
	     int choice = new java.util.Scanner(System.in).nextInt();
	     
	     Doctor doc = null;;
	     
	     switch(choice) {
	     
	     case 1:
	    	 doc = new Physician();
	    	 break;
	     case 2:
	         doc = new Surgeon();
	         break;
	     case 3:
	         doc = new Dentist(); 
	         break;
	     default:
	    	 System.out.println("Oh! Invalid Choice ");
	         break;
	     }
	     
	     if (choice<0 || choice>3) {
	    	 System.exit(0);
	     }
	     else {
	    	 doc.treatPatient();
	     }
	}
}
