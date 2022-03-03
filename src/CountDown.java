public class CountDown {
    public static void main(String[] args) {
        counter (0, 10);
    }


    public static void counter (int firstNumber, int secondNumber) {
        while (firstNumber <= secondNumber) {
            System.out.println(secondNumber);
            secondNumber --;
        }
    }
    }

