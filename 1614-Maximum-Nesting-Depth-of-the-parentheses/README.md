<h2><a href="https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses">1614. Maximum Nesting Depth of the Parentheses</a></h2>
<h3>Easy</h3>
<hr>
<p>Given a valid parentheses string <code>s</code>, return the <em>maximum nesting depth</em> of the parentheses in <code>s</code>.</p>
<p>The nesting depth of a string is the maximum number of parentheses that are open at the same time.</p>

<h3>Example 1:</h3>
<pre>
<b>Input:</b> s = "(1+(2*3)+((8)/4))+1"
<b>Output:</b> 3
<b>Explanation:</b> The substring "((8)/4)" is nested 3 levels deep.
</pre>

<h3>Example 2:</h3>
<pre>
<b>Input:</b> s = "(1)+((2))+(((3)))"
<b>Output:</b> 3
</pre>

<h3>Example 3:</h3>
<pre>
<b>Input:</b> s = "1+(2*3)/(2-1)"
<b>Output:</b> 1
</pre>
