package by.epam.jb29.arrays_2dimension;

/**
 * Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной строке была ровно одна единица,
 * и вывести на экран.
 */
public class Task1_arr2d {
    public static void main(String[]args){
        int[][] arr_2d = {{1,0,0,0},{0,1,0,0},{0,0,1,0}};
        for (int i = 0;i<3;i++){
            for (int j = 0;j<4;j++){
                System.out.print(arr_2d[i][j]+" ");
            }
            System.out.println();
        }
    }
}
