package a;

public class Stack<T> {

    private StackEntry head;
    int size = 0;

    public int size() {
//        int result = 0;
//        StackEntry h = head;
//        while (h != null) {
//            result++;
//            h = h.next;
//        }
//
//        return result;
        return size;
    }

    public T peek() {
        return head != null ? head.value : null;
    }

    private class StackEntry {
        T value;
        StackEntry next;

        public StackEntry(T value) {
            this.value = value;
        }
    }

    public Stack() {
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void push(T value) {
        StackEntry entry = new StackEntry(value);
        if (head == null) {
            head = entry;
        } else {
            entry.next = head;
            head = entry;
        }

        size++;
    }

    public T pop() {
        if (head == null) {
            return null;
        } else {
            StackEntry e = head;
            head = e.next;
            size--;
            return e.value;
        }
    }
}
