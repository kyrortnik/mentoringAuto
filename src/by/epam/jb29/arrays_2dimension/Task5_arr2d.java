package by.epam.jb29.arrays_2dimension;

/**
 * 5. Дана матрица. Вывести на экран все четные строки, то есть с четными номерами.
 */
public class Task5_arr2d {
    public static void main(String[]args){
        int[][] arr_2d = new int[5][6];
        System.out.println("The whole array:");
        for (int i = 0;i<arr_2d.length;i++){
            for (int j = 0;j<arr_2d[0].length;j++){
                arr_2d[i][j] = (int)(Math.random()* 10);
                System.out.print(arr_2d[i][j]+ " ");
            }System.out.println();
        }
        System.out.println("Rows with even index:");
        for (int k = 0;k<arr_2d.length;k++){
            for (int f = 0; f<arr_2d[0].length;f++){
                if (k%2 == 0 && k != 0){
                    System.out.print(arr_2d[k][f] + " ");
                }
            }System.out.println();

        }
    }
}
