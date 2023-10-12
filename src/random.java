import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class random {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        Collections.shuffle(numbers);

        for (int i = 0; i < 10; i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}

