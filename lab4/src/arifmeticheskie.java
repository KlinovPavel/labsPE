public class arifmeticheskie {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 7;

        int сложение = a + b;
        System.out.println("сложение a+b: "+ сложение);

        int вычитание = a - b;
        System.out.println("вычитание a-b: "+ вычитание);

        int умножение = a * c;
        System.out.println("умножение a*c: "+ умножение);

        int деление_целых_чисел = a / c;
        System.out.println("деление (целых чисел) a/c: "+ деление_целых_чисел);

        double деление_с_плав_точкой = 22.5 / 2.2;
        System.out.println("деление (с плавающей точкой) a/c: "+ деление_с_плав_точкой);
    }
}
