public class ForExample {  
public static void main(String[] args) {  
	
	
	//for loop
    for(int i=1;i<=10;i++){  
        System.out.println(i);  
    }  
   //for each
    int arr[]={12,23,44,56,78};  
    for(int i:arr){  
        System.out.println(i);  
    }  
    
     //while
    int x=1;  
    while(x<=10){  
        System.out.println(x);  
    x++;  
    }  
    
    //do-while
    int j=1;  
    do{  
        System.out.println(j);  
    j++;  
    }while(j<=10);  

    //infinite loop
    for(;;){  
        System.out.println("infinitive loop");  
    }  
     
}  
}  