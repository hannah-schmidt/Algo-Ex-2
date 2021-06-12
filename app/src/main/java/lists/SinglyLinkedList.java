package lists;

public class SinglyLinkedList<T> implements Listable {

    private class Node {
        T data;
        Node next;
    }
    Node head = null;
    int count=0;

    @Override
    public void add(Object data) {
        Node node=new Node();
        node.data=(T) data;

        if(head==null){
            head=node;
            count++;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        count++;
    }

    @Override
    public void addFirst(Object data) {
        Node node=new Node();
        node.data= (T) data;
        node.next=null;
        head=node;
        count++;
    }

    @Override
    public void addLast(Object data) {
        Node node=new Node();
        node.data=(T) data;
        node.next=null;
        if(head==null){
            head=node;
        }else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
        count++;
    }

    @Override
    public void insert(int index) {
        count++;
    }

    @Override
    public void remove(int index) {
        Node temp=head;
        try {
            for (int i = 0; i < index-1; i++) {
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
            temp.next=null;
        }else{
            temp.next=temp.next.next;
        }
        count=count-1;
    }

    @Override
    public void clear() {
        head=null;
        count=0;
    }

    @Override
    public Object get(int index) {
        Node temp=head;
        try {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        }catch (Exception e){
            System.out.println("Objekt an der Stelle "+index+" existiert nicht." );
            e.printStackTrace();
        }
        return temp;
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






}