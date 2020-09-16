package abstractClass;
//import abstractClass;
abstract class abs {
	protected String name;
	protected int numberOfStrings;
	abstract public void play();
}

class abstractClass extends abs {
	public abstractClass() {
        super();
        this.name = "Guitar";
        this.numberOfStrings = 6;
   }

   public abstractClass(int numberOfStrings) {
        super();
        this.name = "Guitar";
        this.numberOfStrings = numberOfStrings;
   }

   @Override
   public void play() {
        System.out.println("An electric sid" + numberOfStrings + "-string " + name
              + " is rocking!");
   }
}
public class Abstract1 extends abstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abstractClass a=new abstractClass();
		a.play();
	}

}
