package Week3HomeAssignments;

import java.util.Arrays;

public class findMissingElement {

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 8, 6, 7};
        int n = arr.length + 1; 
        boolean[] present = new boolean[n + 1];

    
        for (int i = 0; i < arr.length; i++) {
            present[arr[i]] = true;
        }

        
        int missing = 0;
        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                missing = i;
                break;
            }
        }

        System.out.println("Missing element: " + missing);
    }
}
