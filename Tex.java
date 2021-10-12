package exercise;

public class Tex {
	   public Tex() throws InterruptedException {
	      System.out.println("Preparing an Object");
	      Thread.sleep(1000);
	      System.out.println("Object is ready");
	   }
	   public static void main(String args[]) {
	      try {
	    	  Tex test = new Tex();
	      } catch (InterruptedException e) {
	         System.out.println("Got interrupted...");
	      }
	   }
	}
