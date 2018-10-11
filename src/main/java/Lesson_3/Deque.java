package Lesson_3;

public class Deque {
    private int maxSize;
    private int[] queue;
    private int front;
    private int rear;
    private int items;
    private int top;

    public Deque(int s) {
        maxSize = s;
        queue = new int[maxSize];
        front = 0;
        rear = -1;
        items = 0;
        this.top = -1;
    }

    public void insertLeft(int i) {
        if (rear == maxSize - 1)
            rear = -1;
        queue[++rear] = i;
        items++;
    }

    public void insertRight(int i){
        this.queue[++this.top] = i;
    }


    public int removeLeft() {
        int temp = queue[front++];
        if (front == maxSize)
            front = 0;
        items--;
        return temp;
    }

    public int removeRight(){
        return this.queue[this.top--];
    }


//    public int peek() {
//        return queue[front];
//    }

    public boolean isEmpty() {
        return (items == 0 & this.top == -1);
    }

    public boolean isFull() {
        return (items == maxSize & this.top == this.maxSize - 1);
    }

    public int size() {
        return items;
    }


}