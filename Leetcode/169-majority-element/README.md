# Leetcode 169: Majority Element

## ✅ Approach: Boyer-Moore Voting Algorithm

- Track a candidate and count.
- If count is 0, update candidate.
- If current number == candidate, count++
- Else, count--

## 🧠 Time and Space Complexity

- Time: O(n)
- Space: O(1)

## 💻 Java Code

See: `Solution.java`
