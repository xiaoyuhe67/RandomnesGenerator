import java.util.Random;

public class RandomGenerator{
    public static void main(String[] args)
    {
        output("Generate 10 random integers between 5 and 95");
        Random rnd=new Random();
        
        
        for (int i = 0; i <= 9; i++)
        {
          int randomInt = 5 + rnd.nextInt(95);
          output("Generated number: " + randomInt);
        }
    
        output("Done.");
    }
  
  private static void output(String aMessage)
  {
    System.out.println(aMessage);
  }
}
