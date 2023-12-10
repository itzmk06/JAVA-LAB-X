// add two matrix  using -> Scanner class
import java.util.*;
public class new1AddMatrix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter order:");
        int n=sc.nextInt();
        //declaring 2D matix
        int[][] matrix1=new int[n][n];
        int[][] matrix2=new int[n][n];
        //input for matrix 1
        System.out.println("Enter matrix 1 : "+n*n+" elements:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix1[i][j]=sc.nextInt();
            }
        }
        //input for second matrix
        System.out.println("Enter matrix 2 : "+n*n+" elements:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix2[i][j]=sc.nextInt();
            }
        }
        //calculating sum of these matrix 
        int[][] matrix=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        //displaying the summed matrix
        System.out.println("The sum of two matrix: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}


