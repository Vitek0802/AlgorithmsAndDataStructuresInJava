package Lesson_4;

public class Link1 {

    public String name;
    public int age;

    public Link1 next;

    public Link1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + this.name + ", age: " + this.age);
    }
}

class Link1edList {
    private Link1 first;


    public Link1edList() {
        first = null;

    }

    public Link1 getFirst() {
        return first;
    }

    public void setFirst(Link1 first) {
        this.first = first;
    }

    public Link1Interator getIterator() {
        return new Link1Interator(this);
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void display() {
        Link1 current = first;
        while (current != null) {
            current.display();
            current = current.next;
        }
    }
}

class Link1Interator {
    private Link1 current;
    private Link1 previous;
    private Link1edList list;

    public Link1Interator(Link1edList list) {
        this.list = list;
        this.reset();
    }

    public void reset() {
        current = list.getFirst();
        previous = null;
    }

    public boolean atEnd() {
        return (current.next == null);
    }

    public void nextLink1() {
        previous = current;
        current = current.next;
    }

    public Link1 getCurrent() {
        return current;
    }

    public void insertAfter(String name, int age) {
        Link1 newLink1 = new Link1(name, age);
        if (list.isEmpty()) {
            list.setFirst(newLink1);
            current = newLink1;
        } else {
            newLink1.next = current.next;
            current.next = newLink1;
            nextLink1();
        }
    }

    public void insertBefore(String name, int age) {
        Link1 newLink1 = new Link1(name, age);
        if (previous == null) {
            newLink1.next = list.getFirst();
            list.setFirst(newLink1);
            reset();
        } else {
            newLink1.next = previous.next;
            previous.next = newLink1;
            current = newLink1;
        }
    }

    public String deleteCurrent() {
        String name = current.name;
        if (previous == null) {
            list.setFirst(current.next);
            reset();
        } else {
            previous.next = current.next;
            if (atEnd()) {
                reset();
            } else {
                current = current.next;
            }
        }

        return name;
    }

}
