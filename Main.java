import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //a.Write a program with a loop that computes the sum of the even numbers between 2 and 100 inclusive
        int sum = 0;

        for(int i = 2; i<=100; i+=2)
        {
        sum = sum + i;
        }
        System.out.println("The sum of the numbers between 2 and 100 inclusive is: " +sum);

        //a.Write a program with a loop that computes the sum of the squares of numbers between 1 and 100 inclusive
        int sumOfSquares = 0;

        for(int i = 1; i <= 100; i++ )
        {
            sumOfSquares = sumOfSquares + i*i;
        }
        System.out.println("The sum of the squares of numbers from 1 to 100 inclusive is: " + sumOfSquares);

        //A program that computes all powers of 2 from 0 to 20
        double sumOfPowers = 0;

        for(int i=0; i<=20; i++) {
            double poweredTwo = Math.pow(2, i);
            sumOfPowers = sumOfPowers + poweredTwo;
        }
        System.out.println("The sum of all powers of 2 from 0 to 20 is: " + sumOfPowers);

        //a program that reads 2 input numbers and computes the sum of all odd numbers between them

        System.out.print("Please enter 2 numbers (a and b) and make sure a is smaller than b. Enter a: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.print("Now please enter b: ");
        int b = in.nextInt();
        int sumOfOdds = 0;
        if(a < b) {
            if (a % 2 == 0 && b % 2 == 0) {
                for (int i = a + 1; i < b; i = i + 2) {
                    sumOfOdds += i;
                }
            } else if (a % 2 == 1 && b % 2 == 0) {
                for (int i = a; i < b; i = i + 2) {
                    sumOfOdds += i;
                }
            } else if (a % 2 == 1 && b % 2 == 1) {
                for (int i = a; i <= b; i = i + 2) {
                    sumOfOdds += i;
                }
            } else {
                for (int i = a + 1; i <= b; i = i + 2) {
                    sumOfOdds += i;
                }
            }

            System.out.println("The sum of odd numbers between " + a + " and " + b + " is: " + sumOfOdds);
        }
        else
        {
            System.out.println("You have entered invalid numbers.");
        }

     //A program that computes the sum of all odd input numbers.
        System.out.println("Please enter your numbers and this program will calculate the sum of the odds: ");
        int sumOfOddInput = 0;

        while (in.hasNextInt()) {
            int next = in.nextInt();
            if(next%2 == 1)
            {
                sumOfOddInput += next;
            }
        }
        System.out.println(sumOfOddInput);
        }
    }
