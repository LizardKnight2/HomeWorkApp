public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }

    public static void checkSumSign() {
        int a = 5;
        int b = 8;
        int result = a + b;
        if (result >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }


    }

    public static void printColor() {
        int value = 70;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 || value <= 100) {
            System.out.println("Желтый");

        } else {
            System.out.println("Зеленый");
        }

    }

    public static void compareNumbers() {
        int a = 40;
        int b = 60;
        if (a >= b){
            System.out.println(a >= b);
        } else if( a < b) {
            System.out.println(a < b);

        }
    }
}
