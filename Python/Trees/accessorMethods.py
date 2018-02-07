'''
T.root(): 
Return the position of the root of tree T, or None if T is empty.

T.is root(p):
Return True if position p is the root of Tree T. 

T.parent(p):
Return the position of the parent of position p,
or None if p is the root of T.

T.num_children(p): 
Return the number of children of position p.

T.children(p): 
Generate an iteration of the children of position p.

T.is leaf(p): 
Return True if position p does not have any children.

len(T):
Return the number of positions (and hence elements) that are contained in tree T.

T.is empty( ): 
Return True if tree T does not contain any positions. 

T.positions(): 
Generate an iteration of all positions of tree T.

iter(T):
Generate an iteration of all elements stored within tree T
'''




# Binary Tree Accessors
'''
T.add root(e):
Create a root for an empty tree, storing e as the element, and return the position of that root; 
an error occurs if the tree is not empty.

T.add left(p, e):
Create a new node storing element e, link the node as the left child of position p, 
and return the resulting position; an error occurs if p already has a left child.

T.add right(p, e):
Create a new node storing element e, link the node as the right child of position p, 
and return the resulting position; an error occurs if p already has a right child.

T.replace(p, e): 
Replace the element stored at position p with element e, and return the previously stored element.

T.delete(p):
Remove the node at position p, replacing it with its child, if any, 
and return the element that had been stored at p; an error occurs if p has two children.

T.attach(p, T1, T2):
Attach the internal structure of trees T1 and T2, respec- tively, 
as the left and right subtrees of leaf position p of T, and reset T1 and T2 to empty trees; 
an error condition occurs if p is not a leaf.
'''