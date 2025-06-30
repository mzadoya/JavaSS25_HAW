package kw26.required.a6x3.multiPurposeList;

import kw26.required.a6x3.multiPurposeList.MultiPurposeList_I;

public class MultiPurposeList<T> implements MultiPurposeList_I<T> {

    private Node<T> head;
    private Node<T> tail;

    @Override
    public T getNo(int number) {
        return iGetNodeNo(number).getData();
    }

    @Override
    public T extractNo(int number) {
        Node<T> nodeToExtract = iGetNodeNo(number);
        iRemoveNode(nodeToExtract);
        return nodeToExtract.getData();
    }
    //TODO putNo komplett Fix
    @Override
    public void putNo(int number, T data) {
      
        
        Node<T> nextData = iGetNodeNo(number);
            Node<T> newNode = new Node<T>(data);
            if (isEmpty()) {
                head = newNode;
                tail = newNode;
            }
           
            else if(nextData.getPrevNode() == null && nextData.getNextNode() != null) {
                head = newNode;
                head.setPrevNode(null);
                head.setNextNode(nextData);
                nextData.setPrevNode(newNode);
            }
            
            else if(nextData.getPrevNode() != null && nextData.getNextNode() == null) {
                tail = newNode;ф
                tail.setNextNode(null);
                tail.setPrevNode(newNode);
                nextData.setNextNode(newNode);
            }
            
            else {
                nextData.getPrevNode().setNextNode(newNode);
                nextData.setPrevNode(newNode);;
                newNode.setNextNode(nextData);
                newNode.setPrevNode(nextData.getPrevNode());
            }
    }

    @Override
    public T setNo(int number, T data) {
        T toReturn = iGetNodeNo(number).getData();
        iGetNodeNo(number).setData(data);
        return toReturn;
    }

    @Override
    public void removeNo(int number) {
        iRemoveNode(iGetNodeNo(number));
    }

    @Override
    public boolean remove(T data) {
        return (iRemoveNode(iSearchNode(data)));
    }

    @Override
    public void clear() {
        int listSize = getSize();
        int position = 0;
        if (!isEmpty()) {
            while (listSize != position) {
                iRemoveNode(iGetNodeNo(position));
                position++;
            }
        }
    }

    @Override
    public boolean isEmpty() {
        return (head != null || tail != null) ? false : true;
    }

    @Override
    public int getSize() {
        int sizeCounter = 0;
        Node<T> checkNode = head;
        while (checkNode != null) {
            sizeCounter++;
            checkNode = checkNode.getNextNode();
        }
        return sizeCounter;
    }

    @Override
    public boolean contains(T data) {
        return (iSearchNode(data) == null) ? false : true;
    }

    private Node<T> iSearchNode(T data) {
        assert head != null : "Liste hat keinen Parameter!";
        Node<T> nodeToReturn = head;
        while (nodeToReturn.getData().equals(data) || nodeToReturn != null) { //TODO equals pruefen
            nodeToReturn = nodeToReturn.getNextNode();
        }
        return nodeToReturn;
    }

    private Node<T> iGetNodeNo(int number) {
        int positionInListeCounter = 0;
        assert head != null : "Liste hat keinen Parameter!";
        Node<T> nodeToReturn = head;
        while (positionInListeCounter != number) {
            nodeToReturn = nodeToReturn.getNextNode();
            assert nodeToReturn != null : "Gegebener Parameter ist out of Bounds";
            positionInListeCounter++;
        }
        return nodeToReturn;
    }

    //TODO vllt Struktur verbessern 
    private boolean iRemoveNode(Node<T> node) {

        if (isEmpty()) {
            return false;
        }
        
        if (getSize() == 1) {
            tail = null;
            head = null;
            return true;
        }
        
        if (node.getNextNode() == null && node.getPrevNode() != null) {
            tail = node.getPrevNode();
            tail.setNextNode(null);

        } else if (node.getNextNode() != null && node.getPrevNode() == null) {
            head = node.getNextNode();
            head.setPrevNode(null);

        } else {
            node.getPrevNode().setNextNode(node.getNextNode());
            node.getNextNode().setPrevNode(node.getPrevNode());

        }

        return true;
    }

}
