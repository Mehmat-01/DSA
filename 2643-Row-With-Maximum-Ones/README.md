<h2><a href="https://leetcode.com/problems/row-with-maximum-ones/">2643. Row With Maximum Ones</a></h2>
<h3>Easy</h3>
<hr>
<p>You are given a <code>m x n</code> binary matrix <code>mat</code> of <code>0</code>'s and <code>1</code>'s.</p>
<p>Return the index of the row that contains the maximum number of <code>1</code>'s, and the number of <code>1</code>'s in that row, as an array <code>[rowIndex, maxOnes]</code>.</p>
<p>If there are multiple rows with the same maximum number of <code>1</code>'s, return the one with the smallest index.</p>

<h3>Example 1:</h3>
<pre>
<b>Input:</b> mat = [[0,1],[1,0]]
<b>Output:</b> [0,1]
<b>Explanation:</b> Both rows have the same number of 1's, so row index 0 is returned.
</pre>

<h3>Example 2:</h3>
<pre>
<b>Input:</b> mat = [[0,0,0],[0,1,1]]
<b>Output:</b> [1,2]
<b>Explanation:</b> Row 1 has 2 ones, which is the maximum.
</pre>

<h3>Example 3:</h3>
<pre>
<b>Input:</b> mat = [[0,0],[1,1],[0,0]]
<b>Output:</b> [1,2]
</pre>

<hr>
<h3>Constraints:</h3>
<ul>
  <li><code>m == mat.length</code></li>
  <li><code>n == mat[i].length</code></li>
  <li><code>1 &lt;= m, n &lt;= 100</code></li>
  <li><code>mat[i][j]</code> is either <code>0</code> or <code>1</code>.</li>
</ul>
