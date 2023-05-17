import java.util.Scanner;

public class main {


    public static void main(String[] args) {




    } // main

    public static void inputExample() {
        // Inputs - Getting the users information
        // C#: We would use Console.ReadLine();
        // For java we have to create a Scanner Object
        // And then pass in System.in before we can use it.

        // Creating a scanner object to ask the user for their information
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.nextLine(); // Returns the users typed response as a string

        System.out.println("Your name is " + name);

        System.out.println("How long have you taught: ");

        String userNumber = scanner.nextLine();
        // In C# you would parse with int.Parse();
        // In Java you parse with Integer.parseInt();
        // Java does not have try parse

        // Try catch works the same as in c#
        try {
            int userYearsTaught = Integer.parseInt(userNumber);
            int mulitplyYears = userYearsTaught * 2;
            // TO quick comment in java, you can just highlight and do ctrl + /
//        int yearsTaught = scanner.nextInt();
//        int mulitplyYears = yearsTaught * 2;

            System.out.println(mulitplyYears);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


    }

    // Methods are declared the same as c#, but method names start with lower case
    public static void printExample() {
        // Console.WriteLine("Hello, World!");
        System.out.println("Hello" + " World!"); // println goes to the next line
        System.out.printf("%s %s!%n", "Hello", "World"); // With printf, you can use placeholders with the %and then s
        System.out.print("Hello,World Also"); // print stays on the same line
    }

    public static void variableExample() {
        // String
        // upper case S String
        String name = "Bander"; // still use double quotes for strings
        // The shortcut to printlin is sout + tab
        System.out.println(name);

        // whole numbers
        // byte, short, int, long ( hold different ranges of values
        // java does not have unsigned variables
        int grade = 100;
        System.out.println(name + " - Grade: " + grade);

        // decimal numbers
        // float, double
        double percentage = 5.9;
        System.out.println(percentage);
        double sum = grade / percentage;

        System.out.println(sum);
        // math operations are the same : + , -, * , / , %

        // booleans
        // java booleans are lower case true and false
        boolean isSunny = true;
        boolean isRainy = false;

        System.out.println(isRainy);

        char letterA = 'A';

        System.out.println(letterA);

    }


} // class

// public static void Main(String[] args) {}

// first difference in java
// METHODS NAMES ARE LOWER CASE

// the shortcut to create your main is psvm + tab

// comments are the same as c+, double forward slash