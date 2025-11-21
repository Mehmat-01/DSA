<h2><a href="https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/">28. Find the Index of the First Occurrence in a String</a></h2>
<h3>Easy</h3>
<hr>
<p>Given two strings <code>haystack</code> and <code>needle</code>, return the index of the first occurrence of <code>needle</code> in <code>haystack</code>. If <code>needle</code> is not part of <code>haystack</code>, return <code>-1</code>.</p>

<h3>Example 1:</h3>
<pre>
<b>Input:</b> haystack = "sadbutsad", needle = "sad"
<b>Output:</b> 0
<b>Explanation:</b> "sad" occurs at index 0 and 6. The first occurrence is at index 0.
</pre>

<h3>Example 2:</h3>
<pre>
<b>Input:</b> haystack = "leetcode", needle = "leeto"
<b>Output:</b> -1
<b>Explanation:</b> "leeto" does not occur in "leetcode".
</pre>

<hr>
<h3>Constraints:</h3>
<ul>
  <li><code>1 &lt;= haystack.length, needle.length &lt;= 10<sup>4</sup></code></li>
  <li><code>haystack</code> and <code>needle</code> consist of only lowercase English letters.</li>
</ul>
