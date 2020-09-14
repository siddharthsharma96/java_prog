public class varargs{
    public static void main(String[] args){
        // call method variable args
        printMax(30,45,63,25,14,58,96);
        printMax(new double[]{4.5,6.3,6.9,10.2});
    }
    public static void printMax(double... no){
        if(no.length == 0){
            System.out.println("no argument passed");
            return;
        }
        double result=no[0];
        for (int i = 1; i <  no.length; i++){
            if (no[i] >  result){
                result = no[i];
            }
        }
        System.out.println("The max value is " + result);
    }
}