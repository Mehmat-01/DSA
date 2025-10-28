<h2><a href="https://leetcode.com/problems/plus-one">66. Plus One</a></h2>
<h3>Easy</h3>
<hr>
<p>You are given a large integer represented as an integer array <code>digits</code>, where each <code>digits[i]</code> is the <code>i<sup>th</sup></code> digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading <code>0</code>'s.</p>
<p>Increment the large integer by one and return the resulting array of digits.</p>

<h3>Example 1:</h3>
<pre>
<b>Input:</b> digits = [1,2,3]
<b>Output:</b> [1,2,4]
<b>Explanation:</b> The array represents the integer 123. Incrementing by one gives 124.
</pre>

<h3>Example 2:</h3>
<pre>
<b>Input:</b> digits = [4,3,2,1]
<b>Output:</b> [4,3,2,2]
<b>Explanation:</b> The array represents the integer 4321. Incrementing by one gives 4322.
</pre>

<h3>Example 3:</h3>
<pre>
<b>Input:</b> digits = [9]
<b>Output:</b> [1,0]
<b>Explanation:</b> The array represents the integer 9. Incrementing by one gives 10.
</pre>

<hr>
<h3>Constraints:</h3>
<ul>
  <li><code>1 &lt;= digits.length &lt;= 100</code></li>
  <li><code>0 &lt;= digits[i] &lt;= 9</code></li>
  <li><code>digits</code> does not contain any leading 0’s.</li>
</ul>
