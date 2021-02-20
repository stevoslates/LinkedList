public class linkedList {
    Node head;

    /** INSERTION **/
    public void push(int new_data){ //this is adding a new node to the front
        Node new_node = new Node(new_data);
        new_node.next = head; //make the next of new node as the head
        head = new_node;
    }

    public void insert_after(Node prev_node, int new_data){
        if (prev_node == null)
        {
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node new_node = new Node(new_data);

        new_node.next = prev_node.next; //inserting after prev node so its next must point to the node that
        //prev node was initially pointing to

        prev_node.next = new_node;
    }

    public void appendOnTheEnd(int new_data)
    {
        Node new_node = new Node(new_data);

        //if list is null make this node the new head.
        if (head == null)
        {
            head = new Node(new_data);
            return;
        }

        //new node is the last node so its next needs to point to null
        new_node.next = null;

        //go through all the nodes till the very end one and when there point this node to the new one
        Node last = head;
        while (last.next != null)
            last = last.next;

        last.next = new_node;

        return;
    }

    /** DELETION **/
    public void deleteAtPos (int pos) {
        //As java has automatic garbage collection there is no need to delete the memory of the deleted item in the
        //linked list as this is done automatically.

        if (head == null)
            return;

        Node posBefore = head;
        // If head needs to be removed
        if (pos == 0)
        {
            head = posBefore.next;   // Change head
            return;
        }

        for (int i = 0 ; i < pos - 1 && posBefore != null; i++) {
            posBefore = posBefore.next;
        }

        if (posBefore == null || posBefore.next == null)
            return;

        // Node temp->next is the node to be deleted
        // Store pointer to the next of node to be deleted
        Node next = posBefore.next.next;

        posBefore.next = next;  // Unlink the deleted node from list

    }

    /** FIND LENGTH **/

    public int listLength() {
       Node start = head;
       if (start == null) {
           return 0;
       } else if (start.next == null) {
           return 1;
       }

       int count = 0;
       while (start != null) {
           start = start.next;
           count++;
        }
       return count;
    }

    /** GET NODE  **/

    public int getNode(int pos) {
       int count = 0;
       Node current = head;

       while (current != null) {
           if (count == pos) {
               return current.data;
           }
           count++;
           current = current.next;
       }
       return 0;
    }



    /** PRINT  **/
    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }
}
