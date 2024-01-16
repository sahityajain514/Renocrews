import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the 5 subject marks out of 100");
    int sub1=sc.nextInt();
    int sub2=sc.nextInt();
    int sub3=sc.nextInt();
    int sub4=sc.nextInt();
    int sub5=sc.nextInt();
    int total=sub1+sub2+sub3+sub4+sub5;
    float per=(total*100)/500;
    System.out.println("percentage of a student is "+per+"%");
  }

  
}
