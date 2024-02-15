package Prakash;

import java.util.Arrays;

public class ascendingorder {
    public static void main(String[] args) {

        int[] arr = {0, 23, 14, 12, 9};
        	Arrays.sort(arr);

        System.out.print("Sorted Array- ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
