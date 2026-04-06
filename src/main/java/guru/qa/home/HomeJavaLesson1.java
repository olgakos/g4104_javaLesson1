package guru.qa.home;

public class HomeJavaLesson1 {

    public static void main(String[] args) {
//0) применить несколько арифметических операций ( + , -, * , /) над двумя примитивами типа int
        System.out.println("int only");
        int a = 5;
        int b = 2;

        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " % " + b + " = " + (a % b));


//1) применить несколько арифметических операций над int и double в одном выражении
        System.out.println("int and double");
        int c = 5;
        double d = 0.5;

        System.out.println(c + " + " + d + " = " + (c + d));
        System.out.println(c + " - " + d + " = " + (c - d));
        System.out.println(c + " * " + d + " = " + (c * d));
        System.out.println(c + " / " + d + " = " + (c / d));


//2) применить несколько логических операций ( < , >, >=, <= )
        System.out.println("comparison operators");
        int x = 5;
        int y = 6;

        System.out.println(x + " < " + y + " = " + (x < y));
        System.out.println(x + " > " + y + " = " + (x > y));
        System.out.println(x + " >= " + y + " = " + (x >= y));
        System.out.println(x + " <= " + y + " = " + (x <= y));
        System.out.println(x + " == " + y + " = " + (x == y));
        System.out.println(x + " != " + y + " = " + (x != y));

//3) прочитать про диапазоны типов данных для вещественных / чисел с плавающей точкой (какие максимальные и минимальные значения есть, как их получить) и переполнение
        System.out.println("Диапазоны float и double");
        System.out.println(Float.MIN_VALUE); //минимальное положительное значение типа float
        System.out.println(Float.MAX_VALUE); // max

        System.out.println(Double.MIN_VALUE); // минимальное положительное значение типа double
        System.out.println(Double.MAX_VALUE); // максимальное значение типа double

//4) получить переполнение при арифметической операции
        System.out.println("Float's overflow = " + (Float.MAX_VALUE * 2)); // бесконечность
        System.out.println("Double's overflow = " + (Double.MAX_VALUE * 2)); // бесконечность
        System.out.println(10.0 / 0); // бесконечность

    }
}
