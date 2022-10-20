package leetcode.problems

class _00038_CountAndSay2 {
    fun countAndSay(n: Int): String {
        if (n == 1) {
            return "1"
        }
        if (n == 2) {
            return "11"
        }
        var answer = "11"
        for (i in 3 until n + 1) {
            answer = getNext(answer)
        }
        return answer
    }

    fun getNext(n: String): String {
        var count = 1
        var before = n[0].toString() + ""
        var total = ""
        for (i in 1 until n.length) {
            if (before != n[i].toString() + "") {
                total += count.toString() + "" + before
                count = 1
            } else {
                count++
            }
            before = n[i].toString() + ""
        }
        total += count.toString() + "" + before
        return total
    }
}