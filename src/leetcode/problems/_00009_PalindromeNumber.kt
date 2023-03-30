package leetcode.problems


class _00009_PalindromeNumber {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) return false
        val str = x.toString()
        return str == str.reversed()
    }
}