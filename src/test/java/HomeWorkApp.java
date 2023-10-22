public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkHomework();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords() {
        System.out.println("orange");
        System.out.println("banana");
        System.out.println("apple");
    }
    public static void checkHomework() {
        int a = 3, b = 4;
        if (a + b >= 0) {
            System.out.println("сумма положительная");
        }
        if (a + b <= 0) {
            System.out.println("сумма отрицательная");
        }
    }
    public static void printColor() {
        int value = 0;
        if (value <= 0) {
            System.out.println("красный");
        }
         else if (value >= 0) {
            System.out.println("желтый");
        } else if (value >= 100) System.out.println("зеленный");
    }
    public static void compareNumbers() {
        int a = 3, b = 4;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a <=b");
        }
    }
}