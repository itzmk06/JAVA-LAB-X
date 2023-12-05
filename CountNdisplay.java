public class CountNdisplay {
    public static void main(String[] args){
        int size=args.length;
        System.out.println("The number of arguments passed :"+size);
        for(int i=0;i<size;i++){
            System.out.println("args["+i+"]="+args[i]);
        }
    }
}
