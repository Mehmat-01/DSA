<h2><a href="https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/">1358. Number of Substrings Containing All Three Characters</a></h2>
<h3>Medium</h3>
<hr>
<p>Given a string <code>s</code> consisting only of characters <code>'a'</code>, <code>'b'</code>, and <code>'c'</code>, return the number of substrings containing at least one occurrence of all these characters <code>'a'</code>, <code>'b'</code>, and <code>'c'</code>.</p>

<h3>Example 1:</h3>
<pre>
<b>Input:</b> s = "abcabc"
<b>Output:</b> 10
<b>Explanation:</b> The substrings containing at least one occurrence of a, b, and c are:
"abc", "abca", "abcab", "abcabc", "bca", "bcab", "bcabc", "cab", "cabc", and "abc".
</pre>

<h3>Example 2:</h3>
<pre>
<b>Input:</b> s = "aaacb"
<b>Output:</b> 3
<b>Explanation:</b> The substrings are "aaacb", "aacb", and "acb".
</pre>

<h3>Example 3:</h3>
<pre>
<b>Input:</b> s = "abc"
<b>Output:</b> 1
</pre>

<hr>
<h3>Constraints:</h3>
<ul>
  <li><code>3 &lt;= s.length &lt;= 5 * 10<sup>4</sup></code></li>
  <li><code>s</code> consists only of lowercase English letters <code>'a'</code>, <code>'b'</code>, and <code>'c'</code>.</li>
</ul>
