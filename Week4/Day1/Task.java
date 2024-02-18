
class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

class CannotDivideByZeroException extends Exception {
    public CannotDivideByZeroException(String message) {
        super(message);
    }
}

class MaxInputException extends Exception {
    public MaxInputException(String message) {
        super(message);
    }
}

class MaxMultiplierReachedException extends Exception {
    public MaxMultiplierReachedException(String message) {
        super(message);
    }
}

class CustomCalculator {
    public static int add(int a, int b) throws MaxInputException {
        if (a > 100000 || b > 100000)
            throw new MaxInputException("Inputs should not exceed 100000");
        return a + b;
    }

    public static int subtract(int a, int b) throws MaxInputException {
        if (a > 100000 || b > 100000)
            throw new MaxInputException("Inputs should not exceed 100000");
        return a - b;
    }

    public static int multiply(int a, int b) throws MaxInputException, MaxMultiplierReachedException {
        if (a > 100000 || b > 100000)
            throw new MaxInputException("Inputs should not exceed 100000");
        if (a > 7000 || b > 7000)
            throw new MaxMultiplierReachedException("Multiplier should not exceed 7000");
        return a * b;
    }

    public static int divide(int a, int b) throws CannotDivideByZeroException, MaxInputException {
        if (b == 0)
            throw new CannotDivideByZeroException("Cannot divide by zero");
        if (a > 100000 || b > 100000)
            throw new MaxInputException("Inputs should not exceed 100000");
        return a / b;
    }
}

public class Task {
    public static void main(String[] args) {
        try {
            System.out.println("Addition: " + CustomCalculator.add(100, 200));
            System.out.println("Subtraction: " + CustomCalculator.subtract(500, 200));
            System.out.println("Multiplication: " + CustomCalculator.multiply(100, 70));
            System.out.println("Division: " + CustomCalculator.divide(500, 0));

            // Testing exceptions
            // CustomCalculator.multiply(8000, 100); // MaxMultiplierReachedException
            // CustomCalculator.divide(100, 0); // CannotDivideByZeroException
            // CustomCalculator.add(100000, 100000); // MaxInputException
        } catch (MaxInputException | CannotDivideByZeroException | MaxMultiplierReachedException e) {
            System.out.println(e.getMessage());
        }
    }
}
