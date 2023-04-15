package be.petey952.template;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));

        int sleep = getFirstIntArgument(args);
        System.out.printf("Sleep %d seconds%n", sleep);

        sleepSeconds(sleep);

        System.out.println("Hello World!");
    }

    private static void sleepSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static int getFirstIntArgument(String[] args) {
        return Arrays.stream(args)
                .filter(Util.isPositiveInteger())
                .map(Integer::parseInt)
                .findFirst()
                .orElse(0);
    }
}
