import java.util.*; // vvvv important question (find maximum sub_array sum ) -->
public class max_sub_array{
     // brute force solution(unoptimized) time complexity O(n cube) --->
     public static void max_sum(int numbers[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i = 0 ; i<numbers.length; i++){ // start of sub_array 
            for(int j = i; j<numbers.length; j++){ // end of sub_array
                cs = 0;
                for(int k = i; k<=j ; k++){ // calculating current_sum
                    cs = cs + numbers[k];
                }
                if(cs>ms){
                    ms = cs;
                }
            }
        }

        System.out.println("max sub_array Sum = " + ms);
        
     }

     // prefix method (optimized solution ) --> Time complexity O(n square)
     public static void prefix(int nums[]) {
        int ms = Integer.MIN_VALUE; // comparison  
        int cs = 0;
        int prefix_array[] = new int[nums.length];
        prefix_array[0] = nums[0];
        // calculating prefix array (Helping array)
        for(int i =1; i<prefix_array.length; i++){
            prefix_array[i] = prefix_array[i-1] + nums[i]; 
        }
        // start of sub_array
        for(int i= 0; i<nums.length; i++){
            // end of the sub_array
            for(int j =1; j<nums.length; j++){
                // calculating current sum 
                if(i==0){
                    cs = prefix_array[j];
                }
                else{
                    cs = prefix_array[j] - prefix_array[i -1];
                }
                if(cs>ms){
                    ms = cs;
                }

            }
        }
       
        System.out.println("max sub_array Sum = " + ms);   
     }
     // KADANES ALGORITHM ( highly optimized solution with time complexity of O(n) to find max sub_array Sum)
     public static void kadanes_algorithm(int nums[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int j= 0; j<nums.length; j++){
            cs = cs + nums[j];
            if(cs<0){
                cs = 0;
            }
            ms = Math.max(ms, cs);
        }
        
        System.out.println("max sub_array Sum = " + ms); 
              
     }

     public static void main(String[] args) {
     Scanner sc = new Scanner(System.in); 
     int marks[] = {1,-2,6,-1,3};
     max_sum(marks);
     prefix(marks);
     kadanes_algorithm(marks);
     int numbers[] = {-1,-2,-3,-4,-5};
     kadanes_algorithm(numbers);
     sc.close();   
    }
}