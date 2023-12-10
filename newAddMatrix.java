// add two matrix ->command line args (if they ask to take both n and elements using args)
public class newAddMatrix {
    public static void main(String[] args){
        int n=Integer.parseInt(args[0]);
        //to keep track of index of elements in args
        int count=0;
        //declaring 2D matix
        int[][] matrix1=new int[n][n];
        int[][] matrix2=new int[n][n];
        //input for matrix 1
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix1[i][j]=Integer.parseInt(args[++count]); // traverse each each index array from 1 (++count ->increment first then use)
            }
        }
        //input for second matrix
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix2[i][j]=Integer.parseInt(args[++count]); // resumes from where count was passed!
            }
        }
        //calculating sum of these matrix 
        int[][] matrix=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        //displaying matrix1
        System.out.println("First matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();
        }
        //displaying second matrix
        System.out.println("Second matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix2[i][j]+" ");
            }
            System.out.println();
        }
        //displaying the summed matrix
        System.out.println("Sum of two matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }#include <stdio.h>

    struct ExampleStruct {
        char charArray[10];
        float floatNumber;
        int intNumber;
    };
    
    int main() {
        struct ExampleStruct myStruct;
    
        // User provides values for some members
        myStruct.floatNumber = 3.14;
        myStruct.intNumber = 42;
    
        // Note: No value provided for charArray
    
        // Access and print the values
        printf("Char Array: %s\n", myStruct.charArray);  // Will print an empty string (null-terminated)
        printf("Float Number: %f\n", myStruct.floatNumber);
        printf("Int Number: %d\n", myStruct.intNumber);
    
        return 0;
    }
    
}


