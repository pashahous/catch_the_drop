package main.java.mysolution.habrtasks;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size = 0;


    public int getSize() {
        return size;
    }

    public LinkedList(){
        this.head = null;
        this.tail = null;
    }


    public void add(Node node){
        if (this.head != null){
            node.setPrev(this.tail);//устанвливаем указатель нового узла на предыдущий узел
            this.tail.setNext(node);
            this.tail = node;
            this.size +=1;

        } else {
            this.size+=1;
            this.head = node;
            this.tail = node;
        }
    }

    public Integer findIndexOfValue(Integer value){
        Node nd = this.head;
        int index = 0;
        while (nd!= null){
            if ( value == nd.getValue()){
                return index;
            }
            index+=1;
            nd = nd.getNext();
        }
        return -1;
    }
    public List<Integer> findIndexOfValue(Integer value, Integer count){
        //находит count количество индексы вхождения значения в связном списке,
        List<Integer> outArr = new ArrayList<>();
        Node nd = this.head;
        int n = 0;
        int index = 0;
        while (nd!= null && n < count){
            if ( value == nd.getValue()){
                outArr.add(index);
                n++;
            }
            index++;
            nd = nd.getNext();
        }
        return outArr;
    }
    public void printAllNodes(){
        Node nd = this.head;
        while (nd!= null){
            System.out.println(nd.getValue());
            nd = nd.getNext();
        }
    }
}
