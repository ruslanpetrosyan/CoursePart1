public class Main {
    public static void main(String[] args) {
        int a = 2;
        int result = square(a);
        System.out.println("Квадрат числа " + a + " равен " + result);

    }
    private static int square (int number){
        return number * number;
    }
}