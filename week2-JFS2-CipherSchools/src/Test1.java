 class App{
      
	 App() {
		 System.out.println("Constructor of App");
	 }
}
 public class Test1 extends App{
	 Test1() {
       System.out.println("Constructor of Test2");
    }
    public static void main(String[] args) {
         new Test1();
   }
}