package leetcode.problems


class _00179_Largest_Number_Kt {
    fun largestNumber(nums: IntArray): String {

        val comp = Comparator<String> { str1, str2 ->
            val s1 = str1 + str2
            val s2 = str2 + str1
            s2.compareTo(s1)
        }

        val solution =  nums.map { it.toString() }
            .sortedWith (comp)
            .reduce { a: String, b: String -> a + b }

        return if(solution[0] == '0'){
            "0"
        } else {
            solution
        }

    }

}