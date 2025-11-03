<h2><a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/">122. Best Time to Buy and Sell Stock II</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given an integer array <code>prices</code> where <code>prices[i]</code> is the price of a given stock on the <code>i<sup>th</sup></code> day.</p>

<p>On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it and immediately sell it on the same day.</p>

<p>Find and return the <em>maximum profit</em> you can achieve.</p>

<h3>Example 1:</h3>
<pre>
<b>Input:</b> prices = [7,1,5,3,6,4]
<b>Output:</b> 7
<b>Explanation:</b> Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
Total profit = 4 + 3 = 7.
</pre>

<h3>Example 2:</h3>
<pre>
<b>Input:</b> prices = [1,2,3,4,5]
<b>Output:</b> 4
<b>Explanation:</b> Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
Total profit = 4.
</pre>

<h3>Example 3:</h3>
<pre>
<b>Input:</b> prices = [7,6,4,3,1]
<b>Output:</b> 0
<b>Explanation:</b> No transactions are done and the max profit = 0.
</pre>

<hr>
<h3>Constraints:</h3>
<ul>
  <li><code>1 &lt;= prices.length &lt;= 3 * 10<sup>4</sup></code></li>
  <li><code>0 &lt;= prices[i] &lt;= 10<sup>4</sup></code></li>
</ul>
