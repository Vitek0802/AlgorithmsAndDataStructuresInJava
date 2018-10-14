package Lesson_4;

public class DuLink {

        public String name;
        public int age;

        public DuLink next;

        public DuLink(String name, int age){
            this.name = name;
            this.age = age;
        }

        public void display(){
            System.out.println("Name: "+this.name+", age: "+this.age);
        }
    }
    class DuLinkedList{
        public DuLink first;
        public DuLink last;

        public DuLinkedList(){
            first = null;
            last = null;
        }

        public boolean isEmpty(){
            return (first == null);
        }

        public void insert(String name, int age){
            DuLink newLink = new DuLink(name, age);
            if (this.isEmpty())
                last = newLink;
            newLink.next = first;
            first = newLink;
        }

        public void insertLast(String name, int age){
            DuLink newLink = new DuLink(name, age);
            if (this.isEmpty()){
                first = newLink;
            } else {
                last.next = newLink;
            }
            last = newLink;
        }
        public DuLink delete(){

            DuLink temp = first;
            if (first.next == null)
                last = null;
            first = first.next;
            return temp;

        }

        public void display(){
            DuLink current = first;
            while(current != null){
                current.display();
                current = current.next;
            }
        }
        public DuLink find(String name){
            DuLink current = first;
            while(current.name != name){
                if(current.next == null)
                    return null;
                else
                    current = current.next;
            }
            return current;
        }

        public DuLink delete(String name){
            DuLink current = first;
            DuLink previous = first;
            while(current.name != name){
                if(current.next == null)
                    return null;
                else{
                    previous = current;
                    current = current.next;
                }
            }
            if(current == first)
                first = first.next;
            else
                previous.next = current.next;
            return current;
        }
}
