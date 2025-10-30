<h2><a href="https://leetcode.com/problems/search-a-2d-matrix-ii/">240. Search a 2D Matrix II</a></h2>
<h3>Medium</h3>
<hr>
<p>Write an efficient algorithm that searches for a value <code>target</code> in an <code>m x n</code> integer matrix <code>matrix</code>. This matrix has the following properties:</p>
<ul>
  <li>Integers in each row are sorted in ascending order from left to right.</li>
  <li>Integers in each column are sorted in ascending order from top to bottom.</li>
</ul>

<h3>Example 1:</h3>
<pre>
<b>Input:</b> matrix =[[1,4,7,11,15],
                [2,5,8,12,19],
                [3,6,9,16,22],
                [10,13,14,17,24],
                [18,21,23,26,30]], target = 5
<b>Output:</b> true
</pre>

<h3>Example 2:</h3>
<pre>
<b>Input:</b> matrix = [[1,4,7,11,15],
                [2,5,8,12,19],
                [3,6,9,16,22],
                [10,13,14,17,24],
                [18,21,23,26,30]], target = 20
<b>Output:</b> false
</pre>

<hr>
<h3>Constraints:</h3>
<ul>
  <li><code>m == matrix.length</code></li>
  <li><code>n == matrix[i].length</code></li>
  <li><code>1 &lt;= n, m &lt;= 300</code></li>
  <li><code>-10<sup>9</sup> &lt;= matrix[i][j] &lt;= 10<sup>9</sup></code></li>
  <li>All the integers in each row and column are unique.</li>
  <li><code>-10<sup>9</sup> &lt;= target &lt;= 10<sup>9</sup></code></li>
</ul>
