package Lesson_4;

public class LinkQ {


    public String name;
    public int age;

    public LinkQ next;

    public LinkQ(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + this.name + ", age: " + this.age);
    }
}

class LinkQedList {
    public LinkQ first;
    public LinkQ last;

    public LinkQedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insert(String name, int age) {
        LinkQ newLinkQ = new LinkQ(name, age);
        if (this.isEmpty())
            first = newLinkQ;
        else
            last.next = newLinkQ;
        last = newLinkQ;
    }

    public String delete() {
        LinkQ temp = first;
        if (first.next == null)
            last = null;
        first = first.next;
        return temp.name;

    }

    public void display() {
        LinkQ current = first;
        while (current != null) {
            current.display();
            current = current.next;
        }
    }
}

class Queue {
    private LinkQedList queue;

    public Queue() {
        queue = new LinkQedList();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void insert(String name, int age) {
        queue.insert(name, age);
    }

    public String delete() {
        return queue.delete();
    }

    public void display() {
        queue.display();
    }

}


