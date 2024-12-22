public class LargestDivisible {
    public static void main(String[] args) {
        // Starting from 9999, the largest 4-digit number
        int number = 9999;


        while (number >= 1000) {
            if (number % 10 == 0 && number % 13 == 0) {
                System.out.println("The largest 4-digit number divisible by 10 and 13 is: " + number);
                break;
            }
            number--;
        }

        if (number < 1000) {
            System.out.println("No 4-digit number divisible by 10 and 13 found.");
        }
    }
}
