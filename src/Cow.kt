class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var result = intArrayOf(0, 0)
        var isFound = false
        for (i in nums.indices) {
            if (isFound) {
                break
            }
            for (j in (i + 1) until nums.size) {
                if ((nums[i] + nums[j] == target)) {
                    result = intArrayOf(i, j)
                    isFound = true
                    break
                }
                //print(j)
            }
            //print(i)
        }

        return result
    }
}

fun main() {
    val solution = Solution()
    print(solution.twoSum(intArrayOf(12,30,60,30),42))
}

