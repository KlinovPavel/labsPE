public class chislo {
    public static void main(String[] args) {
        int n = 182;

        int первая_цифра = n / 100;
        int вторая_цифра = (n / 10) % 10;
        int третья_цифра = n % 10;

        int сумма_цифр = первая_цифра + вторая_цифра + третья_цифра;
        System.out.println("Сумма цифр числа " + n + ": " + сумма_цифр);
    }
}
