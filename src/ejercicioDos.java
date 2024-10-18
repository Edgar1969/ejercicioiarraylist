import java.util.ArrayList;

public class ejercicioDos {
    public static void main(String[] args) {

        ArrayList numbers = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            numbers.add(i);
        }

        System.out.println("Números usando un bucle for:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("Números usando un bucle for-each:");
        for (Object number : numbers) System.out.println(number);

        System.out.println("Números en orden inverso usando un bucle while:");
        int index = numbers.size() - 1;
        while (index >= 0) {
            System.out.println(numbers.get(index));
            index--;
        }
    }
}
