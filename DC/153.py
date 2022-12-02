# 153. Find Minimum in Rotated Sorted Array
# 12-1

class Solution(object):

    def findMin(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # find min of rotated array
        # large - max, min - small
        # min, small, large, max
        left, right = 0, len(nums) -1
        while nums[left] > nums[right]:
            mid = (left + right) // 2
            if (nums[mid] < nums[left]):
                right = mid
            else:
                left = mid + 1
        return nums[left]
        
