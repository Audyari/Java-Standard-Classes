package ProblemSolving.sebelas.RuntimeClass;

public class RuntimeClass {

    public static void main(String[] args) {
        Runtime testRuntime = Runtime.getRuntime();

        System.out.println("Processors: " + testRuntime.availableProcessors());
        System.out.println("Free Memory: " + String.format("%,d", testRuntime.freeMemory()));
        System.out.println("Total Memory: " + String.format("%,d", testRuntime.totalMemory()));
        System.out.println("Max Memory: " + String.format("%,d", testRuntime.maxMemory()));

    }
}
