public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        int[] moneyInBook = {1, 2, 3, 4, 5};
        int summInMonth = 0;
        for (int i : moneyInBook) {
            summInMonth += i;
        }
        System.out.println("Сумма трат за месяц составила " + summInMonth + " рублей");

        System.out.println("Task2");
        int[] moneyInBookSecond = {896, 895, 815, 878, 876};
        int minWaste = 999999999;
        int maxWaste = -1;
        for (int i = 0; i < 5; i++) {
            if (moneyInBookSecond[i] > maxWaste) {
                maxWaste = moneyInBookSecond[i];
            }
            if (moneyInBookSecond[i] < minWaste) {
                minWaste = moneyInBookSecond[i];
            }
        }
        System.out.printf("Минимальная сумма трат за неделю составила %s рублей. Максимальная сумма трат за неделю составила %s рублей %n", minWaste, maxWaste);
        System.out.println("Task2");

    }
}