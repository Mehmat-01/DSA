<h2><a href="https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold">1283. Find the Smallest Divisor Given a Threshold</a></h2>
<h3>Medium</h3>
<hr>

<p>Given an array of integers <code>nums</code> and an integer <code>threshold</code>, we will choose a positive integer <code>divisor</code>, divide all the array by it, and sum the division's result.  
Find the <strong>smallest</strong> divisor such that the result is less than or equal to <code>threshold</code>.</p>

<p>Each result of the division is rounded up to the nearest integer.  
(i.e., <code>result = ceil(nums[i] / divisor)</code>).</p>

<p>The test cases are generated so that there will be an answer.</p>

<p>&nbsp;</p>

<p><strong class="example">Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,2,5,9], threshold = 6
<strong>Output:</strong> 5
<strong>Explanation:</strong> 
If you choose divisor = 1, you get 17 (which is too large). 
If you choose divisor = 5, you get 5 (which is smaller than or equal to 6).
</pre>

<p><strong class="example">Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [44,22,33,11,1], threshold = 5
<strong>Output:</strong> 44
</pre>

<p>&nbsp;</p>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>1 &lt;= nums.length &lt;= 5 * 10<sup>4</sup></code></li>
  <li><code>1 &lt;= nums[i] &lt;= 10<sup>6</sup></code></li>
  <li><code>nums.length &lt;= threshold &lt;= 10<sup>6</sup></code></li>
</ul>
