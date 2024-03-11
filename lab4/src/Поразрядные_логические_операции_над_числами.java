public class Поразрядные_логические_операции_над_числами {
    public static void main(String[] args) {
        // & (логическое умножение)
     int a1 = 2; // 010
     int b1 = 5; // 101

     System.out.println(a1&b1);

     int a2 = 4; // 100
     int b2 = 5; // 101

     System.out.println(a2&b2);
        System.out.println();
     // | (логическое сложение)
        int a3 = 2; // 010
        int b3 = 5; // 101

        System.out.println(a3|b3);

        int a4 = 4; // 100
        int b4 = 5; // 101

        System.out.println(a4|b4);
        System.out.println();

        // ^ (логическое исключающее ИЛИ)
        int number = 45;
        int key = 102;
        int encrypt = number ^ key;
        System.out.println("Зашифрованное число: " + encrypt);

        int decrypt = encrypt ^ key;
        System.out.println("Расшифрованное число: " + decrypt);
        System.out.println();


        // ~ (логическое отрицание)
        byte a = 12;
        System.out.println(~a);
    }
}
