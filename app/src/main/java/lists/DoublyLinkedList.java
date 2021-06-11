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
        count++;
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
        if((head==null)||(index<0)||(index<=size())){
            return null;
        }
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp.data;
    }

    @Override
    public int size() {     //geht effizienter
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
}
