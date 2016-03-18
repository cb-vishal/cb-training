import java.io.*;
import java.util.*;
public class Rotate90degree {


        public static void reverseElementsRowWise(int[][] matrix) {
            int n = matrix.length;
            for(int i = 0; i < n; ++i) {
                for(int j = 0; j < n / 2; ++j) {
                    int temp = matrix[i][n - j - 1];
                    matrix[i][n - j - 1] = matrix[i][j];
                    matrix[i][j] = temp;
                }
            }
        }

public static void reverseElementsColWise(int[][] matrix) {
            int n = matrix.length;
            for(int i = 0; i < n; ++i) {
                for(int j = 0; j < n/2 ; ++j) {
                    int temp = matrix[n - j - 1][i];
                    matrix[n - j - 1][i] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }

        public static void transpose(int[][] matrix) {
            int n = matrix.length;
            for(int i = 0; i < n; ++i) {
                for(int j = i + 1; j < n; ++j) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }

        public static void rotateRight(int[][] matrix) {
            transpose(matrix);
            reverseElementsRowWise(matrix);
        }
        public static void rotateLeft(int[][] matrix) {
            transpose(matrix);
            reverseElementsColWise(matrix);
        }

        public static void print(int[][] matrix) {
            int n = matrix.length;
            for(int i = 0; i < n; ++i) {
                for(int j = 0; j < n; ++j) {
                    System.out.print(matrix[i][j]);
                    System.out.print(' ');
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            int[][] matrix = {
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16}};
            System.out.println("1.RotateLeft"); 
            System.out.println("2.RotateRight");
            System.out.println("3.Exit");
            Scanner s=new Scanner(System.in);
            int ch=s.nextInt();
             switch(ch)
             {
            case 1:
            System.out.println("before");
            print(matrix);
            rotateLeft(matrix);
            System.out.println("after");
            print(matrix);
            break;
            case 2:
            System.out.println("before");
            print(matrix);
            rotateRight(matrix);
            System.out.println("after");
            print(matrix);
            break;
           case 3:
              System.exit(0);
          }
        }
}