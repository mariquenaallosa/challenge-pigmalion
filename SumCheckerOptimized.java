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
}
