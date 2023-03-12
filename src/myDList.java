public class myDList {
    Node head;
    Node tail;

    private class Node {
        int value;
        Node next;
        Node prev;
    }

    public void push(int pos, int value) {
        Node node = new Node();
        node.value = value;

        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        if (pos == 0) {
            node.next = head;
            head.prev = node;
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
        if (next != null) {
            next.prev = node;
        } else {
            tail = node;
        }
        current.next = node;
        node.next = next;
        node.prev = current;
    }

    public void pop(int pos) {
        if (head == null) {
            System.out.println("Список пустой");
            return;
        }

        if (pos == 0) {
            head = head.next;
            head.prev = null;
//            if (head.next == null) {
//                tail = head;
//            }
            return;
        }

        Node current = head;
        int index = 0;

        while (current.next != null && index < pos - 1) {
            current = current.next;
            index++;
        }
        Node next = current.next.next;
        if (next == null)  {
            current.next = null;
            tail = current;
            return;
        }


        current.next = next;
        next.prev = current;
        return;
    }

    public void revert() {
        Node current = head;
        tail = current;

        while (current != null) {
            Node next = current.next;
            Node prev = current.prev;
            current.next = prev;
            current.prev = next;
//            if (prev == null) {
//                tail = current;
//            }
            if (next == null) {
                head = current;
            }
            current = next;

        }
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.printf("%d ", current.value);
            current = current.next;
        }
        System.out.println();
    }

    public void revertPrint() {
        Node current = tail;
        while (current != null) {
            System.out.printf("%d ", current.value);
            current = current.prev;
        }
        System.out.println();
    }

    public void sort() {
        boolean sorted = true;
        while (sorted) {
            sorted = false;
            Node current = head;
            while (current != null) {
                if (current.next != null) {
                    if (current.value > current.next.value) {
                        Node prev = current.prev;
                        Node next = current.next.next;
                        Node node = current.next;

                        if (prev != null) {
                            prev.next = node;
                        } else {
                            head = node;
                        }
                        if (next != null) {
                            next.prev = current;
                        } else {
                            tail = current;
                        }
                        current.next = next;
                        current.prev = node;
                        node.next = current;
                        node.prev = prev;


                        sorted = true;
                    }

                }
                current = current.next;
            }
        }
    }
}
