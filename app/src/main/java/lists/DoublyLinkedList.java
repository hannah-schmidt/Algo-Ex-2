package lists;

import com.sun.security.auth.UnixNumericGroupPrincipal;
import data.Student;

import static data.Student.Course.AI;

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
            node.next=null;
            node.prev=null;
            count++;
            return;
        }else {
            Node temp = head;
            while (temp.next!= null) {
                temp = temp.next;
            }
            temp.next = node;
            node.prev=temp;
            tail=node;
            count++;
        }
    }

    @Override
    public void addFirst(Object data) {
        Node node=new Node();
        node.data = (T) data;
        if(head==null){
            head=node;
            count++;
            return;
        }else {
            node.next=head;
            head.prev=node;
            head=node;
            node.next.prev = node;
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
            node.prev=temp;
            tail=node;
        }
        count++;
    }

    @Override
    public void insert(int index, Object data) {
        Node node=new Node();
        node.data= (T) data;
        Node temp=head;
        if(head==null || temp==null){
            return;
        }
        if (index==0){
            head=node;
            node.next=temp;
            node.next.prev=node;
        }else {
            try {
                for (int i = 0; i < index - 1; i++) {
                    temp = temp.next;
                }
            } catch (Exception e) {
                System.out.println("Objekt an der Stelle " + index + " existiert nicht.");
                e.printStackTrace();
            }
            node.next = temp.next;
            node.prev = temp;
            temp.next = node;
            //node.next.prev=node;
        }
    }

    @Override
    public void remove(int index) {
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }
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
            temp.prev=null;
            return;
        }
        if(temp.next==null){ //tbc, what else?
            tail=temp.prev;
            temp.prev.next=null;
            return;
        }
        if(temp.next!=null){
            temp.next.prev=temp.prev;
            if(temp.prev!=null){
                temp.prev.next=temp.next;
            }
        }
        count--;
    }

    @Override
    public void clear() {
        head=null;
        tail=null;
        count=0;
    }

    @Override
    public T get(int index) {
        if((head==null)||(index<0)||(index>count)){
            return (T) "List is empty.";
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
        int count=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }


    @Override
    public boolean isEmpty() {
        return head==null;
    }

    @Override
    public void set(int index, Object data) {
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        temp.data= (T) data;
    }

    @Override
    public void printAll() {
            if(isEmpty()){
                System.out.println("List is empty");
                return;
            }
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    @Override
    public void switchnodes(int index) {
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }
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
