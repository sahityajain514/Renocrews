// Abstract class Pen with abstract methods write() and refill()

//problem 1 and 2

// abstract class Pen {
//     // Abstract method to write with the pen
//     public abstract void write();

//     // Abstract method to refill the pen
//     public abstract void refill();
// }

// // Concrete class FountainPen extending the Pen class
// class FountainPen extends Pen {
//     // Implementation of the write method for FountainPen
//     @Override
//     public void write() {
//         System.out.println("Writing with a fountain pen.");
//     }

//     // Implementation of the refill method for FountainPen
//     @Override
//     public void refill() {
//         System.out.println("Refilling a fountain pen.");
//     }

//     // Additional method for FountainPen to change the nib
//     public void changeNib() {
//         System.out.println("Changing the nib of the fountain pen.");
//     }
// }

// public class Practice {
//     public static void main(String[] args) {
//         // Example usage of FountainPen
//         FountainPen fountainPen = new FountainPen();
//         fountainPen.write();
//         fountainPen.refill();
//         fountainPen.changeNib();
//     }
// }


//problem 3
// Interface for basic animal behavior
// interface BasicAnimal {
//     void eat();
//     void sleep();
// }

// // Monkey class with jump() and bite() methods
// class Monkey {
//     public void jump() {
//         System.out.println("Monkey is jumping.");
//     }

//     public void bite() {
//         System.out.println("Monkey is biting.");
//     }
// }

// // Human class inheriting from Monkey and implementing BasicAnimal interface
// class Human extends Monkey implements BasicAnimal {
//     // Implementation of eat() method from BasicAnimal interface
//     @Override
//     public void eat() {
//         System.out.println("Human is eating.");
//     }

//     // Implementation of sleep() method from BasicAnimal interface
//     @Override
//     public void sleep() {
//         System.out.println("Human is sleeping.");
//     }
// }

// public class Practice {
//     public static void main(String[] args) {
//         
//         Human human = new Human();

//        
//         human.jump();
//         human.bite();

//         // Implemented methods from BasicAnimal interface
//         human.eat();
//         human.sleep();
//     }
// }


//problem 5
// Monkey class with jump() and bite() methods
// class Monkey {
//     public void jump() {
//         System.out.println("Monkey is jumping.");
//     }

//     public void bite() {
//         System.out.println("Monkey is biting.");
//     }
// }


// class Human extends Monkey {
    
// }

// public class Practice {
//     public static void main(String[] args) {
//         // Creating an array of Monkey objects, including both Monkey and Human objects
//         Monkey[] animals = new Monkey[3];
//         animals[0] = new Monkey();
//         animals[1] = new Human();
//         animals[2] = new Monkey();


//         for (Monkey animal : animals) {
            
//             animal.jump();

//             // Polymorphism: Calling bite() on Monkey objects and Human objects
//             animal.bite();

//             // If you want to access Human-specific methods, you can check the type
//             if (animal instanceof Human) {
//                 // Type-specific method call
//                 System.out.println("This is a Human!");
//             }

//             System.out.println(); 
//         }
//     }
// }


//problem 4

// abstract class Telephone {
//     // Abstract method to dial a number
//     public abstract void dial(String number);

//     // Abstract method to lift the receiver
//     public abstract void lift();

//     // Abstract method for a call disconnected event
//     public abstract void disconnected();
// }

// // Concrete class SmartTelephone inheriting from Telephone
// class SmartTelephone extends Telephone {
//     // Implementation of the dial method for SmartTelephone
//     @Override
//     public void dial(String number) {
//         System.out.println("Dialing " + number + " on a smart telephone.");
//     }

//     // Implementation of the lift method for SmartTelephone
//     @Override
//     public void lift() {
//         System.out.println("Lifting the smart telephone.");
//     }

//     // Implementation of the disconnected method for SmartTelephone
//     @Override
//     public void disconnected() {
//         System.out.println("Smart telephone call disconnected.");
//     }

//     // Additional method specific to SmartTelephone
//     public void browseInternet() {
//         System.out.println("Browsing the internet on a smart telephone.");
//     }
// }

// public class Practice {
//     public static void main(String[] args) {
       
//         Telephone regularPhone = new SmartTelephone(); // Polymorphism

       
//         regularPhone.dial("123456789");
//         regularPhone.lift();
//         regularPhone.disconnected();

       
//         if (regularPhone instanceof SmartTelephone) {
//             SmartTelephone smartPhone = (SmartTelephone) regularPhone;
//             smartPhone.browseInternet();
//         }
//     }
// }


//problem 6 and 7
// Interface TVRemote
interface TVRemote {
    void powerOn();
    void powerOff();
    void changeChannel(int channel);
    void volumeUp();
    void volumeDown();
}

// Class TV implementing TVRemote interface
class TV implements TVRemote {
    private boolean powerStatus;
    private int currentChannel;
    private int currentVolume;

    public TV() {
        this.powerStatus = false;
        this.currentChannel = 1;
        this.currentVolume = 50;
    }

    @Override
    public void powerOn() {
        System.out.println("TV powered on.");
        powerStatus = true;
    }

    @Override
    public void powerOff() {
        System.out.println("TV powered off.");
        powerStatus = false;
    }

    @Override
    public void changeChannel(int channel) {
        if (powerStatus) {
            System.out.println("Changing channel to " + channel);
            currentChannel = channel;
        } else {
            System.out.println("TV is currently powered off. Power on to change channel.");
        }
    }

    @Override
    public void volumeUp() {
        if (powerStatus) {
            System.out.println("Increasing volume.");
            currentVolume++;
        } else {
            System.out.println("TV is currently powered off. Power on to adjust volume.");
        }
    }

    @Override
    public void volumeDown() {
        if (powerStatus) {
            System.out.println("Decreasing volume.");
            currentVolume--;
        } else {
            System.out.println("TV is currently powered off. Power on to adjust volume.");
        }
    }

    // Additional methods specific to TV class can be added here
}

public class Practice {
    public static void main(String[] args) {
        TVRemote tv = new TV();

        tv.powerOn();
        tv.changeChannel(5);
        tv.volumeUp();
        tv.powerOff();
    }
}
