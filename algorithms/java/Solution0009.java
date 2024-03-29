//判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
//
// 示例 1:
//
// 输入: 121
//输出: true
//
//
// 示例 2:
//
// 输入: -121
//输出: false
//解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
//
//
// 示例 3:
//
// 输入: 10
//输出: false
//解释: 从右向左读, 为 01 。因此它不是一个回文数。
//
//
// 进阶:
//
// 你能不将整数转为字符串来解决这个问题吗？
// Related Topics 数学
// 👍 1355 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution0009 {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int tmp = x, reverse = 0;
        while (tmp != 0) {
            int pop = tmp % 10;
            tmp = tmp / 10;
            reverse = reverse * 10 + pop;
        }
        if (reverse == x) return true;
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
