import java.util.Scanner;
public class TaskFive{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
     
     int sum = 0;
     for(int counter =1; counter<=10; counter++){
     System.out.print ("Enter 10 score: ");
     
     int score = input.nextInt();
     if (score>=0&&score<=100&&score%2==0) {  
     sum +=score;
     
     }
     }
     System.out.println("sum = " + sum);
     }
     }
