package main.java.mysolution.habrtasks;

public class Node {
    private Integer value;
    private Node next = null;
    private Node prev = null;

    public Node(Integer value) {
        this.value = value;

    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                ", prev=" + prev +
                '}';
    }
}
