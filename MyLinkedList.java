package Collections.MyLinkedList;

public class MyLinkedList<E> {
    private Node header = null;
    private int count = 0;

    private Node size() {
        Node temp = header;
        if (temp.getNext() != null) {
            temp = temp.getNext();
        }
        return temp;
    }

    public void add(E element) {
        if (count == 0) {
            header = new Node(element, null);
        } else {
            Node node = new Node(element, null);
            Node lastNode = this.size();
            lastNode.setNext(node);
        }
        count++;
    }

    public void remove(E elem) {
        int countU = 0;
        Node temp = header;
        for (int i = 0; i < count; i++) {
            if (temp.getElement() == elem)
                countU++;
            temp = temp.getNext();
        }

        for (int i = 0; i < countU; i++) {
            Node cur = header;
            Node pv = header;

            if (header.getElement() == elem) {
                header = header.getNext();
                continue;
            }

            while (cur.getElement() != elem)
                cur = cur.getNext();

            while (pv.getNext().getElement() != elem)
                pv = pv.getNext();

            pv.setNext(cur.getNext());
            cur.setNext(null);
        }
        count -= countU;
    }

    public E get(int index) {
        if (index > -1 && index < count) {
            Node current = header;
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
            return (E)current.getElement();
        } else {
            return null;
        }
    }

    public void clear() {
        header = null;
    }
}
