# 169. Majority Element
# 12-1

#not right
class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums) == 1:
            return nums[0]
        mid = len(nums) // 2
        nums1 = self.majorityElement(nums[:mid+1])
        nums2  = self.majorityElement(nums[mid+1:])
        if nums1 == nums2:
            return nums1
        else:
            freq1 = self.countFreq(nums, nums1)
            freq2 = self.countFreq(nums, nums2)
            if freq1 > freq2:
                return freq1
            else:
                return freq2
    def countFreq(self, nums, target):
        freq = 0
        for num in nums:
            if num == target:
                freq += 1
        return freq
        