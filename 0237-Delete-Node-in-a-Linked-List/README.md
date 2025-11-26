<h2><a href="https://leetcode.com/problems/delete-node-in-a-linked-list/">237. Delete Node in a Linked List</a></h2>
<h3>Medium</h3>
<hr>
<p>There is a singly-linked list, and you are given the <strong>node</strong> to be deleted. You are <strong>not given access</strong> to the head of the list.</p>
<p>You should delete the given node from the linked list. Note that deleting the node means:</p>
<ul>
  <li>You cannot access the previous node.</li>
  <li>You must modify only the given node.</li>
</ul>

<p>It is guaranteed that the node to be deleted is <strong>not a tail node</strong>.</p>

<h3>Example 1:</h3>
<pre>
<b>Input:</b> head = [4,5,1,9], node = 5
<b>Output:</b> [4,1,9]
</pre>

<h3>Example 2:</h3>
<pre>
<b>Input:</b> head = [4,5,1,9], node = 1
<b>Output:</b> [4,5,9]
</pre>

<hr>
<h3>Constraints:</h3>
<ul>
  <li>The number of nodes in the list is in the range <code>[2, 1000]</code>.</li>
  <li><code>-1000 &lt;= Node.val &lt;= 1000</code></li>
  <li>The node to be deleted is <strong>not</strong> the tail node.</li>
</ul>
