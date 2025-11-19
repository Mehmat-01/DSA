<h2><a href="https://leetcode.com/problems/subarrays-with-k-different-integers/">992. Subarrays with K Different Integers</a></h2>
<h3>Hard</h3>
<hr>
<p>Given an integer array <code>nums</code> and an integer <code>k</code>, return <em>the number of good subarrays of</em> <code>nums</code>.</p>
<p>A <strong>good subarray</strong> is a subarray where the number of different integers in that subarray is exactly <code>k</code>.</p>
<p>For example, <code>[1,2,3,1,2]</code> has 3 different integers: 1, 2, and 3.</p>

<h3>Example 1:</h3>
<pre>
<b>Input:</b> nums = [1,2,1,2,3], k = 2
<b>Output:</b> 7
<b>Explanation:</b> Subarrays with exactly 2 different integers are:
[1,2], [2,1], [1,2], [2,3], [1,2,1], [2,1,2], [1,2,3].
</pre>

<h3>Example 2:</h3>
<pre>
<b>Input:</b> nums = [1,2,1,3,4], k = 3
<b>Output:</b> 3
<b>Explanation:</b> Subarrays with exactly 3 different integers are:
[1,2,1,3], [2,1,3,4], [1,3,4].
</pre>

<hr>
<h3>Constraints:</h3>
<ul>
  <li><code>1 &lt;= nums.length &lt;= 2 * 10<sup>4</sup></code></li>
  <li><code>1 &lt;= nums[i], k &lt;= nums.length</code></li>
</ul>
