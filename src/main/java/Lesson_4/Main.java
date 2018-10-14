package Lesson_4;

public class Main {
    public static void main(String[] args) {
//        LinkedList<String> list = new LinkedList<>();
//
//        list.insert("Виктор");
//        list.insert("Дмитрий");
////Ого если не совпадает с одним из верхих то пишет Null, клево
//        System.out.println(list.find("Дмитрий"));
//
//        LinkedList<People> peopleList = new LinkedList<>();
//        peopleList.insert(new People("Виктор", 24));
//        peopleList.insert(new People("Дмитрий", 22));
////И здесь примерно тоже самое происходит, магия
//        System.out.println(peopleList.find(new People("Виктор", 24)).toString());

////Здесь мне более понятно что происходит
//        DuLinkedList list = new DuLinkedList();
//        list.insert("Виктор", 24);
//        list.insert("Дмитрий", 22);
//        list.insert("Александра", 18);
//        list.insertLast("Андрей", 48);
//
//        list.display();
//        System.out.println("Удаление элементов списка");
//
//
//        list.delete("Виктор");
//        list.display();

//        StackList sl = new StackList();
//        sl.push("Виктор", 24);
//        sl.push("Дмитрий", 22);
//        sl.push("Александра", 18);
//        sl.display();
//        while (!sl.isEmpty()) {
//            System.out.println("Элемент "+ sl.pop()+" удален из стека");
//        }

//        Queue q = new Queue();
//        q.insert("Виктор", 24);
//        q.insert("Дмитрий", 22);
//        q.insert("Александра", 18);
//        q.display();
//        while (!q.isEmpty()) {
//            System.out.println("Элемент "+ q.delete()+" удален из стека");
//        }

        Link1edList list = new Link1edList();

        Link1Interator itr = new Link1Interator(list);

        itr.insertAfter("Виктор", 1);
        itr.reset();
        itr.insertBefore("Дмитрий", 2);
        itr.nextLink1();
        itr.insertBefore("Александра", 3);
        itr.getCurrent();
        itr.insertBefore("Андрей", 4);
        itr.atEnd();
        itr.insertBefore("Ольга", 5);
        itr.insertBefore("Анна", 6);
        itr.deleteCurrent();
        itr.insertBefore("Анна",7);
        itr.insertAfter("Эля",8);

        list.display();

    }
}
