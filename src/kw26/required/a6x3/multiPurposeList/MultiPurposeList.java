package kw26.required.a6x3.multiPurposeList;

/**
 * Multi-Purpose-List aka final Boss-Aufgabe HAW SS25 S1 PT 😃
 * 
 * Dies ist die Aubschlussaufgabe des ersten Semester im Fach Programmiertechnik 1
 * an der HAW Hamburg. Die Klasse implementiert eine doppelt verkettete
 * generische Liste, die grundlegende Operationen wie Einfügen, Entfernen,
 * Suchen und Setzen von Knoten unterstützt.
 * 
 * @author Maksym Zadoya
 * @version 2025/07/01 #1
 * @param <T> der Typ des in der Liste gespeicherten Informations-Objekts
 */
public class MultiPurposeList<T> implements MultiPurposeList_I<T> {

    private Node<T> head;
    private Node<T> tail;

    /**
     * Liefert das Informations-Objekt eines Knotens an der uebergebenen Position in
     * der Liste
     * 
     * @param number Position des gesuchten Informations-Objekts in der Liste
     * @return Informations-Objekt an der als Parameter uebergebenen Position
     *         {@code number}
     */
    @Override
    public T getNo(int number) {
        return iGetNodeNo(number).getData();
    }

    /**
     * Liefert das Informations-Objekt an der uebergebenen Position in der Liste,
     * dabei wird die Referenz auf den Knoten, der dieses Objekt enthaelt, entfernt.
     * 
     * @param number Position des gesuchten Informations-Objekts in der Liste, die
     *               entfernt werden muss
     * @return Informations-Objekt an der als Parameter uebergebenen Position
     *         {@code number}
     */
    @Override
    public T extractNo(int number) {
        Node<T> nodeToExtract = iGetNodeNo(number);
        iRemoveNode(nodeToExtract);
        return nodeToExtract.getData();
    }

    /**
     * Fuegt das Informations-Objekt {@code data} an der Position {@code number},
     * dabei bleiben andere Knoten in der Liste vorhanden, werden aber verschoben.
     *
     * @param number Positionsangabe, an die einen neuen Knoten hinzugefuegt werden
     *               muss
     * @param data   Informations-Objekt des Knotens, die in der Liste eingefuegt
     *               werden muss
     * @version 2025/07/01 #2
     */
    @Override
    public void putNo(int number, T data) {

        assert number >= 0 && number <= getSize() : "Ausserhalb des gueltigen Bereichs";
        Node<T> newNode = new Node<T>(data);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            return;

        } else {

            if (number == 0) { //Wird am Anfang eingefuegt 
                head.setPrevNode(newNode); 
                newNode.setNextNode(head);
                head = newNode;
            }

            else if (number == getSize()) { //wird am Ende eingefuegt
                tail.setNextNode(newNode);
                newNode.setPrevNode(tail);
                tail = newNode;
            }

            else { //wird irgendwo in der Mitte bzw. zwischen zwei Knoten eingefuegt 
                Node<T> nextData = iGetNodeNo(number);  //erhalten die Knote in der Liste, die verschoben werden muss
                Node<T> testData = nextData.getPrevNode(); //der vorherige Knoten speichern -> sonst wird nextData da stehen 
                nextData.getPrevNode().setNextNode(newNode);
                newNode.setNextNode(nextData);
                nextData.setPrevNode(newNode);

                newNode.setPrevNode(testData);

            }

        }
    }

    /**
     * Es wird der Knoten, der an der als {@code number} uebergebene Position steht,
     * mit dem neuen Knoten ersetzt und alte, also die dort stand, abliefert.
     * 
     * @param number Position des Knotens in der Liste, die mit einem neuen Knoten zu
     *               ersetzen ist
     * @param data   Informations-Objekt des neuen Knotens, mit dem alten Knoten ersetzt
     *               werden muss
     * @return alte zuvor stehende Knoten, die ersetzt wurde
     */
    @Override
    public T setNo(int number, T data) {
        T toReturn = iGetNodeNo(number).getData(); //speichern das Informations-Objekt, das mit dem neuen ersetzt wird
        iGetNodeNo(number).setData(data); //ersetzen das alte Inf.-Obj. mit dem neuen
        return toReturn; //geben das alte zurueck 
    }

    /**
     * Nimmt die Position des Knotens in der Liste und ruft die Methode (Funktion)
     * {@code iRemoveNode}, um Referenz auf diesen Knoten aus der Liste zu enrfernen
     * 
     * @param number index-Position des Knotens, Referenz dessen aus der Liste geloscht
     *               werden muss
     */
    @Override
    public void removeNo(int number) {
        iRemoveNode(iGetNodeNo(number));
    }

    /**
     * Loescht die Referenz auf den Knoten in der Liste, die das als Parameter
     * uebergebene Informations-Objekt entaelt
     * 
     * @param data Informations-Objekt eines Knotens in der Liste
     * @return gibt zurueck, ob der Vorgang erfolgreich war ({@code true} -> ist entfernt, {@code false}
     *         -> ist nicht entfernt)
     */
    @Override
    public boolean remove(T data) {
        return (iRemoveNode(iSearchNode(data)));
    }

    /**
     * Alle Referenzen in der Liste werden geloescht.
     */
    @Override
    public void clear() {
        while (!isEmpty()) {
            iRemoveNode(iGetNodeNo(0)); // entfernen Knoten an der Position 0 (quasi head) solange bis die Liste keine
                                        // Referenzen hat
        }
    }

    /**
     * Prueft ob head und tail nicht auf null zeigen -> mindestens ein Knoten
     * exestiert
     * 
     * @return gibt zurueck, ob die Liste leer ist, {@code true} -> die Liste ist leer, {@code false} ->
     *         die Liste ist nicht leer
     */
    @Override
    public boolean isEmpty() {
        return (head != null && tail != null) ? false : true;
    }

    /**
     * Zaelt die Referenzen in der Liste und liefert sie ab.
     * 
     * @return Grosse der Liste bzw. Anzahl der Referenzen
     * @version 2025/06/30 #2
     */
    @Override
    public int getSize() {
        int sizeCounter = 0;
        Node<T> checkNode = head; //starten beim Head (beim ersten Element)
        while (checkNode != null) { //zaele Schritte solange wir vom Head bis zum Tail gehen
            sizeCounter++;
            checkNode = checkNode.getNextNode();
        }
        return sizeCounter;
    }

    @Override
    public boolean contains(T data) {
        return (iSearchNode(data) == null) ? false : true;
    }

    /**
     * Sucht nach dem Knoten in der Liste, der dieses Informations-Objekt enthaelt
     * und liefert ihn ab.
     * 
     * @param data Informations-Objekt eines Knotens, das gesucht wird
     * @return Knoten, der dieses Informations-Objekt entaelt
     * @version 2025/07/01 #1
     */
    private Node<T> iSearchNode(T data) {
        assert data != null : "Uebergebener Knoten ist null";
        Node<T> nodeToReturn = head; //starten beim Head (beim ersten Element)
        while (nodeToReturn != null && !nodeToReturn.getData().equals(data)) { // TODO equals pruefen
            nodeToReturn = nodeToReturn.getNextNode();
        }
        return nodeToReturn;
    }

    /**
     * Nimmt Position des gesuchten Knotens in der Liste und liefert den Knoten an
     * dieser Position ab.
     *
     * @param number position des gesuchten Knotens in der Liste
     * @return Knoten an dieser Position
     * @version 2025/07/01 #1
     */
    private Node<T> iGetNodeNo(int number) {
        int positionInListeCounter = 0; 
        assert head != null : "Liste hat keinen Parameter!";
        assert number >= 0 && number < getSize() : "Index ist ausserhalb des gueltigen Bereich"; // TODO Test schreiben
        Node<T> nodeToReturn = head; //starten beim Head (beim ersten Element)
        while (positionInListeCounter != number) { //laufen solange bis wir number finden (index stimmt)
            nodeToReturn = nodeToReturn.getNextNode();
            positionInListeCounter++;
        }
        return nodeToReturn;
    }

    /**
     * Entfernt ein Knoten aus der Liste bzw. entfernt die Referenz auf diesen Knoten
     * und passt die Refenzen der nebenstehenden Knoten an
     * 
     * @param node der Knoten der aus der Liste entfernt werden muss
     * @return gibt zurueck, ob der Vorgang erfolgreich war ({@code true} -> ist entfernt, {@code false}
     *         -> ist nicht entfernt)
     * @version 2025/06/30 #2
     */
    private boolean iRemoveNode(Node<T> node) {

        if (node == null || isEmpty()) { 
            return false;
        }

        if (getSize() == 1) { //Liste hat nur einen Knoten -> beim loeschen wird keine mehr geben
            tail = null;
            head = null;
            return true;
        }

        if (node.getNextNode() == null /* && node.getPrevNode() != null */) { //ist tail, also es gibt keine Referenz auf den naechsten Knoten
            tail = node.getPrevNode();
            tail.setNextNode(null);

        } else if (node.getPrevNode() == null /* && node.getNextNode() != null */ ) { //ist head, also ist der erste Knote in der Liste 
            head = node.getNextNode();
            head.setPrevNode(null);

        } else { //der Knoten ist irgendwo zwischen zwei Knoten
            node.getPrevNode().setNextNode(node.getNextNode());
            node.getNextNode().setPrevNode(node.getPrevNode());

        }

        return true;
    }

    
    //########## Nuetzliche Hilfsmethoden zum Testen ########## 
    
    /**
     * Gibt die in der Liste enthaltenen Informations-Objekte der Reihe nach, also
     * vom ersten (head) zum letzten (tail) an.
     */
    public void printElemFirstToLast() {
        Node<T> testNodeFirstLast = head;
        while (testNodeFirstLast != null) {
            System.out.println(testNodeFirstLast.getData());
            testNodeFirstLast = testNodeFirstLast.getNextNode();
        }
    }
    
    /**
     * Gibt die in der Liste enthaltenen Informations-Objekte der Reihe nach, also
     * vom letzten (tail) zum ersten (head) an.
     */
    public void printElemLastToFirst() {
        Node<T> testNodeLastFirst = tail;
        while (testNodeLastFirst != null) {
            System.out.println(testNodeLastFirst.getData());
            testNodeLastFirst = testNodeLastFirst.getPrevNode();
        }
    }
    
    /**
     * Nur intern vewendbar!
     * Gibt alle Knoten mit Referenzen vom ersten bis zum letzten an.
     */
    private void printNodeFirstToLast() {
        Node<T> testNodeFirstLast = head;
        while (testNodeFirstLast != null) {
            System.out.println(testNodeFirstLast);
            testNodeFirstLast = testNodeFirstLast.getNextNode();
        }
    }
    
    /**
     * Nur intern vewendbar!
     * Gibt alle Knoten mit Referenzen vom letzten bis zum ersten an.
     */
    private void printNodeLastToFirst() {
        Node<T> testNodeLastFirst = tail;
        while (testNodeLastFirst != null) {
            System.out.println(testNodeLastFirst);
            testNodeLastFirst = testNodeLastFirst.getPrevNode();
        }
    }
    
    @Override
    public String toString() {
        return this.getClass() + "[head=" + head + ", tail=" + tail + "]";
    }
    

}
