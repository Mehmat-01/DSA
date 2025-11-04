<h2><a href="https://leetcode.com/problems/string-to-integer-atoi/">8. String to Integer (atoi)</a></h2>
<h3>Medium</h3>
<hr>
<p>Implement the <code>myAtoi(string s)</code> function, which converts a string to a 32-bit signed integer (similar to the C/C++ <code>atoi</code> function).</p>

<p>The algorithm for <code>myAtoi(string s)</code> is as follows:</p>
<ul>
  <li>Read in and ignore any leading whitespace.</li>
  <li>Check if the next character (if not already at the end of the string) is <code>'-'</code> or <code>'+'</code>. Read this character in if it exists. This determines if the final result is negative or positive. Assume the result is positive if neither is present.</li>
  <li>Read in the next characters until the next non-digit character or the end of the input is reached. The rest of the string is ignored.</li>
  <li>Convert these digits into an integer (i.e. <code>"123" → 123</code>, <code>"0032" → 32</code>). If no digits were read, then the integer is <code>0</code>.</li>
  <li>Change the sign as necessary (from step 2).</li>
  <li>If the integer is out of the 32-bit signed integer range <code>[-2³¹, 2³¹ - 1]</code>, clamp it so that it remains in the range. Specifically, integers less than <code>-2³¹</code> should be clamped to <code>-2³¹</code>, and integers greater than <code>2³¹ - 1</code> should be clamped to <code>2³¹ - 1</code>.</li>
  <li>Return the integer as the final result.</li>
</ul>

<h3>Example 1:</h3>
<pre>
<b>Input:</b> s = "42"
<b>Output:</b> 42
<b>Explanation:</b> The underlined characters are what is read in, the caret is the current reader position.
Step 1: "42" (no characters read because there is no leading whitespace)
Step 2: "42" (no characters read because there is neither a '-' nor '+')
Step 3: "42" ("42" is read in)
</pre>

<h3>Example 2:</h3>
<pre>
<b>Input:</b> s = "   -42"
<b>Output:</b> -42
<b>Explanation:</b>
Step 1: "   -42" (leading whitespace is read and ignored)
Step 2: "   -42" ('-' is read, so the result should be negative)
Step 3: "   -42" ("42" is read in)
</pre>

<h3>Example 3:</h3>
<pre>
<b>Input:</b> s = "4193 with words"
<b>Output:</b> 4193
<b>Explanation:</b> "4193" is read; since the next non-digit character is encountered, the reading stops.
</pre>

<hr>
<h3>Constraints:</h3>
<ul>
  <li><code>0 &lt;= s.length &lt;= 200</code></li>
  <li><code>s</code> consists of English letters (upper-case and lower-case), digits (<code>0-9</code>), <code>' '</code>, <code>'+'</code>, <code>'-'</code>, and <code>'.'</code>.</li>
</ul>
