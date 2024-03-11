// https://www.examclouds.com/ru/java/java-core-russian/obolochki-tipov
// Конструкторы оболочек

public class WrapperDemo1 {
    public static void main(String[] args) {
        Boolean boolean1 = new Boolean(true);             // создается объект класса Boolean с именем boolean1, который оборачивает значение true
        Boolean boolean2 = new Boolean("Some String");       // создается еще один объект класса Boolean с именем boolean2, который оборачивает значение, полученное из строки "Some String".

        System.out.println(boolean2);                           // выводит значение объекта boolean2. Если бы в строке было "true", то выход был бы true, но так как в строке "Some String" - будет false.
    }
}