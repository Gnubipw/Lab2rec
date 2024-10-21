package test;

import com.demo.Solution5;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * 测试类 L2022211852_5_Test 用于对 Solution5 类中的 numSubseq 方法进行测试
 * 测试用例设计的基本原则：
 * - 等价类划分：把输入数据的可能值划分为若干个等价类降低测试用例数量
 * - 边界值分析：对于题目条件限定的边界编写测试用例
 * - 考虑到笛卡尔积全覆盖的测试代价较高，本次实验会进行一定取舍
 */

class L2022211852_5_Test {

    @Test
    void testNumSubseq() {
        Solution5 solution = new Solution5();

        // 示例 1
        /**
         * 测试目的：验证题目描述所给示例1
         * 测试用例：[3, 5, 6, 7]，target = 9
         */
        int[] nums1 = {3, 5, 6, 7};
        int target1 = 9;
        int expected1 = 4;
        assertEquals(expected1, solution.numSubseq(nums1, target1));

        // 示例 2
        /**
         * 测试目的：验证题目描述所给示例2
         * 测试用例：[3, 3, 6, 8]，target = 10
         */
        int[] nums2 = {3, 3, 6, 8};
        int target2 = 10;
        int expected2 = 6;
        assertEquals(expected2, solution.numSubseq(nums2, target2));

        // 示例 3
        /**
         * 测试目的：验证题目描述所给示例3
         * 测试用例：[2, 3, 3, 4, 6, 7]，target = 12
         */
        int[] nums3 = {2, 3, 3, 4, 6, 7};
        int target3 = 12;
        int expected3 = 61;
        assertEquals(expected3, solution.numSubseq(nums3, target3));

        // 示例 4
        /**
         * 测试目的：验证乱序大值数组在target很大时的计算
         * 测试用例：[3, 14159, 26535, 89793, 23846]，target = 26433
         */
        int[] nums4 = {3, 14159, 26535, 89793, 23846, 26433};
        int target4 = 83279;
        int expected4 = 31;
        assertEquals(expected4, solution.numSubseq(nums4, target4));

        // 示例 5
        /**
         * 测试目的：验证全相同数字的较长数组的计算，通过操作target大于2倍相同值验证边界
         * 测试用例：[4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4]，target = 9
         */
        int[] nums5 = {4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4};
        int target5 = 9;
        int expected5 = 32767;
        assertEquals(expected5, solution.numSubseq(nums5, target5));

        // 示例 6
        /**
         * 测试目的：验证超长数组得到极大结果的计算，预期结果会超过1000000007，观察是否正常取余
         * 测试用例：[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30]，target = 60
         */
        int[] nums6 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        int target6 = 60;
        int expected6 = 73741816;//2^30-1=1073741823,对10^9+7取余得73741816
        assertEquals(expected6, solution.numSubseq(nums6, target6));

        // 示例 7
        /**
         * 测试目的：验证只有单个数字的数组在目标值较小时的计算
         * 测试用例：[7]，target = 14
         */
        int[] nums7 = {7};
        int target7 = 14;
        int expected7 = 1;
        assertEquals(expected7, solution.numSubseq(nums7, target7));

        // 示例 8
        /**
         * 测试目的：验证空数组的计算
         * 测试用例：[]，target = 8
         */
        int[] nums8 = {};
        int target8 = 8;
        int expected8 = 0;
        assertEquals(expected8, solution.numSubseq(nums8, target8));

        // 示例 9
        /**
         * 测试目的：验证target小于数组最小值的计算
         * 测试用例：[3, 1, 4, 1, 5, 9]，target = 0
         */
        int[] nums9 = {3, 1, 4, 1, 5, 9};
        int target9 = 0;
        int expected9 = 0;
        assertEquals(expected9, solution.numSubseq(nums9, target9));


    }
}