public class Операции_сравнения {
    public static void main(String[] args) {
        int a1 = 10;
        int b1 = 4;
        boolean c1 = a1 == b1;
        boolean d1 = a1 == 10;

        System.out.println(c1);
        System.out.println(d1);
        System.out.println();

        int a2 = 10;
        int b2 = 4;
        boolean c2 = a2 != b2;
        boolean d2 = a2 != 10;

        System.out.println(c2);
        System.out.println(d2);
        System.out.println();

        int a3 = 10;
        int b3 = 4;
        boolean c3 = a3 < b3;

        System.out.println(c3);
        System.out.println();

        int a4 = 10;
        int b4 = 4;
        boolean c4 = a4 > b4;

        System.out.println(c4);
        System.out.println();

        boolean c5 = 10 >= 10;
        boolean b5 = 10 >= 4;
        boolean d5 = 10 >= 20;

        System.out.println(c5);
        System.out.println(d5);
        System.out.println(b5);
        System.out.println();

        boolean c6 = 10 <= 10;
        boolean b6 = 10 <= 4;
        boolean d6 = 10 <= 20;

        System.out.println(c6);
        System.out.println(d6);
        System.out.println(b6);

    }
}
