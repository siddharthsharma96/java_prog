public class overload{
    public static void main(String[] args){
        int a =10;
        int b=23;
        double c=7.8;
        double d=9.2;
        int result1=minFunction(a,b);
        double result2=minFunction(c,d);
        System.out.println("result "+ result1);
        System.out.println("result 2 "+result2);

    }
    public static int minFunction(int a1, int b1){
        int min;
        if(a1>b1){
            min=b1;
        }else{
            min=a1;
        }
        return min;
    }
    public static double minFunction(double a2, double b2){
        double min;
        if(a2>b2){
            min = b2;
        }else{
            min = a2;
        }
        return min;
    }
}