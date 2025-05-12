import java.util.Scanner;

public class SumChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [][] options = {
                {1, 4, 3, 9},
                {1, 2, 4, 4}
        };
        System.out.println("¿Qué algoritmo querés ejecutar?");
        System.out.println("1. Simple");
        System.out.println("2. Optimizado");
        int choiceAlgorithm = scanner.nextInt();

        System.out.println("\nElegí un array de prueba:");
        for (int i = 0; i < options.length; i++) {
            System.out.print((i + 1) + " - [");
            for (int j = 0; j < options[i].length; j++) {
                System.out.print(options[i][j]);
                if (j < options[i].length - 1) System.out.print(", ");
            }
            System.out.println("]");
        }

        int choiceArray = scanner.nextInt();

        int requiredSum = 8;
        int[] nums = options[choiceArray - 1];



        switch (choiceAlgorithm) {
            case 1:
                System.out.println("Resultado (Simple): " +
                        SumCheckerFast.canSum(nums, requiredSum));
                break;
            case 2:
                System.out.println("Resultado (Optimizado): " +
                        SumCheckerOptimized.canSum(nums, requiredSum));
                break;
            default:
                System.out.println("Opción no válida.");
        }

    }
}
