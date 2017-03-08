import java.util.Scanner;

public class Sumup1
{
  public static void addSequence(Scanner s)
  {
    int sum = 0;
    int current = s.nextInt();;
    while (current >= 0)
    {
      sum = current + sum;
      current = s.nextInt();
    }
    System.out.println(" "+sum);
  }

  public static void main(String[]argv)
  {
    addSequence(new Scanner(System.in));
  }
}




