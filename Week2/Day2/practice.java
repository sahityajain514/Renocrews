

public class practice {
  //problem 1
    static void multiplication(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d X %d = %d\n", n, i, n * i);
        }
    }
//problem 2
    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
//problem 3
    static int sumRecursive(int n) {
        // Base condition
        if (n == 1) {
            return 1;
        }
        return n + sumRecursive(n - 1);
    }
  
  //problem 4
static void pattern2(int n){
   for(int i=n;i>=1;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
}
  
   
//problem 5

    static int fib(int n) {
      
        if (n == 1 || n == 2) {
            return n - 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
//problem 6
  public static double calculateAverage(double... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("At least one number must be provided to calculate the average.");
        }

        double sum = 0;

        for (double num : numbers) {
            sum += num;
        }

        return sum / numbers.length;
    }
  //problem 7
  public static void printPattern(int n) {
        if (n <= 0) {
            return; // Base case to stop recursion
        }

        // Print '*' characters based on the current value of n
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }

        System.out.println(); // Move to the next line

        // Recursively call the function with a reduced value of n
        printPattern(n - 1);
    }
//problem 8
    static void pattern1_rec(int n) {
        if (n > 0) {
            pattern1_rec(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
  
//problem 9
   public static double celsiusToFahrenheit(double celsius) {
        // Formula: F = (C * 9/5) + 32
        return (celsius * 9 / 5) + 32;
    }
  
//problem 10
   public static int calculateSum(int n) {
        if (n < 0) {
           System.out.println("not a natural number");
          
        }

        // Formula for sum of first n natural numbers: sum = n * (n + 1) / 2
        return n * (n + 1) / 2;
    }
  //main
    public static void main(String[] args) {
        // Problem 1
        // multiplication(7);

        // Problem 2
        // pattern1(9);

        // Problem 3
        // int c = sumRecursive(4);
        // System.out.println(c);

      //problem 4
      //pattern2(4);

        // Problem 5
        // fibonacci series - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
      
        // int result = fib(7);
        // System.out.println(result);
//problem 6
 // double average = calculateAverage(10, 20, 30, 40, 50);
 //        System.out.println("Average: " + average);

      //problem 7
     // printPattern(4);
      
        // Problem 8
      //  pattern1(9);

      //problem 9
       // double celsiusTemperature = 25.0;
       //  double fahrenheitTemperature = celsiusToFahrenheit(celsiusTemperature);

       //  System.out.println(celsiusTemperature + " degrees Celsius is equal to " +
       //                     fahrenheitTemperature + " degrees Fahrenheit.");

      
//problem 10
        int n = 5; 
        int sum = calculateSum(n);

        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
      

    }
}
