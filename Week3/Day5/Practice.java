// // Package declaration

//problem 1
// package calculatorPackage;

// // Calculator class
// public class Calculator {
//     public int add(int a, int b) {
//         return a + b;
//     }

//     public int subtract(int a, int b) {
//         return a - b;
//     }

//     public int multiply(int a, int b) {
//         return a * b;
//     }

//     public int divide(int a, int b) {
//         if (b != 0) {
//             return a / b;
//         } else {
//             System.out.println("Cannot divide by zero.");
//             return 0;
//         }
//     }
// }

// // ScientificCalculator class
// public class ScientificCalculator {
//     public double squareRoot(double a) {
//         if (a >= 0) {
//             return Math.sqrt(a);
//         } else {
//             System.out.println("Cannot calculate square root of a negative number.");
//             return 0;
//         }
//     }

//     public double power(double base, double exponent) {
//         return Math.pow(base, exponent);
//     }

//     public double sine(double angle) {
//         return Math.sin(angle);
//     }
// }

// // HybridCalculator class inheriting from Calculator and ScientificCalculator
// public class HybridCalculator extends Calculator implements ScientificCalculator {
//     @Override
//     public double squareRoot(double a) {
//         // Additional implementation or customization for square root in HybridCalculator
//         return Math.sqrt(Math.abs(a)); // Ensures positive result
//     }

//     @Override
//     public double power(double base, double exponent) {
//         // Additional implementation or customization for power in HybridCalculator
//         return Math.pow(base, exponent);
//     }

//     @Override
//     public double sine(double angle) {
//         // Additional implementation or customization for sine in HybridCalculator
//         return Math.sin(Math.toRadians(angle)); // Converts angle to radians
//     }
// }


//problem 2
// import java.util.*;
// public class Practice{
//   public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter any string");
//     String st=sc.nextLine();
//     System.out.println("enterd string is "+st);
//     // Create an instance of HybridCalculator
//   }
// }

//problem 3
// Class in the folderL2 package
// package folder.folderL1.folderL2;

// public class ExampleClass {
//     public void displayMessage() {
//         System.out.println("Hello from ExampleClass in folder.folderL1.folderL2 package!");
//     }
// }
// import folder.folderL1.folderL2.ExampleClass;

// public class Practice {
//     public static void main(String[] args) {
//         ExampleClass example = new ExampleClass();
//         example.displayMessage();
//     }
// }


//problem 4
// example for this is 
//   // ExampleClass.java in package 'example'
//   package example;

//   class ExampleClass {
//       // Default (package-private) property
//       int defaultProperty = 10;

//       // Protected property
//       protected int protectedProperty = 20;
//   }

//   // Subclass in a different package
//   public class Subclass extends ExampleClass {
//       public static void main(String[] args) {
//           Subclass subclass = new Subclass();

//           // Cannot access default property from outside the package
//           // Uncommenting the line below will result in a compilation error
//           // System.out.println(subclass.defaultProperty);

//           // Can access protected property from subclass
//           System.out.println(subclass.protectedProperty);
//       }
//   }



