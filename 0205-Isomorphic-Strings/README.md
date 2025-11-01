<h2><a href="https://leetcode.com/problems/isomorphic-strings/">205. Isomorphic Strings</a></h2>
<h3>Easy</h3>
<hr>
<p>Given two strings <code>s</code> and <code>t</code>, determine if they are isomorphic.</p>
<p>Two strings <code>s</code> and <code>t</code> are isomorphic if the characters in <code>s</code> can be replaced to get <code>t</code>.</p>
<p>All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.</p>

<h3>Example 1:</h3>
<pre>
<b>Input:</b> s = "egg", t = "add"
<b>Output:</b> true
</pre>

<h3>Example 2:</h3>
<pre>
<b>Input:</b> s = "foo", t = "bar"
<b>Output:</b> false
</pre>

<h3>Example 3:</h3>
<pre>
<b>Input:</b> s = "paper", t = "title"
<b>Output:</b> true
</pre>

<hr>
<h3>Constraints:</h3>
<ul>
  <li><code>1 &lt;= s.length &lt;= 5 * 10<sup>4</sup></code></li>
  <li><code>t.length == s.length</code></li>
  <li><code>s</code> and <code>t</code> consist of any valid ASCII character.</li>
</ul>
