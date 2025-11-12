<h2><a href="https://leetcode.com/problems/max-consecutive-ones-iii/">1004. Max Consecutive Ones III</a></h2>
<h3>Medium</h3>
<hr>
<p>Given a binary array <code>nums</code> and an integer <code>k</code>, return the <em>maximum number of consecutive</em> <code>1</code><em>'s</em> in the array if you can flip at most <code>k</code> <code>0</code>'s.</p>

<h3>Example 1:</h3>
<pre>
<b>Input:</b> nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
<b>Output:</b> 6
<b>Explanation:</b> Flip the two 0's at indices 5 and 10 to get 6 consecutive 1's.
</pre>

<h3>Example 2:</h3>
<pre>
<b>Input:</b> nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
<b>Output:</b> 10
<b>Explanation:</b> Flip 3 zeros to get 10 consecutive ones.
</pre>

<hr>
<h3>Constraints:</h3>
<ul>
  <li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
  <li><code>nums[i]</code> is either <code>0</code> or <code>1</code>.</li>
  <li><code>0 &lt;= k &lt;= nums.length</code></li>
</ul>
