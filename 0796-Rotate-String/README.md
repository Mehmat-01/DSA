<h2><a href="https://leetcode.com/problems/rotate-string/">796. Rotate String</a></h2>
<h3>Easy</h3>
<hr>
<p>Given two strings <code>s</code> and <code>goal</code>, return <code>true</code> if and only if <code>s</code> can become <code>goal</code> after some number of shifts on <code>s</code>.</p>
<p>One shift on <code>s</code> consists of moving the leftmost character of <code>s</code> to the rightmost position.</p>

<h3>Example 1:</h3>
<pre>
<b>Input:</b> s = "abcde", goal = "cdeab"
<b>Output:</b> true
<b>Explanation:</b> "abcde" -> "bcdea" -> "cdeab"
</pre>

<h3>Example 2:</h3>
<pre>
<b>Input:</b> s = "abcde", goal = "abced"
<b>Output:</b> false
</pre>

<hr>
<h3>Constraints:</h3>
<ul>
  <li><code>1 &lt;= s.length, goal.length &lt;= 100</code></li>
  <li><code>s</code> and <code>goal</code> consist of lowercase English letters.</li>
</ul>

