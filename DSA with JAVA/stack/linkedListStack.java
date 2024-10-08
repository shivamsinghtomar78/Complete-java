package stack;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}

class Node {
    ListNode head;
    ListNode tail;
    int size;
    public Node() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void push(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        int val = head.val;
        head = head.next;
        size--;
        if (size == 1) {
            tail = head;  // Update tail when there's only one element left
        } else if (isEmpty()) {
            tail = null;  // Set tail to null when the stack becomes empty
        }
        return val;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return head.val;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}

public class linkedListStack {
    public static void main(String[] args) {
        Node stack=new Node();
        stack.push(5);
        System.out.println(stack.pop());

    }
}
