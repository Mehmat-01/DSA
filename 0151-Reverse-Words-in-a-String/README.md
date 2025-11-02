<h2><a href="https://leetcode.com/problems/reverse-words-in-a-string/">151. Reverse Words in a String</a></h2>
<h3>Medium</h3>
<hr>
<p>Given an input string <code>s</code>, reverse the order of the words.</p>
<p>A <strong>word</strong> is defined as a sequence of non-space characters. The words in <code>s</code> will be separated by at least one space.</p>
<p>Return a string of the words in reverse order concatenated by a single space.</p>
<p>Note that <code>s</code> may contain leading or trailing spaces or multiple spaces between words. The returned string should only have a single space separating the words. Do not include any extra spaces.</p>

<h3>Example 1:</h3>
<pre>
<b>Input:</b> s = "the sky is blue"
<b>Output:</b> "blue is sky the"
</pre>

<h3>Example 2:</h3>
<pre>
<b>Input:</b> s = "  hello world  "
<b>Output:</b> "world hello"
<b>Explanation:</b> Your reversed string should not contain leading or trailing spaces.
</pre>

<h3>Example 3:</h3>
<pre>
<b>Input:</b> s = "a good   example"
<b>Output:</b> "example good a"
<b>Explanation:</b> You need to reduce multiple spaces between two words to a single space in the reversed string.
</pre>

<hr>
<h3>Constraints:</h3>
<ul>
  <li><code>1 &lt;= s.length &lt;= 10<sup>4</sup></code></li>
  <li><code>s</code> contains English letters (upper-case and lower-case), digits, and spaces <code>' '</code>.</li>
  <li>There is at least one word in <code>s</code>.</li>
</ul>

<hr>
<h3>Follow up:</h3>
<p>If the string data type is mutable in your language, can you solve it in-place with <code>O(1)</code> extra space?</p>
