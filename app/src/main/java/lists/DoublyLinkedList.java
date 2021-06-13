package lists;

public class DoublyLinkedList<T> implements Listable<T>{

        private Node head = null;
        private Node tail = null;
        int count=0;

        private class Node {
            T data;
            Node next;
            Node prev;
        }

        @Override
    public void add(Object data) {
        Node node=new Node();
        node.data=(T) data;

        if(head==null){
            head=node;
            count++;
            return;
        }else {
            Node temp = head;
            while (temp.next!= null) {
                temp = temp.next;
            }
            temp.next = node;
            tail=node;
            count++;
        }
    }

    @Override
    public void addFirst(Object data) {
        Node node=new Node();
        node.data = (T) data;
        node.next=null;
        if(head==null){
            head=node;
            count++;
        }else {
            System.out.println("Fehler, ein erstes Element der Liste existiert bereits.");
            return;
        }
    }

    @Override
    public void addLast(Object data) {
        Node node=new Node();
        node.data = (T) data;
        node.next=null;
        if(head==null){
            head=node;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
            tail=node;
        }
        count++;
    }

    @Override
    public void insert(int index) { //wtf müsste nicht ein object T übergeben werden???
        Node temp=head;
        try {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        }catch (Exception e){
            System.out.println("Objekt an der Stelle "+index+" existiert nicht." );
            e.printStackTrace();
        }
        if(head==null || temp==null){
            return;
        }
        if(head==temp){
            head=temp.next;
        }

    }

    @Override
    public void remove(int index) {
        Node temp=head;
        try {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        }catch (Exception e){
           System.out.println("Objekt an der Stelle "+index+" existiert nicht." );
           e.printStackTrace();
        }
        if(head==null || temp==null){
            return;
        }
        if(head==temp){
            head=temp.next;
        }
        if(temp.next==null){ //tbc, what else?
            tail=temp.prev;
        }
        if(temp.next!=null){
            temp.next.prev=temp.prev;
        }
        if(temp.prev!=null){
            temp.prev.next=temp.next;
        }
        count--;
    }

    @Override
    public void clear() {
        head=null;
        count=0;
    }

    @Override
    public T get(int index) {
        if((head==null)||(index<0)||(index>count)){
            System.out.println("Fehler, index zu groß oder zu klein.");
            return null;
        }
        Node temp=head;
        for (int i = 0; i < index; i++) {
            if(temp.next!=null){
                temp = temp.next;
            }else{
                System.out.println("Object at index does not exist. Last object is printed below.");
                return null;
            }
        }
        return temp.data;
    }

    @Override
    public int size() {
        return count;
    }


    @Override
    public boolean isEmpty() {
        return head==null;
    }

    @Override
    public void set(int index, Object data) {
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        temp.data= (T) data;
    }

    @Override
    public void printAll() {
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    @Override
    public void switchnodes(int index) {
       Node temp=head;
        if(index==-1){
            Node three=temp.next.next;
            head=temp.next;
            head.next=temp;
            head.next.next=three;
            return;
        }
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        Node next=temp.next;
        Node four=temp.next.next.next;
        temp.next=temp.next.next;
        temp.next.next=next;
        temp.next.next.next=four;
    }
}
