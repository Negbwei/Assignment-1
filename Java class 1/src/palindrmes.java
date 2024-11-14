public class palindrmes {
        public static boolean isPalindrome(String word) {
            if (word == null) {
                return false;
            }
            word = word.replaceAll("\\s+", "").toLowerCase();

            String reversed = new StringBuilder(word).reverse().toString();
            return word.equals(reversed);
        }
    }

}
