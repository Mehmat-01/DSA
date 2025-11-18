<h2><a href="https://leetcode.com/problems/count-number-of-nice-subarrays/">1248. Count Number of Nice Subarrays</a></h2>
<h3>Medium</h3>
<hr>
<p>Given an array of integers <code>nums</code> and an integer <code>k</code>, return the number of <strong>nice subarrays</strong>.</p>
<p>A <strong>nice subarray</strong> is a contiguous subarray that contains exactly <code>k</code> odd numbers.</p>

<h3>Example 1:</h3>
<pre>
<b>Input:</b> nums = [1,1,2,1,1], k = 3
<b>Output:</b> 2
<b>Explanation:</b> The nice subarrays are [1,1,2,1] and [1,2,1,1].
</pre>

<h3>Example 2:</h3>
<pre>
<b>Input:</b> nums = [2,4,6], k = 1
<b>Output:</b> 0
<b>Explanation:</b> There are no odd numbers in the array.
</pre>

<h3>Example 3:</h3>
<pre>
<b>Input:</b> nums = [2,2,2,1,2,2,1,2,2,2], k = 2
<b>Output:</b> 16
</pre>

<hr>
<h3>Constraints:</h3>
<ul>
  <li><code>1 &lt;= nums.length &lt;= 5 * 10<sup>4</sup></code></li>
  <li><code>1 &lt;= nums[i] &lt;= 10<sup>5</sup></code></li>
  <li><code>1 &lt;= k &lt;= nums.length</code></li>
</ul>
