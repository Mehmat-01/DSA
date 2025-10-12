# [🧮 Missing and Repeating Numbers](https://www.naukri.com/code360/problems/missing-and-repeating-numbers_873366)

## Problem Statement

You are given an array of size `N`. The elements of the array are in the range from `1` to `N`.

Ideally, the array should contain elements from `1` to `N`.  
But due to some miscalculations, there is a number `R` in the range `[1, N]` which appears **twice**, and another number `M` in the range `[1, N]` which is **missing** from the array.

Your task is to find the **missing number (M)** and the **repeating number (R)**.

You can return the answer in any order.

---

### Example 1:

**Input:**  
`arr = [6, 4, 3, 5, 5, 1]`

**Output:**  
`[2, 5]`

**Explanation:**  
The array should contain elements from 1 to 6.  
Here, `2` is missing and `5` occurs twice.  
Thus, the output is `[2, 5]`, where 2 → missing and 5 → repeating.

---

### Example 2:

**Input:**  
`arr = [3, 1, 3]`

**Output:**  
`[2, 3]`

**Explanation:**  
The array should contain elements from 1 to 3.  
Here, `2` is missing and `3` occurs twice.

---

## Constraints

- `2 ≤ N ≤ 10^5`  
- `1 ≤ arr[i] ≤ N`  
- Exactly one element is missing and one element occurs twice  

---

