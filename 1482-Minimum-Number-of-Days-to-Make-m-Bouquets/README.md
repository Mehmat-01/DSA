<h2><a href="https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets">1482. Minimum Number of Days to Make m Bouquets</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given an integer array <code>bloomDay</code>, an integer <code>m</code> and an integer <code>k</code>.</p>
<p>You need to make <code>m</code> bouquets. To make one bouquet, you need to use <code>k</code> <strong>adjacent flowers</strong> from the garden.</p>
<p>The garden consists of <code>n</code> flowers, the <code>i<sup>th</sup></code> flower will bloom in <code>bloomDay[i]</code> days and then can be used in exactly one bouquet.</p>
<p>Return <em>the minimum number of days</em> you need to wait to be able to make <code>m</code> bouquets from the garden. If it is impossible to make m bouquets, return <code>-1</code>.</p>

<hr>
<h3>Example 1:</h3>
<pre>
<b>Input:</b> bloomDay = [1,10,3,10,2], m = 3, k = 1
<b>Output:</b> 3
<b>Explanation:</b> 
Let's see what happened in the first 3 days.
Day 1: [b, x, x, x, x] -> you can only make 1 bouquet of the first flower.
Day 2: [b, x, x, x, b] -> you can make 2 bouquets of the first and last flowers.
Day 3: [b, x, b, x, b] -> you can make 3 bouquets.
Thus, you need to wait 3 days to make 3 bouquets.
</pre>

<h3>Example 2:</h3>
<pre>
<b>Input:</b> bloomDay = [1,10,3,10,2], m = 3, k = 2
<b>Output:</b> -1
<b>Explanation:</b> 
You need 6 flowers to make 3 bouquets of 2 adjacent flowers each, 
but there are only 5 flowers.
</pre>

<h3>Example 3:</h3>
<pre>
<b>Input:</b> bloomDay = [7,7,7,7,12,7,7], m = 2, k = 3
<b>Output:</b> 12
<b>Explanation:</b> 
We need 2 bouquets of 3 flowers each.
After 7 days, the garden looks like [b,b,b,b,x,b,b]. 
We can make only 1 bouquet of the first 3 flowers.
After 12 days, all flowers bloom: [b,b,b,b,b,b,b], and we can make 2 bouquets.
</pre>

<hr>
<h3>Constraints:</h3>
<ul>
<li><code>bloomDay.length == n</code></li>
<li><code>1 ≤ n ≤ 10<sup>5</sup></code></li>
<li><code>1 ≤ bloomDay[i] ≤ 10<sup>9</sup></code></li>
<li><code>1 ≤ m ≤ 10<sup>6</sup></code></li>
<li><code>1 ≤ k ≤ n</code></li>
</ul>

