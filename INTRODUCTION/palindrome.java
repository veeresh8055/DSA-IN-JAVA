
public class palindrome {
    public static void main(String[] args) {
        String val = "gadag";

        boolean ans = palindrome(val);
        System.out.println(ans);

    }

    static boolean palindrome(String val) {
        int start = 0;
        int end = val.length() - 1;

        while (start < end) {
            if (val.charAt(start) != val.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}
