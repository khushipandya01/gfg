class Solution {
    static String conRevstr(String s1, String s2) {
        StringBuilder str = new StringBuilder(s1 + s2);
        return str.reverse().toString();
    }
}