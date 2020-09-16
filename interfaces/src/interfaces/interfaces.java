package interfaces;

interface Animal {
	   public void eat();
	   public void travel();
	}

public class interfaces implements Animal {

	   public void eat() {
	      System.out.println("Mammal eats");
	   }

	   public void travel() {
	      System.out.println("Mammal travels");
	   } 

	   public int noOfLegs() {
	      return 0;
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interfaces m = new interfaces();
	      m.eat();
	      m.travel();
	}

}
