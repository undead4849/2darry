
import java.util.Random;
import java.util.Scanner;

public class test {
    private static int column;
    private static int row;
    private static int temp;

    public static void moveRow(int[][] arry, int a) {
        for (int i = 0; i < column - 1; i++)
            for (int j = 0; j < column - 1; j++)
                if (arry[a][j] > arry[a][j + 1]) {
                    for (int k = 0; k < row; k++) {
                        temp = arry[k][j + 1];
                        arry[k][j + 1] = arry[k][j];
                        arry[k][j] = temp;
                    }
                }
    }

    public static void moveColumn(int[][] arry, int a) {
        for (int i = 0; i < row - 1; i++)
            for (int j = 0; j < row - 1; j++)
                if (arry[j][a] > arry[j + 1][a]) {
                    for (int k = 0; k < column; k++) {
                        temp = arry[j + 1][k];
                        arry[j + 1][k] = arry[j][k];
                        arry[j][k] = temp;
                    }
                }
    }

    //##########################################################################################
    public static void main(String[] args) {
        Random r = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("inter a row:");
        row = input.nextInt();
        System.out.println("inter column:");
        column = input.nextInt();
        int[][] arry = new int[row][column];
        for (int i = 0; i < row; i++)
            for (int j = 0; j < column; j++) {
                arry[i][j] = r.nextInt(100);
            }
        //#########################################################################################
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arry[i][j] + "\t");
            }
            System.out.println();
        }
        while (true) {
            int cas;
            int in;
            int in1;
            System.out.println("inter 1 to move row");
            System.out.println("inter 2 to move column");
            cas = input.nextInt();
            switch (cas) {
                case 1:
                    System.out.println("inter your number:");
                    in = input.nextInt();
                    moveRow(arry, in);
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < column; j++) {
                            System.out.print(arry[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    ;
                    break;


                case 2:
                    System.out.println("inter your number:");
                    in1 = input.nextInt();
                    moveColumn(arry, in1);
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < column; j++) {
                            System.out.print(arry[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    ;
                    break;

                default:
                    System.out.println("the number is not correct");

            }
        }
    }
}