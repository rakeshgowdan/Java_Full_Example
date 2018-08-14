final class Bike{  
 final int speedlimit=90;//final variable  
  final void run(){  
  speedlimit=400;  //error
 }  
 public static void main(String args[]){  
 Bike obj=new  Bike();  
 obj.run();  
 }  
}//end of class  