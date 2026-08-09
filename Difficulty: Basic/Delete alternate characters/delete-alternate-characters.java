class Solution {
    static String delAlternate(String s) {
        String result = "";

        for (int i = 0; i < s.length(); i += 2) {
            result += s.charAt(i);
        }

        return result;
    }
}