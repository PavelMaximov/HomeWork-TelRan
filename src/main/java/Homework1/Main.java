package Homework1;

public class Main {

    public static void main(String[] args) {
        String myString = new String("I study Java!");

        System.out.println("Последний символ строки: " + myString.charAt(myString.length() - 1));

        System.out.println("Строка 'Java': " + myString.contains("Java"));

        String replacedString = myString.replace('a', 'o');
        System.out.println("После замены символов: " + replacedString);

        System.out.println("Вепхний регистр: " + myString.toUpperCase());

        System.out.println("Нижний регистр: " + myString.toLowerCase());

        /*--- ZADANIE 2 ---*/

        System.out.println("Сложение: " + Homework1.add(55, 55));
        System.out.println("Вычитание: " + Homework1.subtract(20, 19));
        System.out.println("Умножение: " + Homework1.multiply(5, 5));
        System.out.println("Деление: " + Homework1.divide(10, 2));
    }
}