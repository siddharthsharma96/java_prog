class cal{
    int z;

    public void add(int x , int y){
        z=x+y;
        System.out.println("the value of sum is :" +z);
    }
    public void sub(int x , int y){
        z=x-y;
        System.out.println("the value of sub is :" +z);
    }
      
}
public class inherit1  extends cal{
    public void mul(int x , int y){
        z=x*y;
        System.out.println("the value of mul is :" +z);
    } 
    public static void main(String[] args){
        int a =30,b=20;
        inherit1 calc=new inherit1();
        calc.add(a,b);
        calc.sub(a,b);
        calc.mul(a,b);
    }

} 