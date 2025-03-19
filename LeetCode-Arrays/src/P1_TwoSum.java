public class P1_TwoSum {
    public static void main(String[] args) {
        int a[] = {2, 7, 11, 15};
        twoSum(a, 13);
    }

    static void twoSum(int ar[], int target) {
        int pos1 = -1;
        int pos2 = -1;

        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                int sum = ar[i] + ar[j]; // Fix: Only sum the current pair
                if (sum == target) {
                    pos1 = i;
                    pos2 = j;
                    System.out.println(pos1 + "," + pos2);
                    return; // Fix: Immediately return when a valid pair is found
                }
            }
        }

        // If no pair is found
        System.out.println("No valid pair found");
    }
}
