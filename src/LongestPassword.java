/**
 * source: https://app.codility.com/programmers/trainings/1/longest_password/
 * level easy
 */
public class LongestPassword {
    public int solution(String S) {
        int longestPassword = -1;
        S = S.trim();
        String[] passwordList = S.split("\\s+");
        for (String password : passwordList) {
            if (isValidPassword(password) && password.length() > longestPassword) {
                longestPassword = password.length();
            }
        }

        return longestPassword;
    }

    public boolean isValidPassword(String password) {
        int letterCount = 0;
        int digitCount = 0;
        for (Character c : password.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                letterCount++;
            } else if (Character.isDigit(c)) {
                digitCount++;
            } else {
                return false;
            }
        }
        return letterCount % 2 == 0 && digitCount % 2 == 1;
    }

    public static void main(String[] args) {
        LongestPassword longestPassword = new LongestPassword();
        System.out.printf("result: " + longestPassword.solution("test 5 a0A pass007 ?xy1"));
    }
}
