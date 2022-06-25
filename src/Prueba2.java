import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Prueba2 {
    protected static boolean metodo2(Integer[] arrA, Integer[] arrB) {
        if (arrA == null || arrB == null) return false;
        if (arrA.length == 0 || arrB.length == 0) return false;
        if (arrA.length != arrB.length) return false;

        Set<Integer> arrSetA = new HashSet<>(Arrays.asList(arrA));

        for (Integer value : arrB) {
            double sqrtValue = Math.sqrt(value);
            if (sqrtValue % 1.0 > 0) return false;
            if (!arrSetA.contains((int) sqrtValue)) {
                return false;
            }
        }

        return true;
    }
}
