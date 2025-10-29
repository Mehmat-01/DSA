<h2><a href="https://leetcode.com/problems/search-a-2d-matrix/">74. Search a 2D Matrix</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given an <code>m x n</code> integer matrix <code>matrix</code> with the following two properties:</p>
<ul>
  <li>Each row is sorted in non-decreasing order.</li>
  <li>The first integer of each row is greater than the last integer of the previous row.</li>
</ul>
<p>Given an integer <code>target</code>, return <code>true</code> if <code>target</code> is in <code>matrix</code> or <code>false</code> otherwise.</p>
<p>You must write a solution in <strong>O(log(m * n))</strong> time complexity.</p>

<h3>Example 1:</h3>
<pre>
<b>Input:</b> matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
<b>Output:</b> true
</pre>

<h3>Example 2:</h3>
<pre>
<b>Input:</b> matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
<b>Output:</b> false
</pre>

<hr>
<h3>Constraints:</h3>
<ul>
  <li><code>m == matrix.length</code></li>
  <li><code>n == matrix[i].length</code></li>
  <li><code>1 &lt;= m, n &lt;= 100</code></li>
  <li><code>-10<sup>4</sup> &lt;= matrix[i][j], target &lt;= 10<sup>4</sup></code></li>
</ul>
