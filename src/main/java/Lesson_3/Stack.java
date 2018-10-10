package Lesson_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.*;


class Stack {

    private int maxSize;
    private char[] stack;
    private int top;

    public Stack(int size) {
        this.maxSize = size;
        this.stack = new char[this.maxSize];
        this.top = -1;
    }

    public void push(char i) {
        this.stack[++this.top] = i;
    }

    public boolean isFull() {
        return (this.top == this.maxSize - 1);
    }

    public char pop() {
        return this.stack[this.top--];
    }

    public boolean isEmpty() {
        return (this.top == -1);
    }
}

class Bracket {
    private String input;

    public Bracket(String in) {
        input = in;
    }

    public void check() {
        int size = input.length();
        Stack st = new Stack(size);

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            switch (ch) {
                case '[':
                case '{':
                case '(':
                    st.push(ch);
                    break;
                case ']':
                case '}':
                case ')':
                    if (!st.isEmpty()) {
                        char chr = st.pop();
                        if ((ch == '}' && chr != '{' || (ch == ']' && chr != '[') || (ch == ')' && chr != '('))) {
                            System.out.println(("Error: " + ch + " at " + i));
                        }
                    } else {
                        System.out.println("Error: " + ch + " at " + i);
                    }
                    break;
                default:
                    break;
            }
        }
        if (!st.isEmpty()) {
            System.out.println("Отдай мне закрывающую скобку.");
        }
    }
}

class Turn {

    private int maxSize;
    private int[] queue;
    private int front;
    private int rear;
    private int items;

    public Turn(int s) {
        maxSize = s;
        queue = new int[maxSize];
        front = 0;
        rear = -1;
        items = 0;
    }

    public void insert(int i) {
        if (rear == maxSize - 1)
            rear = -1;
        queue[++rear] = i;
        items++;
    }

    public int remove() {
        int temp = queue[front++];
        if (front == maxSize)
            front = 0;
        items--;
        return temp;
    }

    public int peek() {
        return queue[front];
    }

    public boolean isEmpty() {
        return (items == 0);
    }

    public boolean isFull() {
        return (items == maxSize);
    }

    public int size() {
        return items;
    }
}

class PriorityQueue {
    private int maxSize;
    private int[] queueArray;
    private int items;

    public PriorityQueue(int i) {
        maxSize = i;
        queueArray = new int[maxSize];
        items = 0;
    }

    public void insert(int item) {
        int i;
        if (items == 0)
            queueArray[items++] = item;
        else {
            for (i = items - 1; i >= 0; i--) {
                if (item > queueArray[i])
                    queueArray[i + 1] = queueArray[i];
                else
                    break;
            }
            queueArray[i + 1] = item;
            items++;
        }
    }

    public int remove() {
        return queueArray[--items];
    }

    public long peek() {
        return queueArray[items - 1];
    }

    public boolean isEmpty() {
        return (items == 0);
    }

    public boolean isFull() {
        return (items == maxSize);
    }
}

class Deque {
    int size;
    int head;
    int tail;
    int[] data;

    Deque(int size) {
        data = new int[this.size = size];
    }

    void insertRight(int value) {
        if (++tail == size)
            tail = 0;
        data[tail] = value;
    }

    int removeRight() {
        int ret = data[tail];
        if (--tail < 0)
            tail = size - 1;
        return ret;
    }

    void insertLeft(int value) {
        data[head] = value;
        if (--head < 0)
            head = size - 1;
    }

    int removeLeft() {
        if (++head == size)
            head = 0;
        return data[head];
    }

    boolean isEmpty() {
        return head == tail;
    }
}

class Main {
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) throws IOException {
        /*
         * Такие коментарии не правильны с точки зрения конвеншена верно?
         * Но так для себя сейчас выделю блоки кода, потом уберу если не забуду.
         * 11111111111111111111111111111111111111111111111111111111111111111
         */
//        String input;
//        while (true) {
//            input = getString();
//            if (input.equals("")) break;
//
//            Bracket br = new Bracket(input);
//            br.check();
//        }
//    }
//
//    public static String getString() throws IOException {
//        InputStreamReader isr = new InputStreamReader(System.in);
//        BufferedReader br = new BufferedReader(isr);
//
//        return br.readLine();
        /*
         * 111111111111111111111111111111111111111111111111111111111111111111111
         */


        /*
        22222222222222222222222222222222222222222222222222222222222222222222222
         */

//        Turn t = new Turn(5);
//        t.insert(10);
//        t.insert(20);
//        t.insert(90);
//        t.insert(60);
//        t.insert(30);
//        t.remove();
//        t.remove();
//
//        t.insert(70);
//        t.insert(80);
//        t.insert(40);
//        while (!t.isEmpty()) {
//            int n = t.remove();
//            System.out.println(n);
//        }
//        //     Если я правильно понял, Очередь в данном случае циклично проходит весь массив,
//        //     а когда он заканчивается то все
//        //     начинается сначала массива но с теми значениями что остались впереди
        /*
        222222222222222222222222222222222222222222222222222222222222222
        */

        /*
        333333333333333333333333333333333333333333333333333333333333333
         */
//        PriorityQueue q = new PriorityQueue(5);
//        q.insert(530);
//        q.insert(50);
//        q.insert(0);
//        q.insert(490);
//        q.insert(2);
//        while (!q.isEmpty()) {
//            int item = q.remove();
//            System.out.print(item + " ");
//        }
        /*
        333333333333333333333333333333333333333333333333333333333333
         */
        /*
        44444444444444444444444444444444444444444444444444444444444
         */
//        mass();
        /*
        444444444444444444444444444444444444444444444444444444
         */

        /*
        555555555555555555555555555555555555555555555555555555
         */

//        Deque d = new Deque(5);
//
//        d.insertLeft(50);
//        d.insertLeft(60);
//        d.insertLeft(70);
//        d.insertRight(100);
//        d.insertLeft(4);
//        d.removeLeft();
//        d.insertRight(19);
    /*
    5555555555555555555555555555555555555555555555555555
     */
    }

    public static void mass() {
        String str = "Здесь должна быть фраза";
        String revers = new StringBuilder(str).reverse().toString();
        System.out.print("Было: " + str);
        System.out.println();
        System.out.print("Стало: " + revers);
    }
}
