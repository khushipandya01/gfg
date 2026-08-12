class Solution {
    public static Hello helperFunction() {

        Hello obj = () -> System.out.println("Hello");

        return obj;
    }
}