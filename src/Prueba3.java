import java.util.LinkedHashMap;
import java.util.Map;

public class Prueba3 {

    public static Map map = new LinkedHashMap<Integer, Integer>();
    public void metodo3(int numeros[]){
        for (int itemNum :numeros){
            int numVeces = contar(itemNum,numeros);
            if(esImpar(numVeces))
            {
                if(!map.containsValue(itemNum)){
                    map.put(itemNum,numVeces);
                }
            }
        }
        for (Object key: map.keySet()){
            System.out.print("El Numero "+key+" aparece " +map.get(key)+" veces \n");
        }
    }

    public int contar(int item, int numeros[]){
        int cont=0;
        for (int x :numeros)
        {
            if(x == item){
                cont+=1;
            }
        }
        return cont;
    }

    public static boolean esImpar(int numero) {
        if (numero % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }
}
