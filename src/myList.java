public class myList {
    Node head;

    private class Node {
        int value;
        Node next;
    }

    public void push(int pos, int value) {
        Node node = new Node();
        node.value = value;

        if (head == null) {
            head = node;
            return;
        }

        if (pos == 0) {
            node.next = head;
            head = node;
            return;
        }

        Node current = head;
        int index = 0;
        while (current.next != null && index < pos - 1) {
            current = current.next;
            index++;
        }
            Node next = current.next;
            current.next = node;
            node.next = next;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.printf("%d ", current.value);
            current = current.next;
        }
        System.out.println();
    }


}
