<h2><a href="https://leetcode.com/problems/sum-of-beauty-of-all-substrings/">1781. Sum of Beauty of All Substrings</a></h2>
<h3>Medium</h3>
<hr>
<p>The <b>beauty</b> of a string is defined as the difference between the frequency of the most frequent character in the string and the frequency of the least frequent character (that appears at least once).</p>
<p>Given a string <code>s</code>, return the sum of <b>beauty</b> of all its substrings.</p>

<h3>Example 1:</h3>
<pre>
<b>Input:</b> s = "aabcb"
<b>Output:</b> 5
<b>Explanation:</b> The substrings with non-zero beauty are:
"aa" → beauty = 0
"aab" → beauty = 1
"ab" → beauty = 0
"abc" → beauty = 1
"bcb" → beauty = 2
Total beauty = 1 + 1 + 2 + 1 = 5.
</pre>

<h3>Example 2:</h3>
<pre>
<b>Input:</b> s = "aabcbaa"
<b>Output:</b> 17
</pre>

<hr>
<h3>Constraints:</h3>
<ul>
  <li><code>1 &lt;= s.length &lt;= 500</code></li>
  <li><code>s</code> consists of only lowercase English letters.</li>
</ul>
