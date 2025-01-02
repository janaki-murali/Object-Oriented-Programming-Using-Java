/*To write a java program to multiply two matrices.*/

import java.util.Scanner;

public class Matrix_multiplication {
    public static void main(String[] args) {
        int m1, n1, m2, n2, i, j, k;
        System.out.println("Enter order of 1st matrix (rows and columns): ");
        Scanner scanner = new Scanner(System.in);
        m1 = scanner.nextInt();
        n1 = scanner.nextInt();
        
        System.out.println("Enter order of 2nd matrix (rows and columns): ");
        m2 = scanner.nextInt();
        n2 = scanner.nextInt();

        if (n1 != m2) {
            System.out.println("Multiplication not possible");
            return;
        }

        int[][] a = new int[m1][n1];
        int[][] b = new int[m2][n2];
        int[][] c = new int[m1][n2];

        System.out.println("Enter the elements of first matrix: ");
        for (i = 0; i < m1; i++) {
            for (j = 0; j < n1; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter the elements of second matrix: ");
        for (i = 0; i < m2; i++) {
            for (j = 0; j < n2; j++) {
                b[i][j] = scanner.nextInt();
            }
        }

        for (i = 0; i < m1; i++) {
            for (j = 0; j < n2; j++) {
                c[i][j] = 0;
                for (k = 0; k < n1; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Product is: ");
        for (i = 0; i < m1; i++) {
            for (j = 0; j < n2; j++) {
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
