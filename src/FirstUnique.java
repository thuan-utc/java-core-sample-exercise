import java.util.HashMap;
import java.util.Map;

/** source: https://app.codility.com/programmers/trainings/4/first_unique/
 * level easy
 * */
public class FirstUnique {
    public int solution(int []A) {
        Map<Integer, Integer> frequencyCount = new HashMap<>();
        for (int a : A) {
            if (frequencyCount.containsKey(a)) {
                frequencyCount.put(a, frequencyCount.get(a) + 1);
            } else {
                frequencyCount.put(a, 1);
            }
        }

        for (int a : A) {
            if (frequencyCount.get(a) == 1) {
                return a;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        FirstUnique firstUnique = new FirstUnique();
        System.out.printf("result: " + firstUnique.solution(new int[]{4, 10, 5, 4, 2, 10}));
    }
}
