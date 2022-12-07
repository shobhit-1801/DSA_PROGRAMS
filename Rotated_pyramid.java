import java.util.*;
public class Rotated_pyramid {
     public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = 5; // no of rows 
     System.out.println();
     for(int i =1; i<=(2*n-1); i++){    
        if(i>n){
            for(int j = (2*n -i); j>0; j--){ // right half 
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        else{
            for(int j =1; j<=i; j++){ // left half  
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        
     }
     System.out.println();
     sc.close();
     
    }
}