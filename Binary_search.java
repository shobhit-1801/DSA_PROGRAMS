import java.util.*;
public class Binary_search {
    public static int search(int num[],int key) {
        int start = 0;  // first index
        int end = num.length - 1; // last index
        while(start<=end){
            int mid = (start+end)/2; // used to check
            // comparsion 
            if(num[mid] == key){
                return mid;
            }
            if(num[mid]>key){ // first half
                end = mid - 1;
            }
            else{ // second half
                start = mid + 1;
            }
        }
        return -1; // when key is not exist 
        
    }
     public static void main(String[] args) {
     Scanner sc = new Scanner(System.in); 
     int marks[] = {1,2,3,4,5};
     int key = 2;
    System.out.println("value is present at index = " +  search(marks, key));
     sc.close();
    }
}