import java.util.HashSet;
import java.util.Set;

/**
 * Dada la siguiente problemática: ¿puede un número X formarse
 * usando la suma de 2 elementos de un array?
 *
 * Desarrolle: Un algoritmo que resuelva el problema asumiendo que los recursos son un bien preciado,
 * que el tiempo de ejecución si importa y que el tiempo de desarrollo no es importante.
 *
 * Suposiciones:
 * - Los elementos pueden repetirse.
 * - No se usa el mismo índice dos veces.
 */

public class SumCheckerOptimized {
    public static boolean canSum(int[]nums, int requiredSum){
        Set<Integer> seen = new HashSet<>();

        for(int num:nums){
            int complement = requiredSum - num;
            if(seen.contains(complement)){
                return true;
            }
            seen.add(num);
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
