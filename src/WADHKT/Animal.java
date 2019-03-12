package WADHKT;

public class Animal {
	
		   private String name;
		   public Animal(String name) {
		       this.name = name;
		   }
		   
		   public Animal(){
			   System.out.println("Animal constructer Called");
		   }
		    
		  public String speak() {
		      return "";
		  }
		  public void display() {
		      System.out.println("My name is " + this.name + ".  " + this.speak() + ".");
		  }
		}

