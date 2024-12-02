import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Colecciones {
    public static void main(String[] args) {
        List<Integer> array1 = new ArrayList<Integer>();
        // ArrayList<Integer> array2 = new ArrayList<>();
        array1.add(12);
        array1.add(15);
        array1.add(20);
        System.out.println(array1.toString());
        array1.add(1,13);
        System.out.println(array1.toString());
        System.out.println("Elemento en posición 2: " + array1.get(2));
        System.out.println("El índice del elemento 20 es: " + array1.indexOf(20));
        System.out.println("Tamaño de la lista: " + array1.size());
        System.out.println("¿Existe elemento 6?: " + array1.contains(6));

        LinkedList<String> lista = new LinkedList<String>();

        lista.add("Torcuata");
        lista.add("Filomena");
        lista.add("Pancrasio");
        lista.add("Tiburcio");
        System.out.println(lista.toString());
        System.out.println(lista.size());
        System.out.println("Elemento en posición 1" + lista.get(1));
    }
}