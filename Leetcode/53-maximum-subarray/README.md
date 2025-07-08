# 💥 Kadane’s Algorithm: Find the Maximum Subarray Sum in O(n) Time!

## 📘 Problem  
Given an integer array `nums`, find the contiguous subarray (containing at least one number) which has the **largest sum**, and return its sum.

---

## ✨ Intuition  
When solving this problem, my first thought was:  
> "At each point, should I continue with the current subarray or start fresh from this element?"

The idea is to keep track of the **maximum sum so far** and the **current running sum**. If the current sum becomes negative, we reset it to the current number.

---

## 🧠 Approach  
We use **Kadane’s Algorithm**:
- Initialize two variables:
  - `currsum` → current subarray sum
  - `maxsum` → max sum found so far
- Loop from index `1` to `n-1`:
  - Update current sum by either:
    - Starting a new subarray from `nums[i]`
    - Or extending the existing one
  - Update `maxsum` if needed.

---

## ⏱️ Complexity

- **Time Complexity:** `O(n)`  
- **Space Complexity:** `O(1)`

---

## 💻 Code

```java
class Solution {
    public int maxSubArray(int[] nums) {
        int currsum = nums[0];
        int maxsum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currsum = Math.max(nums[i], currsum + nums[i]);
            maxsum = Math.max(maxsum, currsum);
        }

        return maxsum;
    }
}
