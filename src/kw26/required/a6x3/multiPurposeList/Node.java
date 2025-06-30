package kw26.required.a6x3.multiPurposeList;

public class Node<T> {

    private Node<T> next;
    private Node<T> prev;
    private T data;

    public Node(Node<T> next, Node<T> prev, T data) {
        this.prev = prev;
        this.next = next;
        this.data = data;
    }

    public Node(T data) {
        this(null, null, data);
    }
    
    public T getData() {
        return data;
    }

    public Node<T> getNextNode() {
        return next;
    }
    
    public Node<T> getPrevNode() {
        return prev;
    }

    public void setData(T newData) {
        data = newData;
    }

    public void setNextNode(Node<T> newNextNode) {
        next = newNextNode;
    }
    
    public void setPrevNode(Node<T> newPrevNode) {
        prev = newPrevNode;
    }
    
    
}
