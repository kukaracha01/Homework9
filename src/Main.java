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
        int[] moneyInBookSecond = {816, 895, 865, 878, 825};
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

        System.out.println("Task3");
        int[] moneyInBookThird = {51, 74, 12, 73, 64};
        double midSummInMonth = 0;
        for (int i = 0; i < moneyInBookThird.length; i++) {
            midSummInMonth += moneyInBookThird[i];
        }
        midSummInMonth = midSummInMonth / moneyInBookThird.length;
        System.out.printf("Средняя сумма трат за месяц составила %s рублей%n", midSummInMonth);
    }
}