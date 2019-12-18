
package by.epam.pre_mentoring.matrix;


/**
 * Multiply matrices (Перемножить матрицы)
 */


public class MultiplyMatrix {
    public static void main(String[]args){

        int [][] matrix1 = new int[5][5];
        int [][] matrix2 = new int[5][5];
        int [][] matrix3 = new int[5][5];


        System.out.println("Matrix 1:");

        for (int i = 0;i<matrix1.length;i++){
            for (int j = 0;j<matrix1[0].length;j++){
                matrix1[i][j] = (int)(Math.random() * 10);
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matrix 2: ");

        for (int i = 0;i<matrix2.length;i++){
            for (int j = 0;j<matrix2[0].length;j++){
                matrix2[i][j] = (int)(Math.random() * 10);
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matrix 3: ");
        int mult;

        for (int i = 0;i<matrix3.length;i++){
            for (int j = 0;j<matrix3.length;j++){
                mult = matrix1[i][j] * matrix2[i][j];
                matrix3[i][j] = mult;
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println();
        }


    }
}

