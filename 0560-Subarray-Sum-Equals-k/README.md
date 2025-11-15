<h2><a href="https://leetcode.com/problems/subarray-sum-equals-k/">560. Subarray Sum Equals K</a></h2>
<h3>Medium</h3>
<hr>
<p>Given an array of integers <code>nums</code> and an integer <code>k</code>, return the total number of subarrays whose sum equals to <code>k</code>.</p>
<p>A subarray is a contiguous non-empty sequence of elements within an array.</p>

<h3>Example 1:</h3>
<pre>
<b>Input:</b> nums = [1,1,1], k = 2
<b>Output:</b> 2
<b>Explanation:</b> The subarrays [1,1] starting at indices (0,1) and (1,2) both sum to 2.
</pre>

<h3>Example 2:</h3>
<pre>
<b>Input:</b> nums = [1,2,3], k = 3
<b>Output:</b> 2
<b>Explanation:</b> The subarrays [1,2] and [3] both sum to 3.
</pre>

<h3>Example 3:</h3>
<pre>
<b>Input:</b> nums = [1], k = 0
<b>Output:</b> 0
</pre>

<hr>
<h3>Constraints:</h3>
<ul>
  <li><code>1 &lt;= nums.length &lt;= 2 * 10<sup>4</sup></code></li>
  <li><code>-1000 &lt;= nums[i] &lt;= 1000</code></li>
  <li><code>-10<sup>7</sup> &lt;= k &lt;= 10<sup>7</sup></code></li>
</ul>
