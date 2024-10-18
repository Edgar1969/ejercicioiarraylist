import java.util.ArrayList;
import java.util.List;

public class ejercicioTres {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }

        System.out.println("Lista original: " + numbers);
        System.out.println("Números pares: " + evenNumbers);
    }
}

