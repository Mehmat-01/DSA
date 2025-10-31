<h2><a href="https://leetcode.com/problems/largest-odd-number-in-string/">1903. Largest Odd Number in String</a></h2>
<h3>Easy</h3>
<hr>
<p>You are given a string <code>num</code>, representing a large integer. Return <em>the largest-valued odd integer (as a string) that is a non-empty substring of</em> <code>num</code>, or an empty string <code>""</code> if no odd integer exists.</p>
<p>A substring is a contiguous sequence of characters within a string.</p>

<h3>Example 1:</h3>
<pre>
<b>Input:</b> num = "52"
<b>Output:</b> "5"
<b>Explanation:</b> The only non-empty substrings are "5", "2", and "52". 
"5" is the only odd number.
</pre>

<h3>Example 2:</h3>
<pre>
<b>Input:</b> num = "4206"
<b>Output:</b> ""
<b>Explanation:</b> There are no odd numbers in "4206".
</pre>

<h3>Example 3:</h3>
<pre>
<b>Input:</b> num = "35427"
<b>Output:</b> "35427"
<b>Explanation:</b> "35427" is already an odd number.
</pre>

<hr>
<h3>Constraints:</h3>
<ul>
  <li><code>1 &lt;= num.length &lt;= 10<sup>5</sup></code></li>
  <li><code>num</code> consists only of digits and does not contain leading zeros.</li>
</ul>
