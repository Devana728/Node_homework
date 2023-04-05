package node_nomework;

public class List {
    private Node head;
    private Node tail;



    public void add(int value) {
        Node node = new Node();
        node.value = value;
        if (head == null) {
            head = node;
            tail = node;
        }else{
            tail.setNextNode(node);
            node.setPreviousNode(tail);
            tail = node;


        }
    }



    public void revert() {
        Node currentNode = head;
        while (currentNode != null) {
            Node next = currentNode.getNextNode();
            Node previous = currentNode.getPreviousNode();
            currentNode.setNextNode(previous);
            currentNode.setPreviousNode(next);
            if (previous == null) {
                tail = currentNode;
            }
            if (next == null) {
                head = currentNode;
            }
            currentNode = next;
        }
    }
    public static void printList(List list) {
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.value + " ");

            // Go to next node
            currNode = currNode.getNextNode();
        }

        System.out.println();
    }
}