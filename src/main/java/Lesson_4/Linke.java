package Lesson_4;

public class Linke {
    public String name;
    public int age;

    public Linke next;

    public Linke(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + this.name + ", age: " + this.age);
    }
}

class LinkeedList {
    public Linke first;

    public LinkeedList() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insert(String name, int age) {
        Linke newLinke = new Linke(name, age);
        newLinke.next = first;
        first = newLinke;
    }

    public Linke delete() {

        Linke temp = first;
        first = first.next;
        return temp;

    }

    public void display() {
        Linke current = first;
        while (current != null) {
            current.display();
            current = current.next;
        }
    }
}

class StackList {
    private LinkeedList list;

    public StackList() {
        list = new LinkeedList();
    }

    public void push(String name, int age) {
        list.insert(name, age);
    }

    public String pop() {
        return list.delete().name;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void display() {
        list.display();
    }
}
