

import java.util.Scanner;

class MaxRetriesExceededException extends Exception {
    public MaxRetriesExceededException(String message) {
        super(message);
    }
}

// public class ErrorHandling {
//     public static void main(String[] args) {
//         // Problem 1
//         // Syntax Error - int a = 7
//         int age = 78;
//         int year_born = 2000-78; // Logical error
// //        System.out.println(6/0);

//         // Problem 2
//         try{
//             int a = 666/0;
//         }
//         catch (IllegalArgumentException e){
//             System.out.println("HeHe");
//         }
//         catch (ArithmeticException e){
//             System.out.println("Haha");
//         }

//         // Problem 3
//         boolean flag = true;
//         int [] marks = new int[3];
//         marks[0] = 7;
//         marks[1] = 56;
//         marks[2] = 6;
//         Scanner Sc = new Scanner(System.in);
//         int index;
//         int i = 0;
//         while(flag && i<5){
//             try {
//                 System.out.println("Enter the value of index");
//                 index = Sc.nextInt();
//                 System.out.println("The value of marks[index] is " + marks[index]);
//                 break;
//             }
//             catch (Exception e) {
//                 System.out.println("Invalid Index");
//                 i++;
//             }
//         }
//         if(i>=5){
//             System.out.println("Error");
//         }


//     }
// }




//Question 4

// public class ErrorHandling {
//     public static void main(String[] args) {
//         boolean flag = true;
//         int[] marks = {7, 56, 6};
//         Scanner scanner = new Scanner(System.in);
//         int attempts = 0;

//         while (flag && attempts < 5) {
//             try {
//                 System.out.println("Enter the index:");
//                 int index = scanner.nextInt();
//                 if (index < 0 || index >= marks.length) {
//                     throw new IndexOutOfBoundsException();
//                 }
//                 System.out.println("The value of marks[" + index + "] is " + marks[index]);
//                 break; // Exit loop if successful
//             } catch (IndexOutOfBoundsException e) {
//                 System.out.println("Invalid Index");
//                 attempts++;
//             }
//         }

//         if (attempts >= 5) {
//             try {
//                 throw new MaxRetriesExceededException("Max retries exceeded");
//             } catch (MaxRetriesExceededException e) {
//                 System.out.println(e.getMessage());
//             }
//         }
//     }
// }


//Question 5
public class ErrorHandling  {

    public static void main(String[] args) {
        try {
            handleUserInput();
        } catch (MaxRetriesExceededException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void handleUserInput() throws MaxRetriesExceededException {
        boolean flag = true;
        int[] marks = {7, 56, 6};
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;

        while (flag && attempts < 5) {
            try {
                System.out.println("Enter the index:");
                int index = scanner.nextInt();
                if (index < 0 || index >= marks.length) {
                    throw new IndexOutOfBoundsException();
                }
                System.out.println("The value of marks[" + index + "] is " + marks[index]);
                return; // Exit method if successful
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Invalid Index");
                attempts++;
            }
        }

        if (attempts >= 5) {
            throw new MaxRetriesExceededException("Max retries exceeded");
        }
    }
}


