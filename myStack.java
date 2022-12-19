package com.company.Exe.DataStructure.myStack;

public class myStack<E> {
    private class Node<E> {
        private E element;
        private Node prev;

        public Node(E element, Node prev) {
            this.element = element;
            this.prev = prev;
        }
    }

    private Node<E> top;
    private int size;

    public void push(E element){
        Node newNode = new Node(element, top);
        top = newNode;
        size++;
        }

    public E pop(){
        E element = null;
    try {
       element = top.element;
        top = top.prev;
        size--;
    }
    catch (NullPointerException empty){
        System.out.println(empty);
    }
    return element;
    }

    public E peek(){
        E element = null;
        try {
            element = top.element;
            System.out.print(element);
        }
        catch (NullPointerException nullPointerException){
            System.out.print(nullPointerException);
        }
        return element;
    }

    public Integer size(){
    return size;
    }

    public boolean empty(){
        if (size == 0){
            return true;
        }
        return false;
    }

    public void print(myStack<E> myStack){
        myStack<E> temp = myStack;
        while (temp.size != 0){
            System.out.print(temp.pop() + ", ");
        }
    }
    }

