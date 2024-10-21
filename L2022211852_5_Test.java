package test;

import com.demo.Solution5;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class L2022211852_5_Test {

    @Test
    void testNumSubseq() {
        Solution5 solution = new Solution5();

        // 示例 1
        int[] nums1 = {3, 5, 6, 7};
        int target1 = 9;
        int expected1 = 4;
        assertEquals(expected1, solution.numSubseq(nums1, target1));

        // 示例 2
        int[] nums2 = {3, 3, 6, 8};
        int target2 = 10;
        int expected2 = 6;
        assertEquals(expected2, solution.numSubseq(nums2, target2));

        // 示例 3
        int[] nums3 = {2, 3, 3, 4, 6, 7};
        int target3 = 12;
        int expected3 = 61;
        assertEquals(expected3, solution.numSubseq(nums3, target3));

        // 示例 4
        int[] nums4 = {5, 4, 3, 2, 1};
        int target4 = 7;
        int expected4 = 26;
        assertEquals(expected4, solution.numSubseq(nums4, target4));

        // 示例 5
        int[] nums5 = {4,4,4,4};
        int target5 = 9;
        int expected5 = 15;
        assertEquals(expected5, solution.numSubseq(nums5, target5));

        // 示例 6
        int[] nums6 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
        int target6 = 60;
        int expected6 = 73741816;
        assertEquals(expected6, solution.numSubseq(nums6, target6));
    }
}