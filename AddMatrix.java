public class AddMatrix{
    public static void main(String[] args) {
            int N=Integer.parseInt(args[0]);
            int[][] matrix1=generateMatrix(N);
            int[][] matrix2=generateMatrix(N);
            int[][] result=add(matrix1,matrix2,N);
            System.out.println("First matrix is ");
            dispMatrix(matrix1, N);
            System.out.println("Second matrix is ");
            dispMatrix(matrix2, N);
            System.out.println("Resultant matrix is ");
            dispMatrix(result, N);
    }
    public static int[][]  generateMatrix(int N){
        int[][] temp=new int[N][N];
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    temp[i][j]=(int)(Math.random()*10);
                }
            }
        return temp;
    }
    public static void dispMatrix(int[][] matirx,int N){
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(matirx[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] add(int[][] matirx1,int[][] matirx2,int N){
        int[][] result=new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                result[i][j]+=matirx1[i][j]+matirx2[i][j];
            }
        }
        return result;
    }
}