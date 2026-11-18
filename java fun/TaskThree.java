import java.util.Scanner;
public class TaskThree{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
     
   System.out.print("Enter first score: ");
     int score1 = input.nextInt();
     
   System.out.print("Enter second score: ");
     int score2 = input.nextInt();
     
   System.out.print("Enter third score: ");
     int score3 = input.nextInt();
     
   System.out.print("Enter fourth score: ");
     int score4 = input.nextInt();
     
   System.out.print("Enter fifth score: ");
     int score5 = input.nextInt();
     
   System.out.print("Enter sixth score: ");
     int score6 = input.nextInt();
     
   System.out.print("Enter seventh score: ");
     int score7 = input.nextInt();
     
   System.out.print("Enter eighth score: ");
     int score8 = input.nextInt();
     
   System.out.print("Enter ninth score: ");
     int score9 = input.nextInt();
     
   System.out.print("Enter tenth score: ");
     int score10 = input.nextInt();
     
     int sum =  score1 + score2 + score3 + score4 + score5 + score6 + score7 + score8 + scorer9 + score10;
     
     int average = (score1 + score2 + score3 + score4 + score5 + score6 + score7 + score8 + scorer9 + score10) / 10;
     
   System.out.println( "The sum score" + sum );
   System.out.println( "The average score" + average );
    
    }
}
