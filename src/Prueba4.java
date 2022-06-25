import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Prueba4 {
    public static Map map = new LinkedHashMap<String, Integer>();

    public void metodo4(){
        Scanner teclado=new Scanner(System.in);
        System.out.print("Escribe numero entero para pasarlo a Romano : ");
        int a=teclado.nextInt();
        populateMap();
        System.out.println(transformar(a));
    }

    public static String transformar(int value){
        String result = "";
        int number = value;
        while(number > 0){
            Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
            while(it.hasNext()){
                Map.Entry<String, Integer> entry = it.next();
                if(number >= entry.getValue()){
                    number -= entry.getValue();
                    result += entry.getKey();
                    break;
                }
            }
        }
        return result;
    }

    public static void populateMap(){
        map.put("M", 1000);
        map.put("CM", 900);
        map.put("D", 500);
        map.put("CD", 400);
        map.put("C", 100);
        map.put("XC", 90);
        map.put("L", 50);
        map.put("XL", 40);
        map.put("X", 10);
        map.put("IX", 9);
        map.put("V", 5);
        map.put("IV", 4);
        map.put("I", 1);
    }
}
