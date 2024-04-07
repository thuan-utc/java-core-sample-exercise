/**
 * source: https://app.codility.com/programmers/trainings/5/three_letters/
 * level: medium
 */
public class ThreeLetter {
    public static String solution(int A, int B) {
        StringBuilder result = new StringBuilder();
        while (A > 0 && B > 0) {
            if (A > B) {
                result.append("aa");
                A -= 2;
                result.append("b");
                B--;
            } else if (B > A) {
                result.append("bb");
                B -= 2;
                result.append("a");
                A--;
            } else {
                result.append("ab");
                A--;
                B--;
            }
        }
        while (A > 0) {
            result.append("a");
            A--;
        }
        while (B > 0) {
            result.append("b");
            B--;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution(1, 4));
    }

}
