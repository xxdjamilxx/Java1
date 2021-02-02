public class FirstClass {

    public static void main(String[] args) {
        System.out.println("Написать метод вычисляющий выражение и возвращающий результат, \n" +
                "где a, b, c, d – аргументы этого метода, имеющие тип float. = " +sum(4.22f,5.25f,5.2f,6));

        System.out.println("Кол-во = " +  line(3, 16));

        System.out.println("---------");

        System.out.println((numberPositive(20) ? "positive": "negative"));

        System.out.println("---------");

        System.out.println(returnNum(-6));

        System.out.println("---------");

        System.out.println("Привет, " + words("My Little Pony"));

    }

    public static float sum (float a, float b, float c, int d) {
        return a * (b + (c / d));
    }

    public static boolean line (int a1, int b1) {
        int duo = a1 + b1;
        return (duo <= 20) && (duo >10);
    }

    public static boolean numberPositive (int cc) {
        return cc >=0;
    }

    public static boolean returnNum (int a22) {
        return (a22 >=0);
    }

    public static String words (String name) {
        return name;
    }

}



