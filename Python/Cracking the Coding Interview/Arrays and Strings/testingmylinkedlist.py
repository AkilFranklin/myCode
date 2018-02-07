class Node(object):

    def __init__(self, data, next=None):

        self.data = data
        self.next = next

    def __str__(self):
        return str(self.data)

class LinkedList(object):



    def __init__(self):

        self.head = None
        self.size = 0


    def append(self, data):
            if not self.head:
                n = Node(data)
                self.head = n
                return
            else:
                n = self.head

                while n.next != None:
                    n = n.next

                new_node = Node(data)
                n.next = new_node;
                return

    def delete(self, head, data):
		n = head

    	if n.data == data:
    		return head.next

    	while n.next != null:
    		if n.next.data == data:
    			n.next = n.next.next
    			return head
    		n = n.next
    	return head



    def isEmpty(self):
        return not self.head

    def printList(self):
        n = self.head

        while n:
            print (n)
            n = n.next

ll = LinkedList()
elems = [1, 2, 3, 54, 6]
for elem in elems:
    ll.append(elem)

ll.printList()
ll.delete(ll.head, 3)
