public class test {
    public static void main(String[] args) {
        linkedList llist = new linkedList();

        llist.appendOnTheEnd(90);
        llist.push(65);
        llist.appendOnTheEnd(75);

        llist.insert_after(llist.head.next,75);
        //llist.deleteAtPos();


        System.out.println("The new linked list created is: ");
        llist.printList();
        System.out.println();
        System.out.println("Linked list has length of: " + llist.listLength());

        if (llist.getNode(0) == 0) {
            System.out.println("Index doesn't exist");
        } else {
            System.out.println(llist.getNode(0));
        }

    }
}
