package lists;

import data.Student;

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
        node.next=head;
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
    public void insert(int index, Object data ) {
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
            return;
        }
        if(temp==head) {
            head = temp.next;
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
    public T get(int index) {
        Node temp=head;
        try {
            for (int i = 0; i < index; i++) {
                if(temp.next!=null){
                    temp = temp.next;
                }else{
                    System.out.println(" ");
                    System.out.println("End of list, object at index does not exist. Last object is printed below.");
                    break;
                }
            }
            return temp.data;
        }catch (NullPointerException e){
            System.out.println("Objekt an der Stelle "+index+" existiert nicht." );
            e.printStackTrace();
            while(temp!=null) {
                temp = temp.next;
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
        while(temp.next!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println(temp.data);
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