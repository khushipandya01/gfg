class Solution {
    String average(int[] arr) {
        double sum = 0;

        for (int price : arr) {
            sum += price;
        }

        double avg = sum / arr.length;

        return String.format("%.2f", avg);
    }
}