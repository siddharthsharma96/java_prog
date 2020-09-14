class example_this {
    //instance variable num
    int num=10;
    example_this(){
        System.out.println("this si an exaple of instance keyword");
    }
    example_this(int num){
        //invoking the default constructor
        this();
        // assigning the local variable num  to instance variable num
        this.num=num;
    }
    public void greet(){
        System.out.println("hello from siddharth side");
    }
    public void print(){
        //loacal variable
        int num=20;
        //printing the local variable
        System.out.println("local variable num "+num);
        //printing the instance variable
        System.out.println("instance variable num "+this.num);
        // Invoking the greet method of a class
        this.greet();
    }
    public static void main(String[] args){
        // instatiating the class
        example_this t=new example_this();
        t.print();
        example_this t1=new example_this(30);
        t1.print();
    }

}