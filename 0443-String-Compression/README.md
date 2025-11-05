<h2><a href="https://leetcode.com/problems/string-compression/">443. String Compression</a></h2>
<h3>Medium</h3>
<hr>
<p>Given an array of characters <code>chars</code>, compress it using the following algorithm:</p>

<p>Begin with an empty string <code>s</code>. For each group of consecutive repeating characters in <code>chars</code>:</p>
<ul>
  <li>If the group's length is <code>1</code>, append the character to <code>s</code>.</li>
  <li>Otherwise, append the character followed by the group's length.</li>
</ul>

<p>The compressed string <code>s</code> should not be returned separately, but instead, be stored in the input character array <code>chars</code>. Note that group lengths that are 10 or longer will be split into multiple characters in <code>chars</code>.</p>

<p>After you are done modifying the input array, return the new length of the array.</p>

<p>You must write an algorithm that uses only constant extra space.</p>

<h3>Example 1:</h3>
<pre>
<b>Input:</b> chars = ["a","a","b","b","c","c","c"]
<b>Output:</b> Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
<b>Explanation:</b> The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
</pre>

<h3>Example 2:</h3>
<pre>
<b>Input:</b> chars = ["a"]
<b>Output:</b> Return 1, and the first character of the input array should be: ["a"]
<b>Explanation:</b> Only one character, no compression needed.
</pre>

<h3>Example 3:</h3>
<pre>
<b>Input:</b> chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
<b>Output:</b> Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"]
<b>Explanation:</b> The group "bbbbbbbbbbbb" compresses to "b12".
</pre>

<hr>
<h3>Constraints:</h3>
<ul>
  <li><code>1 &lt;= chars.length &lt;= 2000</code></li>
  <li><code>chars[i]</code> is a lowercase or uppercase English letter, digit, or symbol.</li>
</ul>
