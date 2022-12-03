# 169. Majority Element
# 12-1, 12-3


class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """

        def majorElement(nums, lo=0, hi=None):
            if (lo == hi):
                return nums[lo]
            mi = (hi-lo) // 2 + lo
            left = majorElement(nums, lo, mi)
            right = majorElement(nums, mi+1, hi)
            if (left == right):
                return left
            else:
                countL = sum(1 for i in range(lo, hi+1) if nums[i] == left)
                countR = sum(1 for i in range(lo, hi+1) if nums[i] == right)
                return left if countL > countR else right


        return majorElement(nums, 0, len(nums)-1)
