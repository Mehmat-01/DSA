<h2><a href="https://leetcode.com/problems/capacity-to-ship-packages-within-d-days">1011. Capacity To Ship Packages Within D Days</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given an array <code>weights</code> representing the weights of packages and an integer <code>days</code> representing the number of days within which you must ship all packages.</p>
<p>Each day, you load packages in the given order onto a ship. The ship has a weight capacity that must not be exceeded. Return the least weight capacity of the ship that will result in all the packages being shipped within the given number of days.</p>

<hr>
<h3>Example 1:</h3>
<pre>
<b>Input:</b> weights = [1,2,3,1,1], days = 4
<b>Output:</b> 3
<b>Explanation:</b> 
A ship capacity of 3 is the minimum to ship all packages in 4 days as follows:
Day 1: 1, 2
Day 2: 3
Day 3: 1
Day 4: 1
</pre>

<h3>Example 2:</h3>
<pre>
<b>Input:</b> weights = [3,2,2,4,1,4], days = 3
<b>Output:</b> 6
<b>Explanation:</b> 
A ship capacity of 6 can ship all packages in 3 days:
Day 1: 3, 2
Day 2: 2, 4
Day 3: 1, 4
</pre>

<hr>
<h3>Constraints:</h3>
<ul>
  <li><code>1 &lt;= weights.length &lt;= 5 * 10<sup>4</sup></code></li>
  <li><code>1 &lt;= weights[i] &lt;= 500</code></li>
  <li><code>1 &lt;= days &lt;= weights.length</code></li>
</ul>