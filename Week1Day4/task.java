//Rock paper scissor game
import java.util.*;
class Main {
  public static void main(String[] args) {
   Random rm=new Random();
    int max=3,min=1;
    int a=rm.nextInt(max-min+1)+min;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your choice ");
    System.out.println("1. For Rock \n2. For Paper \n3. For Scissor");
    int choice=sc.nextInt();
    
    if(choice >3){
      System.out.println("you choice is invalid");
    }
    else{
      if(choice==a){
        System.out.println("Draw both chose same");
    }
      else if(choice==1 && a==2){
        System.out.println("Computer wins because it chose paper");

      }
      else if(choice==1 && a==3){
        System.out.println("You win because chose rock");
      }
      else if(choice==2 && a==1){
        System.out.println("You win because computer choses rock");
      }
      else if(choice==2 && a==3){
        System.out.println("Computer wins because it chose scissor");
      }
      else if(choice==3 && a==1){
        System.out.println("Computer wins because it chose rock");
      }
      else if(choice==3 && a==2){
        System.out.println("You win because computer chose paper");
      }
      else if(choice==1 && a==2){
        System.out.println("Computer wins because it chose paper");
      }
     
    }
    
  }

  
}
