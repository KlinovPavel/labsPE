import java.util.Scanner;
public class vvod_s_konsoli {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер: ");
        int num = in.nextInt();

        System.out.printf("Ваш номер: %d \n", num);
        in.close();
    }
}
