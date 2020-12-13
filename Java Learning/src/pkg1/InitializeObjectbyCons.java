package pkg1;

public class InitializeObjectbyCons {
	 private String name;
	   int population;

	   InitializeObjectbyCons(String name, int population)
	   {
	      this.name = name;
	      this.population = population;
	   }

	   @Override
	   public String toString()
	   {
	      return name + ": " + population;
	   }

	   public static void main(String[] args)
	   {
		   InitializeObjectbyCons newYork = new InitializeObjectbyCons("New York", 8491079);
	      System.out.println(newYork); 
	      // Output: New York: 8491079
	   }
	}


