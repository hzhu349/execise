public class Palindrome {
    public static boolean checkPalindrome(int number) {
        boolean res = true;
        char[] c = ("" + number).toCharArray();

        int i = 0;
        int j = c.length - 1;

        while (i <= j) {
            if (c[i] != c[j])
                return false;
            i++;
            j--;

        }
        return res;
    }

    public static void main(String[] args){
        System.out.println(checkPalindrome(1234567) + " 123467");
        System.out.println(checkPalindrome(1234321) + " 1234321");

    }
}
