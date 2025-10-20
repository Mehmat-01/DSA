<h2><a href="https://leetcode.com/problems/find-minimum-in-rotated-sorted-array">153. Find Minimum in Rotated Sorted Array</a></h2>
<h3>Easy</h3>
<hr>

<p>Suppose an array of length <code>n</code> sorted in ascending order is rotated between <code>1</code> and <code>n</code> times.  
For example, the array <code>nums = [0,1,2,4,5,6,7]</code> might become:</p>

<ul>
  <li><code>[4,5,6,7,0,1,2]</code> if it was rotated 4 times.</li>
  <li><code>[0,1,2,4,5,6,7]</code> if it was rotated 7 times.</li>
</ul>

<p>Given the rotated array <code>nums</code> of unique elements, return <code>the minimum element</code> of this array.</p>

<p>You must write an algorithm that runs in <code>O(log n)</code> time.</p>

<p>&nbsp;</p>

<p><strong class="example">Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [3,4,5,1,2]
<strong>Output:</strong> 1
</pre>

<p><strong class="example">Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [4,5,6,7,0,1,2]
<strong>Output:</strong> 0
</pre>

<p><strong class="example">Example 3:</strong></p>
<pre>
<strong>Input:</strong> nums = [11,13,15,17]
<strong>Output:</strong> 11
</pre>

<p>&nbsp;</p>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>1 &lt;= nums.length &lt;= 5000</code></li>
  <li><code>-10<sup>4</sup> &lt;= nums[i] &lt;= 10<sup>4</sup></code></li>
  <li>All integers of <code>nums</code> are <strong>unique</strong>.</li>
  <li><code>nums</code> is an ascending array that is possibly rotated.</li>
</ul>
