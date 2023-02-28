public class Main {
    public static void main(String[] args) {;
        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
            System.out.println("Сумма выплат за месяц составит " + sum);
    }

        public static void task2() {
        System.out.println("Задача 2");
        int [] arr = generateRandomArray();
        int maxCash = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr [i] > maxCash) {
                maxCash = arr [i];
            }
        }
        System.out.println("Максимальная выплата составит " + maxCash);
        int minCash = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minCash) {
                minCash = arr [i];
            }
        }
        System.out.println("Минимальная выплата составит " + minCash);
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        double sum = 0;
        for (double element : arr) {
            sum += element;
        }
        double mediumCash = sum / arr.length;
        System.out.println("Средняя выплата в месяц составляет " + mediumCash);
    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reversFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reversFullName.length - 1; i >= 0; i--) {

            System.out.print(reversFullName[i]);

        }


    }

}