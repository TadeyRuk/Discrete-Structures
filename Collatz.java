import java.util.Scanner;

class Collatz {
    private int userNumber = 0;

    public Collatz (int userNumber){
        this.userNumber = userNumber;
    }

    public void Simulation (){
        int numSteps = 0;

        int currentNumber = userNumber;
        System.out.print(currentNumber + " -> ");
            while (currentNumber != 1){
                if (currentNumber % 2 == 0){
                    currentNumber = currentNumber / 2;
                    numSteps++;
                }
                else {
                    currentNumber = currentNumber * 3 + 1;
                    numSteps++;
                }
                    System.out.print(currentNumber);
                        if (currentNumber > 1){
                        System.out.print(" -> ");
                        }
            }
            System.out.println();
            System.out.println();
            System.out.println("+------------------------------------------------+");
            System.out.println("+ Number of steps upon reaching 1 is: "+ numSteps +".");
            System.out.println("+------------------------------------------------+");

            System.out.println();
            System.out.println("A little Extra :)");
            System.out.println("+------------------------+");
            System.out.println("+       SIMULATION       +");
            System.out.println("+------------------------+");
            System.out.println("Your number is " + userNumber);

            int simulateNumber = userNumber; 
            do {
                if (simulateNumber % 2 == 0) {
                    System.out.println("It's an even integer so we divide " + simulateNumber + " by 2");
                    simulateNumber = simulateNumber / 2;
                } else {
                    System.out.println("It's an odd integer so we apply 3*" + simulateNumber + " + 1");
                    simulateNumber = simulateNumber * 3 + 1;
                }
                System.out.println("Result is: " + simulateNumber);
                System.out.println("----------------------------");
            } while (simulateNumber != 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loopCounter = 0;
        int userNumber = 0;

        System.out.println("+--------------------------+");
        System.out.println("+  THE Collatz Conjecture  +");
        System.out.println("+--------------------------+");
        System.out.println("+   Simulation porgram     +");
        System.out.println("+   By: Xander Dacillo :)  +");
        System.out.println("+--------------------------+");
    
        System.out.println();
        System.out.println("Let's try to simulate the Collatz Conjecture!");

        while (userNumber <= 0) {  
        System.out.print("Enter your desired positive number: ");
        userNumber = sc.nextInt();
            if (userNumber <= 0){
                System.out.println("+----------------------------------------------------+");
                System.out.println("+   Nah man, use a positive integer like 1, 2, 3.... +");
                System.out.println("+----------------------------------------------------+");
                System.out.println();
                loopCounter++;
            }
            else{
                continue;
            }
        }

        if (loopCounter > 0){
            System.out.println("THAT'S MORE LIKE IT!");
        }
        System.out.println();
        System.out.println("Great! Now let's simulate your number ["+ userNumber +"].");

        Collatz collatz = new Collatz(userNumber);
        collatz.Simulation();
        sc.close();

        System.out.println();
        System.out.println("This was fun to make, thank you sir. :)");
    }

}

