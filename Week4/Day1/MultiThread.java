
import java.util.*;
//Question 1
// class Thread1 extends Thread{
//     public void run(){
//         while (true){
//         System.out.println("Welcome");
//     }
//     }
// }
// class Thread2 extends Thread {
//     public void run() {
//         while (true) {
//             System.out.println("Good morning");
//         }
//     }
// }


//Question 2
class Thread1 extends Thread{
    public void run(){
        try {
            Thread.sleep(200);
    }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Welcome");
    }
}
class Thread2 extends Thread {
    public void run() {
            System.out.println("Good morning");
        }
    }

      public class MultiThread {
        public static void main(String[] args) {
          Thread1 t1= new Thread1();
          Thread2 t2= new Thread2();
          t1.start();
          t2.start();

          
//Question 3
          // t1.setPriority(5);
          // t2.setPriority(1);

          // System.out.println(t1.getPriority());
          // System.out.println(t2.getPriority());


          //questio  4
                  System.out.println(t1.getPriority());
                  System.out.println(t2.getPriority());
                  System.out.println(t2.getState());
         
                  
                  System.out.println(t2.getState());

          //Question 5
                  System.out.println(Thread.currentThread().getState());
        }
      }







