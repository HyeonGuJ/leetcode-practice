package leetcode.problems

import kotlin.math.abs


class _00029_DivideTwoIntegers {
    fun divide(originalDividend: Int, originalDivisor: Int): Int {

        var solution = 0L
        var isPlus = originalDividend > 0 == originalDivisor > 0

        var dividend: Long = abs(originalDividend.toLong())
        var divisor: Long = abs(originalDivisor.toLong())


        if (divisor == 1L) {

            return when (isPlus) {
                true -> max(dividend)
                false -> min(dividend * -1)
            }.toInt()
        }

        if (dividend < divisor) {
            return 0
        }


        var bitFlag = 1
        while (dividend >= divisor) {
            if (dividend > divisor * bitFlag) {
                bitFlag = bitFlag shl 1
            } else if (dividend == divisor) {
                solution += bitFlag
                break
            } else {
                bitFlag = bitFlag shr 1
                solution += bitFlag
                dividend -= divisor * bitFlag
                bitFlag = 1;
            }
        }

        return when (isPlus) {
            true -> max(solution)
            false -> min(solution * -1)
        }
    }

    fun min(num: Long): Int {
        return if (num < Int.MIN_VALUE) {
            Int.MIN_VALUE
        } else {
            num.toInt()
        }
    }

    fun max(num: Long): Int {
        return if (num > Int.MAX_VALUE) {
            Int.MAX_VALUE
        } else {
            num.toInt()
        }
    }

}