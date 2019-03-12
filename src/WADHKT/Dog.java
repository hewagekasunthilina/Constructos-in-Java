package WADHKT;

public class Dog extends Animal {
	
		   public Dog(String name) {
		      super(name);
		   }
		   
		   public Dog(){
			   System.out.println("Dog constructer Called");
		   }
		   
		   public String speak() {
		       return "Bow Wow";
		   }
		}

