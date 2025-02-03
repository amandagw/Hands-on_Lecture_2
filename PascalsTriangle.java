import java.util.List;
import java.util.ArrayList;

public class PascalsTriangle {

    public static List<List<Integer>> generate(int numRows){
        //List of lists that will store the triangle
        List<List<Integer>> triangle = new ArrayList<>();

        //Outer for-loop that will iterate numRows times to generate the rows of the triangle
        for (int i = 0; i < numRows; i++){
            //Creating an ArrayList to store the row contents
            List<Integer> row = new ArrayList<>();
            //Inner loop that will iterate i+1 times to fill in row list
            for (int j = 0; j <= i; j++){
                //Adds 1 to the row list if it is the first or last element (edges of triangle)
                if(j == 0 || j == i){
                    row.add(1);
                }

                /*If index is not the first or last, get the elements above on the right and left 
                of the current index, sum them, and add the element to the list. */
                else{
                    int aboveLeft = triangle.get(i-1).get(j-1);
                    int aboveRight = triangle.get(i-1).get(j);
                    int sum = aboveLeft + aboveRight;
                    row.add(sum);
                }
            }
            //Add the row to the triangle
            triangle.add(row);
        }
        return triangle;
    }


}