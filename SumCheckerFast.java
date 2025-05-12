/**
 *  Dada la siguiente problemática: ¿puede un número X formarse
 * usando la suma de 2 elementos de un array?
 *
 * Desarrolle: Un algoritmo que resuelva el problema asumiendo que la máquina en donde va a correrse el
 * programa tiene recursos infinitos, que el tiempo de ejecución no importa y que lo más
 * importante es realizar el desarrollo en el menor tiempo posible.
 *
 * Suposiciones:
 *  - El array puede contener elementos repetidos.
 *  - Se permite usar dos elementos con el mismo valor, pero no con el mismo indice.
 */

public class SumCheckerFast {

    public static boolean canSum(int[] num, int requiredSum){
        for (int i = 0; i < num.length ; i++) {
            for (int j = i+1; j < num.length; j++) {
                if(num[i] + num[j] == requiredSum){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        // Ejemplo 1
        int[] nums1 = {1, 4, 3, 9};
        System.out.println("Ejemplo 1: " + canSum(nums1, 8)); // false

        // Ejemplo 2
        int[] nums2 = {1, 2, 4, 4};
        System.out.println("Ejemplo 2: " + canSum(nums2, 8)); // true
    }
}
