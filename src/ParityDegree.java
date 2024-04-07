/** https://app.codility.com/programmers/trainings/5/parity_degree/
 *   level easy
 */
public class ParityDegree {
    public static int solution (int N) {
        int k = 1; // 2 ^ 0 = 1 -> min k = 1
        while (N == 2 * (int)(N/2)) {
            N = N / 2;
            k++;
        }

        return k - 1;
    }

    public static void main(String[] args) {
        int testResult = solution(2);
        System.out.printf("result is " + testResult);
    }
}
