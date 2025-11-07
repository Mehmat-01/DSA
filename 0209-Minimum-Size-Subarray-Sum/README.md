<h2><a href="https://leetcode.com/problems/minimum-size-subarray-sum/">209. Minimum Size Subarray Sum</a></h2>
<h3>Medium</h3>
<hr>
<p>Given an array of positive integers <code>nums</code> and a positive integer <code>target</code>, return the <em>minimal length</em> of a <strong>subarray</strong> whose sum is greater than or equal to <code>target</code>. If there is no such subarray, return <code>0</code> instead.</p>

<h3>Example 1:</h3>
<pre>
<b>Input:</b> target = 7, nums = [2,3,1,2,4,3]
<b>Output:</b> 2
<b>Explanation:</b> The subarray [4,3] has the minimal length under the problem constraint.
</pre>

<h3>Example 2:</h3>
<pre>
<b>Input:</b> target = 4, nums = [1,4,4]
<b>Output:</b> 1
</pre>

<h3>Example 3:</h3>
<pre>
<b>Input:</b> target = 11, nums = [1,1,1,1,1,1,1,1]
<b>Output:</b> 0
<b>Explanation:</b> No subarray satisfies the condition.
</pre>

<hr>
<h3>Constraints:</h3>
<ul>
  <li><code>1 &lt;= target &lt;= 10<sup>9</sup></code></li>
  <li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
  <li><code>1 &lt;= nums[i] &lt;= 10<sup>4</sup></code></li>
</ul>

<hr>
<h3>Follow up:</h3>
<p>If you have figured out the <code>O(n)</code> solution, try coding another solution of <code>O(n log n)</code> time complexity.</p>
