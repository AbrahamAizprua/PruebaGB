import java.util.*;
import java.util.stream.Collectors;

public class Prueba1 {

    protected static String[] metodo1(String input) {
        HashMap<String, Integer> acc = new HashMap();
        String[] tokenList = input.split(", ");

        for (String token : tokenList) {
            String[] tokenParts = token.split(":");
            String key = tokenParts[0];
            Integer value = Integer.parseInt(tokenParts[1]);

            if (acc.containsKey(key)) {
                Integer currentValue = acc.get(key);
                acc.put(key, currentValue + value);
            } else {
                acc.put(key, value);
            }
        }

        ArrayList<Map.Entry<String, Integer>> accList = new ArrayList(acc.entrySet());
        Comparator<Map.Entry<String, Integer>> comparator = Map.Entry.comparingByValue();
        accList.sort(comparator.reversed());

        List<String> result = accList.stream()
                .map(entry -> entry.getKey() + ":" + entry.getValue())
                .collect(Collectors.toList());
        String[] arr = new String[result.size()];

        return result.toArray(arr);
    }
}
