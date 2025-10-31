<h2><a href="https://leetcode.com/problems/remove-outermost-parentheses/">1021. Remove Outermost Parentheses</a></h2>
<h3>Easy</h3>
<hr>
<p>A valid parentheses string is either empty <code>""</code>, <code>"("</code> + <em>A</em> + <code>")"</code>, or <em>A</em> + <em>B</em>, where <em>A</em> and <em>B</em> are valid parentheses strings, and <code>+</code> represents string concatenation.</p>
<p>For example, <code>""</code>, <code>"()"</code>, <code>"(())()"</code>, and <code>"(()(()))"</code> are all valid parentheses strings.</p>
<p>A valid parentheses string <em>s</em> is primitive if it is nonempty, and there does not exist a way to split it into <em>A</em> + <em>B</em>, with both <em>A</em> and <em>B</em> nonempty valid parentheses strings.</p>
<p>Given a valid parentheses string <code>s</code>, consider its primitive decomposition: <code>s = P<sub>1</sub> + P<sub>2</sub> + ... + P<sub>k</sub></code>, where <code>P<sub>i</sub></code> are primitive valid parentheses strings.</p>
<p>Return <em>s</em> after removing the outermost parentheses of every primitive string in the decomposition.</p>

<h3>Example 1:</h3>
<pre>
<b>Input:</b> s = "(()())(())"
<b>Output:</b> "()()()"
<b>Explanation:</b> 
The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
After removing outer parentheses of each part, this is "()()" + "()" = "()()()".
</pre>

<h3>Example 2:</h3>
<pre>
<b>Input:</b> s = "(()())(())(()(()))"
<b>Output:</b> "()()()()(())"
<b>Explanation:</b> 
The input string is "(()())(())(()(()))", with primitive decomposition "(()())" + "(())" + "(()(()))".
After removing outer parentheses of each part, this is "()()" + "()" + "()(())" = "()()()()(())".
</pre>

<h3>Example 3:</h3>
<pre>
<b>Input:</b> s = "()()"
<b>Output:</b> ""
<b>Explanation:</b> 
The input string is "()()", with primitive decomposition "()" + "()".
After removing outer parentheses of each part, we get "" + "" = "".
</pre>

<hr>
<h3>Constraints:</h3>
<ul>
  <li><code>1 &lt;= s.length &lt;= 10<sup>5</sup></code></li>
  <li><code>s[i]</code> is either <code>'('</code> or <code>')'</code>.</li>
  <li><code>s</code> is a valid parentheses string.</li>
</ul>
