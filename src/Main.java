import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("------------------------------------------ \n");
        Prueba1 p1= new Prueba1();
        String input1 = "a:3, b:4, a:6, f:0, h:2, b:10";
        String[] result1 = p1.metodo1(input1);
        System.out.println(Arrays.toString(result1));

        System.out.println("------------------------------------------ \n");
        Integer[] arr1 = {2};
        Integer[] arr2 = {4};
        boolean result2 = Prueba2.metodo2(arr1, arr2);
        System.out.println(result2);

        System.out.println("------------------------------------------ \n");
        Prueba3 p3 = new Prueba3();
        int arrP3[]={1,2,3,1,3,5,7,6,5,0,5,0,6};
        p3.metodo3(arrP3);

        System.out.println("------------------------------------------ \n");
        Prueba4 p4 = new Prueba4();
        p4.metodo4();

    }




}