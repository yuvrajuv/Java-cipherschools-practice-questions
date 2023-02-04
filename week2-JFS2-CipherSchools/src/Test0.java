public class Test0 {
     // this keyword
     int arg=5;
     
     Test0() {
    	 System.out.println("Hi! i am default constructor"); 
     }
     
     Test0(int arg) { 
       this(); 
       this.arg=arg;
     }
    public static void main(String[] args) {
        int arg=10;
        Test0 obj = new Test0(10);
            
        System.out.println(obj.arg);
   }
}