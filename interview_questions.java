class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    //Reverse and Compare
    public static boolean isPalindromeReverse(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static void main(String[] args) {
        String[] testCases = {"madam", "hello", "racecar", "java"};
        System.out.println(" ==== Palindrome Check ===");
        for (String test : testCases) {
             System.out.println(test + " is Palindrome: " + isPalindrome(test));
        }
    }
 
}