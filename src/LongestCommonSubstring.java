public class LongestCommonSubstring {
    public static void main(String[] args) {
        String str1 = "qdef";
        String str2 = "defq";

        System.out.println("Length of Longest Common Substring is "+ lcsubstr(str1, str2));
    }
        public static int lcsubstr(String str1, String str2) {
            int result = 0;
            for(int i = 0; i < str1.length(); i++) {
                for (int j = 0; j < str2.length(); j++) {
                    int k = 0;
                    while ((i + k) < str1.length() &&
                            (j + k) < str2.length() && str1.charAt(i + k) == str2.charAt(j + k)) {
                        k = k + 1;
                    }

                    result = Math.max(result, k);
                }
            }
            return result;
        }
}
