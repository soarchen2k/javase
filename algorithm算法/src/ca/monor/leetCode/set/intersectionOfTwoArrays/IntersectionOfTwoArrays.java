package ca.monor.leetCode.set.intersectionOfTwoArrays;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = getNewSet(nums1);
        Set<Integer> set2 = getNewSet(nums2);
        set1.retainAll(set2);
        int[] res = getNewArray(set1);
        return res;
    }

    private int[] getNewArray(Set<Integer> set1) {
        int[] arr = new int[set1.size()];
        int index = 0;
        for (int value :
                set1) {
            arr[index++] = value;
        }
        return arr;
    }

    private Set<Integer> getNewSet(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int value :
                nums) {
            set.add(value);
        }
        return set;
    }
}
