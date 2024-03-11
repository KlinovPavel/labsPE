public class WrapperValueOf {
    public static void main(String[] args) {
        Integer integer1 = Integer.valueOf("6");                 // создается объект (класса) Integer с именем integer1, который оборачивает значение, полученное из строки "6".
        Integer integer2 = Integer.valueOf(6);                   // создается объект (класса) Integer с именем integer2, который оборачивает значение 6. (целочисленное)

        //  создается объект Integer с именем integer3, который оборачивает значение, полученное из строки "101011", которое в двоичной системе счисления.
        //  таким образом, строка "101011" представляется как двоичное число и преобразуется в десятичное число. "101011" в двоичной системе = 43 в десятичной системе.
        Integer integer3 = Integer.valueOf("101011", 2);   //

        System.out.println(integer1);
        System.out.println(integer2);
        System.out.println(integer3);
    }
}