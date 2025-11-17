<h2><a href="https://leetcode.com/problems/binary-subarrays-with-sum/">930. Binary Subarrays With Sum</a></h2>
<h3>Medium</h3>
<hr>
<p>Given a binary array <code>nums</code> and an integer <code>goal</code>, return the number of non-empty <strong>subarrays</strong> with a sum equal to <code>goal</code>.</p>
<p>A <strong>subarray</strong> is a contiguous part of the array.</p>

<h3>Example 1:</h3>
<pre>
<b>Input:</b> nums = [1,0,1,0,1], goal = 2
<b>Output:</b> 4
<b>Explanation:</b> The 4 subarrays are:
[1,0,1], [1,0,1,0], [0,1,0,1], and [1,0,1].
</pre>

<h3>Example 2:</h3>
<pre>
<b>Input:</b> nums = [0,0,0,0,0], goal = 0
<b>Output:</b> 15
<b>Explanation:</b> Every possible subarray sums to 0.
</pre>

<hr>
<h3>Constraints:</h3>
<ul>
  <li><code>1 &lt;= nums.length &lt;= 3 * 10<sup>4</sup></code></li>
  <li><code>nums[i]</code> is either <code>0</code> or <code>1</code>.</li>
  <li><code>0 &lt;= goal &lt;= nums.length</code></li>
</ul>
