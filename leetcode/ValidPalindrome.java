class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String cleaned = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                cleaned = cleaned + Character.toLowerCase(s.charAt(i));
            }
        }
        String rev = "";
        for (int i = cleaned.length() - 1; i >= 0; i--) {
            rev = rev + cleaned.charAt(i);
        }
        return cleaned.equals(rev);
    }
}