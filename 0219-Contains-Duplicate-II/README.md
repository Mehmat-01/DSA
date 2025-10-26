<h2><a href="https://leetcode.com/problems/contains-duplicate-ii">219. Contains Duplicate II</a></h2>
<h3>Easy</h3>
<hr>
<p>Given an integer array <code>nums</code> and an integer <code>k</code>, return <code>true</code> if there are two distinct indices <code>i</code> and <code>j</code> in the array such that <code>nums[i] == nums[j]</code> and <code>abs(i - j) &lt;= k</code>.</p>

<h3>Example 1:</h3>
<pre>
<b>Input:</b> nums = [1,2,3,1], k = 3
<b>Output:</b> true
</pre>

<h3>Example 2:</h3>
<pre>
<b>Input:</b> nums = [1,0,1,1], k = 1
<b>Output:</b> true
</pre>

<h3>Example 3:</h3>
<pre>
<b>Input:</b> nums = [1,2,3,1,2,3], k = 2
<b>Output:</b> false
</pre>

<hr>
<h3>Constraints:</h3>
<ul>
  <li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
  <li><code>-10<sup>9</sup> &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
  <li><code>0 &lt;= k &lt;= 10<sup>5</sup></code></li>
</ul>
