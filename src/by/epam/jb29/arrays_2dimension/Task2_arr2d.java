package by.epam.jb29.arrays_2dimension;

/**
 * 2. Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из [0, 9].
 */
public class Task2_arr2d {
    public static void main(String[]args){
        int[][] arr_2d = new int[2][3];
        for (int i = 0;i<2;i++){
            for (int j = 0;j<3;j++){
                arr_2d[i][j] = (int)(Math.random()* 10);
                System.out.print(arr_2d[i][j] + " ");
            }System.out.println();
        }
    }
}
