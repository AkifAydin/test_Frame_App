import java.lang.reflect.Array;

public class ummar {
    public static void main(String[] args) {

        char[] test = {'a', '/', 'b', 'z'};
        char[] lowerChars = new char[test.length];

        for (int i = 0; i < test.length; i++) {
            if (Character.isLowerCase(test[i])) {
                lowerChars[i] = test[i];
            }
        }
        System.out.println(lowerChars);
    }
}
