public class test_cases {
    public static void main(String args[]){
        
        //Creating a PascalsTriangle object to use the generate method
        PascalsTriangle obj = new PascalsTriangle();
        
        //Test cases for PascalsTriangle.java
        System.out.println("----Pascal's Triangle Test Cases----");

        System.out.println("Test Case 1: numRows = 1\nExpected:");
        System.out.println("[[1]]\nActual:");
        System.out.println(obj.generate(1));

        System.out.println("\nTest Case 2: numRows = 5\nExpected:");
        System.out.println("[[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]\nActual:");
        System.out.println(obj.generate(5));

        System.out.println("\nTest Case 3: numRows = 7\nExpected:");
        System.out.println("[[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1], [1, 5, 10, 10, 5, 1], [1, 6, 15, 20, 15, 6, 1]]\nActual:");
        System.out.println(obj.generate(7));

        //Test Cases for SpiralMatrix.java
        //Creating a SpiralMatrix object to use the spiralOrder method
        SpiralMatrix obj1 = new SpiralMatrix();
        System.out.println("\n----Spiral Matrix Test Cases----");
        
        int [][] matrix1 = {{}};
        System.out.println("\nTest Case 1: empty matrix\nExpected:");
        System.out.println("[]\nActual:");
        System.out.println(obj1.spiralOrder(matrix1));

        int [][] matrix2 = {{1}};
        System.out.println("\nTest Case 2: {{1}}, 1x1 matrix\nExpected:");
        System.out.println("[1]\nActual:");
        System.out.println(obj1.spiralOrder(matrix2));

        int [][] matrix3 = {{1,2}, {3,4}};
        System.out.println("\nTest Case 3: {{1,2},{3,4}} 2x2 matrix\nExpected:");
        System.out.println("[1, 2, 4, 3]\nActual:");
        System.out.println(obj1.spiralOrder(matrix3));

        int [][] matrix4 = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println("\nTest Case 4: {{1,2,3}, {4,5,6}, {7,8,9}} 3x3 matrix\nExpected:");
        System.out.println("[1, 2, 3, 6, 9, 8, 7, 4, 5]\nActual:");
        System.out.println(obj1.spiralOrder(matrix4));

        int [][] matrix5 = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        System.out.println("\nTest Case 5: {1,2,3,4}, {5,6,7,8}, {9,10,11,12}} 3x4 matrix\nExpected:");
        System.out.println("[1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]\nActual:");
        System.out.println(obj1.spiralOrder(matrix5));

        int [][] matrix6 = {{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}};
        System.out.println("\nTest Case 6: {{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12} 4x3 matrix\nExpected:");
        System.out.println("[1, 2, 3, 6, 9, 12, 11, 10, 7, 4, 5, 8]\nActual:");
        System.out.println(obj1.spiralOrder(matrix6));


    }
}