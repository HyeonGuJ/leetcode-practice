package leetcode.problems

class _00692_TopKFrequentWords {
    fun topKFrequent(words: Array<String>, k: Int): List<String> {
        val map = mutableMapOf<String, Int>()
        words.forEach {
            if (map.containsKey(it)) {
                map[it] = map[it]!! + 1
            } else {
                map[it] = 1
            }
        }


        return map.map { it.key to it.value }.sortedWith(compareBy({ -it.second }, { it.first }))
            .subList(0, k).map { it.first }
    }
}