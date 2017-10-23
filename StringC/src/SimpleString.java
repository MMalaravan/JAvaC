public class SimpleString {
 public static void main(String[] args) {
	 
	 String str = "Donky,Monkkey,cat";
	 
	   String[] animals = str.split(",");
	   System.out.println("The number of animals is: " + animals.length);
	   for (String animal : animals) {
	      System.out.println(animal);
	   }
	}
 }

