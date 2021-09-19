import java.util.Scanner;

public class CalculateDeposit {

    double calculateComplexPercentFunction(double firstArg, int secondArg) {
        double pay = firstArg * Math.pow((1 + 0.06 / 12), 12 * secondArg);
        return round(pay);
    }

    double calculateSimplePercentFunction(double amount, int depositPeriod) {
        return round(amount + amount * 0.06 * depositPeriod);
    }

    double round(double value) {
        double scale = Math.pow(10, 2);
        return Math.round(value * scale) / scale;
    }

    void doImportantJob() {
        int period;
        int action;
        int amount;
        double outVariable = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сумму вклада в рублях:");
        amount = scanner.nextInt();

        System.out.println("Введите срок вклада в годах:");
        period = scanner.nextInt();

        System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
        action = scanner.nextInt();

        if (action == 1) {
            outVariable = calculateSimplePercentFunction(amount, period);
        } else if (action == 2) {
            outVariable = calculateComplexPercentFunction(amount, period);
        }
        System.out.println("Результат вклада: " + amount + " за " + period + " лет превратятся в " + outVariable);
    }

    public static void main(String[] args) {
        new CalculateDeposit().doImportantJob();
    }
}
