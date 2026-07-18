class Solution {
    public int thirdMax(int[] arr) {

        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            // Skip duplicates
            if (arr[i] == first || arr[i] == second || arr[i] == third)
                continue;

            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            }
            else if (arr[i] > second) {
                third = second;
                second = arr[i];
            }
            else if (arr[i] > third) {
                third = arr[i];
            }
        }

        if (third == Long.MIN_VALUE)
            return (int) first;

        return (int) third;
    }
}