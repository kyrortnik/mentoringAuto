package by.epam.jb29.arrays_2dimension;

/**
 * 4. Дана матрица. Вывести на экран первую и последнюю строки.
 */
public class Task4_arr2d {
    public static void main(String[]args){
        int[][] arr_2d = new int[5][6];
        System.out.println("The whole array:");
        for (int i = 0;i<arr_2d.length;i++){
            for (int j = 0;j<arr_2d[0].length;j++){
                arr_2d[i][j] = (int)(Math.random()* 10);
                System.out.print(arr_2d[i][j]+ " ");
            }System.out.println();
        }
        System.out.println("array's first row:");
        for (int g = 0;g<arr_2d.length+1;g++){
            System.out.print(arr_2d[0][g]+ " ");
        }
        System.out.println();
        System.out.println("array's last row:");
        for (int k = 0;k<arr_2d.length+1;k++){
            System.out.print(arr_2d[arr_2d.length-1][k]+ " ");
        }
        System.out.println();
    }
}
