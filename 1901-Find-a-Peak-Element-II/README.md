<h2><a href="https://leetcode.com/problems/find-a-peak-element-ii">1901. Find a Peak Element II</a></h2>
<h3>Medium</h3>
<hr>
<p>A <b>peak element</b> in a 2D grid is an element that is strictly greater than all of its adjacent neighbors (left, right, top, bottom).</p>
<p>Given a 0-indexed <code>m x n</code> matrix <code>mat</code> where no two adjacent cells are equal, find <i>any</i> peak element <code>mat[i][j]</code> and return the length-2 array <code>[i, j]</code>.</p>
<p>You may assume the matrix is surrounded by an outer perimeter with value <code>-1</code> (so an edge element can be a peak). Your algorithm must run in <code>O(m log n)</code> or <code>O(n log m)</code> time.</p>

<hr>
<h3>Example 1:</h3>
<pre>
<b>Input:</b> mat = [[1,4,3,2],
              [9,5,6,7],
              [8,10,11,12]]
<b>Output:</b> [1,0]
<b>Explanation:</b> mat[1][0] = 9 is a peak (9 &gt; 1, 9 &gt; 8, 9 &gt; 5).
</pre>

<h3>Example 2:</h3>
<pre>
<b>Input:</b> mat = [[10,20,15],
              [21,30,14],
              [7,16,32]]
<b>Output:</b> [1,1]
<b>Explanation:</b> mat[1][1] = 30 is a peak (30 &gt; 20, 30 &gt; 14, 30 &gt; 21, 30 &gt; 16).
</pre>

<hr>
<h3>Constraints:</h3>
<ul>
  <li><code>m == mat.length</code></li>
  <li><code>n == mat[i].length</code></li>
  <li><code>1 &lt;= m, n &lt;= 500</code></li>
  <li>All adjacent cells have different values (no two adjacent equal).</li>
  <li><code>-10^9 &lt;= mat[i][j] &lt;= 10^9</code></li>
</ul>
