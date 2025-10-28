<h2><a href="https://leetcode.com/problems/remove-element">27. Remove Element</a></h2>
<h3>Easy</h3>
<hr>
<p>Given an integer array <code>nums</code> and an integer <code>val</code>, remove all occurrences of <code>val</code> in <code>nums</code> <em>in-place</em>. The relative order of the elements may be changed.</p>
<p>Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array <code>nums</code>. More formally, if there are <code>k</code> elements after removing the duplicates, then the first <code>k</code> elements of <code>nums</code> should hold the final result. It does not matter what you leave beyond the first <code>k</code> elements.</p>
<p>Return <code>k</code> after placing the final result in the first <code>k</code> slots of <code>nums</code>.</p>

<h3>Example 1:</h3>
<pre>
<b>Input:</b> nums = [3,2,2,3], val = 3
<b>Output:</b> 2, nums = [2,2,_,_]
<b>Explanation:</b> Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).
</pre>

<h3>Example 2:</h3>
<pre>
<b>Input:</b> nums = [0,1,2,2,3,0,4,2], val = 2
<b>Output:</b> 5, nums = [0,1,3,0,4,_,_,_]
<b>Explanation:</b> Your function should return k = 5, with the first five elements containing 0, 1, 3, 0, and 4.
</pre>

<hr>
<h3>Constraints:</h3>
<ul>
  <li><code>0 &lt;= nums.length &lt;= 100</code></li>
  <li><code>0 &lt;= nums[i] &lt;= 50</code></li>
  <li><code>0 &lt;= val &lt;= 100</code></li>
</ul>
