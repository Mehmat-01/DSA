<h2><a href="https://leetcode.com/problems/roman-to-integer/">13. Roman to Integer</a></h2>
<h3>Easy</h3>
<hr>
<p>Roman numerals are represented by seven different symbols: <code>I</code>, <code>V</code>, <code>X</code>, <code>L</code>, <code>C</code>, <code>D</code>, and <code>M</code>.</p>

<pre>
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
</pre>

<p>For example, <code>2</code> is written as <code>II</code> in Roman numeral, just two ones added together. <code>12</code> is written as <code>XII</code>, which is simply <code>X + II</code>. The number <code>27</code> is written as <code>XXVII</code>, which is <code>XX + V + II</code>.</p>

<p>Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not <code>IIII</code>. Instead, the number four is written as <code>IV</code>. Because the one is before the five, we subtract it making four. The same principle applies to the number nine, which is written as <code>IX</code>.</p>

<p>There are six instances where subtraction is used:</p>
<ul>
  <li><code>I</code> can be placed before <code>V</code> (5) and <code>X</code> (10) to make 4 and 9.</li>
  <li><code>X</code> can be placed before <code>L</code> (50) and <code>C</code> (100) to make 40 and 90.</li>
  <li><code>C</code> can be placed before <code>D</code> (500) and <code>M</code> (1000) to make 400 and 900.</li>
</ul>

<p>Given a Roman numeral, convert it to an integer.</p>

<h3>Example 1:</h3>
<pre>
<b>Input:</b> s = "III"
<b>Output:</b> 3
<b>Explanation:</b> III = 3.
</pre>

<h3>Example 2:</h3>
<pre>
<b>Input:</b> s = "LVIII"
<b>Output:</b> 58
<b>Explanation:</b> L = 50, V= 5, III = 3.
</pre>

<h3>Example 3:</h3>
<pre>
<b>Input:</b> s = "MCMXCIV"
<b>Output:</b> 1994
<b>Explanation:</b> M = 1000, CM = 900, XC = 90, and IV = 4.
</pre>

<hr>
<h3>Constraints:</h3>
<ul>
  <li><code>1 &lt;= s.length &lt;= 15</code></li>
  <li><code>s</code> contains only the characters <code>('I', 'V', 'X', 'L', 'C', 'D', 'M')</code>.</li>
  <li>It is guaranteed that <code>s</code> is a valid Roman numeral in the range <code>[1, 3999]</code>.</li>
</ul>
