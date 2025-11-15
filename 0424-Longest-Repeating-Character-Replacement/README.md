<h2><a href="https://leetcode.com/problems/longest-repeating-character-replacement/">424. Longest Repeating Character Replacement</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given a string <code>s</code> and an integer <code>k</code>. You can choose any character of the string and change it to any other uppercase English letter. You can perform this operation at most <code>k</code> times.</p>
<p>Return the length of the longest substring containing the same letter you can get after performing the above operations.</p>

<h3>Example 1:</h3>
<pre>
<b>Input:</b> s = "ABAB", k = 2
<b>Output:</b> 4
<b>Explanation:</b> Replace the two 'A's with 'B's or vice versa to make the entire string one repeating letter.
</pre>

<h3>Example 2:</h3>
<pre>
<b>Input:</b> s = "AABABBA", k = 1
<b>Output:</b> 4
<b>Explanation:</b> Replace one 'B' to get "AABAAAA" or "AAABAAA", both have the longest repeating substring length of 4.
</pre>

<hr>
<h3>Constraints:</h3>
<ul>
  <li><code>1 &lt;= s.length &lt;= 10<sup>5</sup></code></li>
  <li><code>s</code> consists of only uppercase English letters.</li>
  <li><code>0 &lt;= k &lt;= s.length</code></li>
</ul>
