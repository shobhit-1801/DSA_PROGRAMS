import java.util.*;  // package containing scanner classs --->
public class basic {  // wap to accept any number n and print sum of square of all no from 1 to n --->
     public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter number ");
     int num = sc.nextInt();
     double sum = 0;
     while(num!=0){
        sum = sum + Math.pow(num, 2);
        num = num - 1;
     }
     System.out.println("Sum of square from 1 to " + num + " is = " + sum);
     sc.close(); 
     
    }
}