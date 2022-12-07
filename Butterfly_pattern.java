import java.util.*;
public class Butterfly_pattern {
     public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = 5;
     // first half 
     for(int i = 1; i<=n; i++){
        for(int j =1; j<=i; j++){  // stars 
            System.out.print("*");
        }
        for(int j = 1; j<= 2*(n-i); j++){ // spaces 
            System.out.print(" ");
        }
        for(int j =1; j<=i; j++){ // stars 
            System.out.print("*");
        }

        System.out.println();
        
     }
     // 2nd half (mirror image of first half )
     for(int i = n ; i>=1; i--){ // reverse condition 
        for(int j =1; j<=i; j++){
            System.out.print("*");
        }
        for(int j = 1; j<= 2*(n-i); j++){
            System.out.print(" ");
        }
        for(int j =1; j<=i; j++){
            System.out.print("*");
        }  
        System.out.println(32);
     } 

     sc.close();

     
    }
}
