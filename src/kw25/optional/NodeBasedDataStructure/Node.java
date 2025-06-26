package kw25.optional.NodeBasedDataStructure;
    
/**
 * @author Maksym Zadoya
 * @version 2025/06/23 #1
 * 
 */
public class Node {
    
    public static void main(String[] args) {
        
        Node node1 = new Node(1, null);  // node1 mit null zuerst, da zu dem Zeitpunkt node2 nicht exestiert 
        Node node2 = new Node(2, node1);
        System.out.println(node1.getData());
        System.out.println(node2.getNext().getData()); //so wird Data aus dem nächsten Node ausgegeben
          
    } 
    
    private int data;
    private Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    /**
     * 
     * @return next Node 
     */
    public Node getNext() { 
        return next;
    }

    public void setData(int data) {
        this.data = data;
    }

    /**Set next Node 
     * 
     * 
     */
    public void setNext(Node next) {
        this.next = next;
    }
    
    //noch Beispiele 

}
 