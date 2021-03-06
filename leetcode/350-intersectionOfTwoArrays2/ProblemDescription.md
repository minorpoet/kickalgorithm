Given two arrays, write a function to compute their intersection.


    Example:
    Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].

Note:
Each element in the result should appear as many times as it shows in both arrays.

结果集中的每个元素出现的次数应和它在两个数组同时出现的次数一致

The result can be in any order.

结果集可以以任意顺序排列

Follow up:
- What if the given array is already sorted? How would you optimize your algorithm?
- 如果给定的数组是已排序的，如何优化算法？
- What if nums1's size is small compared to nums2's size? Which algorithm is better?
- 如果数组1的长度比数组2的小，哪种算法更好？
- What if elements of nums2 are stored on disk,and the memory is limited such that you cannot load all elements into the memory at once?
- 如果数组2 存储在磁盘中，并且内存是有限的，那你就不能一下子把所有元素都加载到内存中， 这时候算法又有怎样的调整？