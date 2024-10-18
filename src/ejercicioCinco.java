import java.util.ArrayList;

public class ejercicioCinco {
    public static void main(String[] args) {
        ArrayList<Integer> listaEnteros = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            listaEnteros.add(i);
        }
        Integer[] arrayEnteros = new Integer[listaEnteros.size()];
        arrayEnteros = listaEnteros.toArray(arrayEnteros);
        for (int i = 0; i < arrayEnteros.length; i++) {
            System.out.println(arrayEnteros[i]);
        }
    }
}