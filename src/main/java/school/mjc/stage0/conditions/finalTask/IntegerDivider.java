package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        int result = dividend / divider;
        int multiply = result * divider;

        if (multiply == dividend) {
            System.out.println("can be divided completely");
        } else if (multiply == 0) {
            System.out.println("division by zero");
        } else {
            System.out.println("cannot be divided completely");
        }
    }
}
