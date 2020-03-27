package Task_FizzBuzz;

public class FizzBuzz {
    public static void main(String[] args) {
        int[] arrayOfNumbers = new int[100];

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = i;
        }
        int sumFizz = 0;
        int sumBuzz = 0;
        int sumFizzBuzz = 0;
        int sumOtherNumbers = 0;
        for (int arrayOfNumber : arrayOfNumbers) {
            if ((arrayOfNumber % 3 == 0) && (arrayOfNumber % 5 == 0)) {
                System.out.println("FizzBuzzTask");
                sumFizzBuzz++;
            } else if (arrayOfNumber % 3 == 0) {
                System.out.println("Fizz");
                sumFizz++;
            } else if (arrayOfNumber % 5 == 0) {
                System.out.println("Buzz");
                sumBuzz++;
            } else {
                System.out.println(arrayOfNumber);
                sumOtherNumbers++;
            }
        }
        System.out.println("sumFizz=" + sumFizz);
        System.out.println("sumBuzz=" + sumBuzz);
        System.out.println("sumFizzBuzz=" + sumFizzBuzz);
        System.out.println("sumOtherNumbers=" + sumOtherNumbers);

        if (sumBuzz + sumFizz + sumFizzBuzz + sumOtherNumbers == arrayOfNumbers.length) {
            System.out.println("sumBuzz + sumFizz + sumFizzBuzz + sumOtherNumbers ==" +
                    (sumBuzz + sumFizz + sumFizzBuzz + sumOtherNumbers) +
                    "\nSolved it correctly! Congratulations!!!");
        } else {
            System.out.println("OOOPPS!!!\nSomewhere is mistake!");
        }
    }

}

