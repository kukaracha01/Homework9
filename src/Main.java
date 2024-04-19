public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        int[] moneyInBook = {1, 2, 3, 4, 5};
        int summInMonth = 0;
        for (int i : moneyInBook) {
            summInMonth += i;
        }
        System.out.println("Сумма трат за месяц составила " + summInMonth + " рублей");

