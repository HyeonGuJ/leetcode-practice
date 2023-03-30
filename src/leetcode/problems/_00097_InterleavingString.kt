package leetcode.problems


class _00097_InterleavingString {
    fun isInterleave(s1: String, s2: String, s3: String): Boolean {
        if (s1.length + s2.length != s3.length) return false
        val visited = Array(s1.length+1) { BooleanArray(s2.length+1) }
        return calc(s1, s2, s3, 0, 0, visited)
    }

    fun calc(s1: String, s2: String, s3: String, i: Int, j: Int, visited: Array<BooleanArray>): Boolean {
        if (visited[i][j]) return false
        visited[i][j] = true

        return when {
            i == s1.length ->s2.substring(j) == s3.substring(i + j)
            j == s2.length -> s1.substring(i) == s3.substring(i + j)
            s1[i] == s3[i + j] && s2[j] == s3[i + j] ->calc(s1, s2, s3, i + 1, j, visited) || calc(s1, s2, s3, i, j + 1, visited)
            s1[i] == s3[i + j] -> calc(s1, s2, s3, i + 1, j, visited)
            s2[j] == s3[i + j] -> calc(s1, s2, s3, i, j + 1, visited)
            else -> false
        }
    }
}