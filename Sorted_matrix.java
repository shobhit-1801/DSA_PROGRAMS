import java.util.*; // optimized soln to find an elelmet in an array but array must be sorted row wise or column wise(staircase method)
public class Sorted_matrix {
    public static boolean search(int matrix[][] , int key) { // time complexity is O(n + m)
        int i = matrix.length - 1;
        int j = 0;
        while((i>=0) && j<matrix[0].length){
            if(matrix[i][j] == key){
                System.out.println("key is found at " + "(" + i + "," + j + ")" + "cell");
                return true;
            }
            else if(key>matrix[i][j]){
                j++;
            }
            else{
                i--;
            }            
        }

        System.out.println("key not found ");
        return false;
        
    }
     public static void main(String[] args) {
     Scanner sc = new Scanner(System.in); 
     int nums[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
     int value = 4;
     search(nums, value);
     sc.close();
    }
}