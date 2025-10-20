<h2><a href="https://leetcode.com/problems/search-in-rotated-sorted-array-ii">81. Search in Rotated Sorted Array II</a></h2>
<h3>Medium</h3>
<hr>

<p>There is an integer array <code>nums</code> sorted in non-decreasing order (not necessarily with distinct values).</p>

<p>Prior to being passed to your function, <code>nums</code> is <strong>possibly rotated</strong> at an unknown pivot index 
<code>k</code> (<code>0 &lt;= k &lt; nums.length</code>) such that the resulting array is 
<code>[nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]</code> (<strong>0-indexed</strong>).</p>

<p>For example, <code>[0,0,1,2,2,5,6]</code> might be rotated at pivot index <code>3</code> and become 
<code>[2,5,6,0,0,1,2]</code>.</p>

<p>Given the array <code>nums</code> <strong>after</strong> the possible rotation and an integer <code>target</code>, 
return <code>true</code> <em>if</em> <code>target</code> <em>is in</em> <code>nums</code>, or <code>false</code> 
<em>if it is not in</em> <code>nums</code>.</p>

<p>You must decrease the overall operation steps as much as possible.</p>

<p>&nbsp;</p>

<p><strong class="example">Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [2,5,6,0,0,1,2], target = 0
<strong>Output:</strong> true
</pre>

<p><strong class="example">Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [2,5,6,0,0,1,2], target = 3
<strong>Output:</strong> false
</pre>

<p>&nbsp;</p>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>1 &lt;= nums.length &lt;= 5000</code></li>
  <li><code>-10<sup>4</sup> &lt;= nums[i] &lt;= 10<sup>4</sup></code></li>
  <li><code>-10<sup>4</sup> &lt;= target &lt;= 10<sup>4</sup></code></li>
</ul>
