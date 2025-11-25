<h2><a href="https://leetcode.com/problems/running-sum-of-1d-array/">1480. Running Sum of 1D Array</a></h2>
<h3>Easy</h3>
<hr>
<p>Given an array <code>nums</code>, return an array <code>runningSum</code> where <code>runningSum[i]</code> is the sum of <code>nums[0] + nums[1] + ... + nums[i]</code>.</p>

<h3>Example 1:</h3>
<pre>
<b>Input:</b> nums = [1,2,3,4]
<b>Output:</b> [1,3,6,10]
<b>Explanation:</b>
runningSum[0] = 1
runningSum[1] = 1 + 2 = 3
runningSum[2] = 1 + 2 + 3 = 6
runningSum[3] = 1 + 2 + 3 + 4 = 10
</pre>

<h3>Example 2:</h3>
<pre>
<b>Input:</b> nums = [1,1,1,1,1]
<b>Output:</b> [5,4,3,2,1] ❌ (Incorrect)
<b>Correct Output:</b> [1,2,3,4,5]
</pre>

<h3>Example 3:</h3>
<pre>
<b>Input:</b> nums = [3,1,2,10,1]
<b>Output:</b> [3,4,6,16,17]
</pre>

<hr>
<h3>Constraints:</h3>
<ul>
  <li><code>1 &lt;= nums.length &lt;= 1000</code></li>
  <li><code>-10^6 &lt;= nums[i] &lt;= 10^6</code></li>
</ul>
