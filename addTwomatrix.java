//adding two matrix (if they ask to take only n from args)
public class addTwomatrix{
    public static void main(String[] args) {
        int N=Integer.parseInt(args[0]);
        int[][]  matrix1=new int[N][N];
        int[][] matrix2=new int[N][N];
        matrix1=createMatrix(N);
        matrix2=createMatrix(N);
        int[][] result=Add(matrix1,matrix2,N);
        System.out.println("The first matrix is ");
        disp(matrix1,N);
        System.out.println("The second matrix:");
        disp(matrix2,N);
        System.out.println("The result of addition:");
        disp(result,N);
    }
    public static int[][] createMatrix(int N){
        int[][] matrix=new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                matrix[i][j]=(int )(Math.random()*10);
            }
        }
        return matrix;
    }
    public static int[][] Add(int[][] matrix1,int[][] matrix2,int N){
        int[][] result=new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                result[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        return result;
    }
    public static void disp(int[][] matrix,int N){
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}