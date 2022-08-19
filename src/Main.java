public class Main {
    int[] arr = generateRandomArray();
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    // задние 1
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int arrS = 0;
        for (int i : arr) {
            arrS = arrS + i;
        }
        System.out.println("Сумма затрат за месяц составила" + arrS);

        // задание 2
        int max = arr[0];
        int min = arr[0];
        for (Integer i : arr) {
            if (i > min) min = i;
            if (i > max) max = i;
        }
        System.out.println("Минимальная сумма трат за день составила" + max + "рублей. Максимальная сумма трат за день составила" + min + "рублей");

        // Задание 3
        for (int i : arr) {
            arrS += (double) i;
        }
        System.out.println("Средняя сумма трат за месяц составила " + arrS / arr.length + " рублей");

        // задание 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char n = (char) reverseFullName.length;
        char temp;
        for (char i = 0; i < n/2; i++) {
            temp = reverseFullName[n-i-1];
            reverseFullName[n-i-1] = reverseFullName[i];
            reverseFullName[i] = temp;
        }
         for (char i=0; i<reverseFullName.length; i++){
            System.out.print(reverseFullName[i]);
        }



    }
}