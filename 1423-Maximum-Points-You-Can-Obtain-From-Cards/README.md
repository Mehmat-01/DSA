<h2><a href="https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/">1423. Maximum Points You Can Obtain from Cards</a></h2>
<h3>Medium</h3>
<hr>
<p>There are several cards arranged in a row, and each card has an associated number of points. The points are given in the integer array <code>cardPoints</code>.</p>
<p>In one step, you can take one card from the beginning or from the end of the row. You have to take exactly <code>k</code> cards.</p>
<p>Your score is the sum of the points of the cards you have taken.</p>
<p>Given the integer array <code>cardPoints</code> and the integer <code>k</code>, return the <em>maximum score</em> you can obtain.</p>

<h3>Example 1:</h3>
<pre>
<b>Input:</b> cardPoints = [1,2,3,4,5,6,1], k = 3
<b>Output:</b> 12
<b>Explanation:</b> After picking the first two cards and the last card, your score is 1 + 2 + 6 + 1 = 12.
</pre>

<h3>Example 2:</h3>
<pre>
<b>Input:</b> cardPoints = [2,2,2], k = 2
<b>Output:</b> 4
</pre>

<h3>Example 3:</h3>
<pre>
<b>Input:</b> cardPoints = [9,7,7,9,7,7,9], k = 7
<b>Output:</b> 55
</pre>

<hr>
<h3>Constraints:</h3>
<ul>
  <li><code>1 &lt;= cardPoints.length &lt;= 10<sup>5</sup></code></li>
  <li><code>1 &lt;= cardPoints[i] &lt;= 10<sup>4</sup></code></li>
  <li><code>1 &lt;= k &lt;= cardPoints.length</code></li>
</ul>
