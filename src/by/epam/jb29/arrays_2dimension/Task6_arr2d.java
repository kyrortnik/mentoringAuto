package by.epam.jb29.arrays_2dimension;

/**
 * 6. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше
 * последнего
 */
public class Task6_arr2d {
    public static void main(String[]args) {
        int[][] arr_2d = new int[7][10];
        int[][] temp = new int[arr_2d.length][arr_2d[0].length];
        System.out.println("The whole array:");
        for (int i = 0; i < arr_2d.length; i++) {
            for (int j = 0; j < arr_2d[0].length; j++) {
                arr_2d[i][j] = (int) (Math.random() * 10);
                System.out.print(arr_2d[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Columns with odd index:");
        for (int k = 0;k<arr_2d.length;k++){
            for (int f = 0; f<arr_2d[0].length;f++){
                if (f%2 != 0 && f != 0){
                    if (arr_2d[0][f] > arr_2d[arr_2d.length-1][arr_2d[0].length-1])
                    System.out.print(arr_2d[k][f] + " ");
                }else {
                    System.out.println("No such rows!");
                    continue;
                }
            }System.out.println();

        }
    }
}

