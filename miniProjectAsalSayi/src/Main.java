public class Main {
    public static void main(String[] args) {
        int number = 1;
        int remainder = number % 2;
        boolean isPrime = true;

        if (number == 1) {
            System.out.println("sayi asal degildir");
            return;
        }

        if (number < 1) {
            System.out.println("Gecersiz sayi");
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("sayi asaldir");
        } else {
            System.out.println("sayi asal degildir");
        }
    }
}