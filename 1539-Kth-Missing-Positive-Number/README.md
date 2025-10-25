<h2><a href="https://leetcode.com/problems/kth-missing-positive-number">1539. Kth Missing Positive Number</a></h2>
<h3>Easy</h3>
<hr>
<p>Given an array <code>arr</code> of positive integers sorted in a strictly increasing order, and an integer <code>k</code>, return the <code>k<sup>th</sup></code> positive integer that is missing from this array.</p>

<h3>Example 1:</h3>
<pre>
<b>Input:</b> arr = [2,3,4,7,11], k = 5
<b>Output:</b> 9
<b>Explanation:</b> The missing positive integers are [1,5,6,8,9]. The 5<sup>th</sup> missing positive integer is 9.
</pre>

<h3>Example 2:</h3>
<pre>
<b>Input:</b> arr = [1,2,3,4], k = 2
<b>Output:</b> 6
<b>Explanation:</b> The missing positive integers are [5,6,7,...]. The 2<sup>nd</sup> missing positive integer is 6.
</pre>

<h3>Constraints:</h3>
<ul>
  <li><code>1 &lt;= arr.length &lt;= 100</code></li>
  <li><code>1 &lt;= arr[i] &lt;= 1000</code></li>
  <li><code>arr[i] &lt; arr[i+1]</code></li>
  <li><code>1 &lt;= k &lt;= 1000</code></li>
</ul>

