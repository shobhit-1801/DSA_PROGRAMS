import java.util.*;
public class Spiral_matrix {
    public static void print_spiral(int matrix[][]) {
        int start_row = 0;
        int start_coln = 0;
        int end_row = matrix.length - 1;
        int end_coln = matrix[0].length -1;
        while(start_row<=end_row && start_coln<=end_coln){
            // top
            for(int j = start_coln; j<=end_coln; j++){
                System.out.print(matrix[start_row][j] + " ");
            }
            // right
            for(int i = start_row + 1; i<=end_row; i++){
                System.out.print(matrix[i][end_coln] + " ");
            }
            // bottom
            for(int j = end_coln - 1; j>=start_coln; j--){
                if(start_row == end_row){
                    break;
                }
                System.out.print(matrix[end_row][j] + " ");
            }
            // left
            for(int i = end_row - 1; i>=start_row + 1; i--){
                if(start_coln == end_coln){
                    break;
                }
                System.out.print(matrix[i][start_coln] + " ");
            }
            start_row++;
            start_coln++;
            end_row--;
            end_coln--;
            

        }
        
    }
     public static void main(String[] args) {
     Scanner sc = new Scanner(System.in); 
     int Spiral_matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
     print_spiral(Spiral_matrix);
     sc.close();
     
    }
}