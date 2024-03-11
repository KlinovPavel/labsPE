public class increments {
    public static void main(String[] args) {

        // ++ (префиксный инкремент)
        int a = 8;
        int b = ++a;
        System.out.println(a);  // 9
        System.out.println(b + "\n");  // 9

        // ++ (постфиксный инкремент)
        int c = 8;
        int d = c++;
        System.out.println(c);  // 9
        System.out.println(d+ "\n");  // 8

        // -- (префиксный декремент)
        int e = 8;
        int f = --e;
        System.out.println(e);  // 7
        System.out.println(f+ "\n");  // 7

        // -- (постфиксный декремент)
        int g = 8;
        int h = g--;
        System.out.println(g);  // 7
        System.out.println(h+ "\n");  // 8

    }
}
