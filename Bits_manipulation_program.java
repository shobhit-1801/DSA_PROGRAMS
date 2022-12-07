import java.util.*;
public class Bits_manipulation_program {
    // program to check a integer is even or odd 
    public static void check_even_odd(int n) {
        int bitmask  = 1;
        if(((n & bitmask) == 0)){
            // even
            System.out.println(n + " is even number");
        }

        else {
            // odd
            System.out.println(n + " is odd number");

        }
        
    }
    // get ith bit of an integer 
    public static int get_ith_bit(int n , int i) {
        int bitmask = 1<<i;
        if((n & bitmask) == 0){
            return 0; 
        }
        else {
            return 1;
        }
        
    }
    // set ith bit of an integer 
    public static int set_ith_bit(int n , int i) {
        int bitmask = 1<<i;
        return (n|bitmask);
        
    }
    // clear ith bit of an integer 
    public static int clear_ith_bit(int n , int i) {
        int bitmask = ~(1<<i);
        return (n &  bitmask);
        
    }
     public static void main(String[] args) {
     Scanner sc = new Scanner(System.in); 
     check_even_odd(31);
     check_even_odd(24);
     System.out.println(get_ith_bit(10, 3));
     System.out.println(set_ith_bit(10, 2));
     System.out.println(clear_ith_bit(10, 1));
     sc.close();
     
    }
}