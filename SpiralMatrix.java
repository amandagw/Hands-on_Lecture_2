import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix){
        //Create the variables to keep track of the row & column indexes
        int rowStart = 0;
        //index of last row (num rows-1) = matrix length - 1
        int rowEnd = matrix.length -1;
        int colStart = 0;
        //index of last element in row (num cols-1) = matrix length - 1
        int colEnd = matrix[0].length - 1;

        //Store the traversal in an array list
        List<Integer> result = new ArrayList<>();

        if(matrix.length ==0){
            return result;
        }

        while (rowStart <= rowEnd && colStart <= colEnd){
            //Traverse the matrix right (row) by changing column index
            for (int i = colStart; i <= colEnd; i++){
                result.add(matrix[rowStart][i]);
            }
            rowStart++; //move down a row

            //Traverse the matrix down (column) by changing row index
            for (int i = rowStart; i <= rowEnd; i++){
                result.add(matrix[i][colEnd]);
            }
            colEnd--; //decrease the column index

            //Traverse left if there is still a row left by changing column index
            if(rowStart <= rowEnd){
                for(int i = colEnd; i >= colStart; i--){
                    result.add(matrix[rowEnd][i]);
                }
                rowEnd--;
            }

            //Traverse up if there is still a column left by changing row index
            if(colStart <= colEnd){
                for(int i = rowEnd; i >= rowStart; i--){
                    result.add(matrix[i][colStart]);
                }
                colStart++;
            }

        }
        return result;
    }

    public static void main(String args[]){
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println(spiralOrder(matrix));
        int[][] matrix2 = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        System.out.println(spiralOrder(matrix2));
    }
}