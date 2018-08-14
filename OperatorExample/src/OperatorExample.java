class OperatorExample{  
public static void main(String args[]){  
	
//unary ++,--	
int x=10;  
System.out.println(x++);//10 (11)  
System.out.println(++x);//12  
System.out.println(x--);//12 (11)  
System.out.println(--x);//10  


//unary !,~
int a=10;  
int b=-10;  
boolean c=true;  
boolean d=false;  
System.out.println(~a);//-11 (minus of total positive value which starts from 0)  
System.out.println(~b);//9 (positive of total minus, positive starts from 0)  
System.out.println(!c);//false (opposite of boolean value)  
System.out.println(!d);//true  

//arithmetic operator
int p=10;  
int q=5;  
System.out.println(p+q);//15  
System.out.println(p-q);//5  
System.out.println(p*q);//50  
System.out.println(p/q);//2  
System.out.println(p%q);//0 

//left shift operator
System.out.println(10<<2);//10*2^2=10*4=40  
System.out.println(10<<3);//10*2^3=10*8=80  
System.out.println(20<<2);//20*2^2=20*4=80  
System.out.println(15<<4);//15*2^4=15*16=240  

//right shift
System.out.println(10>>2);//10/2^2=10/4=2  
System.out.println(20>>2);//20/2^2=20/4=5  
System.out.println(20>>3);//20/2^3=20/8=2  

//>> vs >>>
//For positive number, >> and >>> works same  
System.out.println(20>>2);  
System.out.println(20>>>2);  
//For negative number, >>> changes parity bit (MSB) to 0  
System.out.println(-20>>2);  
System.out.println(-20>>>2);  

//&& ,&

int r=10;  
int s=5;  
int t=20;  
System.out.println(r<s&&r<t);//false && true = false  
System.out.println(r<s&r<t);//false & true = false  


// ||,|
int m=10;  
int n=5;  
int o=20;  
System.out.println(m>n||m<o);//true || true = true  
System.out.println(m>n|m<o);//true | true = true 

int i=2;  
int j=5;  
int min=(i<j)?i:j;  
System.out.println(min); 
}
}