package Lesson_3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.*;


class Main {
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) throws IOException {

//        String input;
//        while (true) {
//            input = getString();
//            if (input.equals("")) break;
//
//            Bracket br = new Bracket(input);
//            br.check();
//        }

//    Turn t = new Turn(5);
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
//
//
//
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
//
//        mass();
//
//

//        Deque q = new Deque(5);
//        q.insertLeft(10);
//        q.insertLeft(20);
////        q.removeLeft();
////        q.removeLeft();
//
//        q.insertRight(50);
//        q.insertRight(80);
//        while( !q.isEmpty() ){
//            int n = q.removeLeft();
//            System.out.println(n);
//
//        }

    }



    public static void mass() {
        String str = "Здесь должна быть фраза";
        String revers = new StringBuilder(str).reverse().toString();
        System.out.print("Было: " + str);
        System.out.println();
        System.out.print("Стало: " + revers);
    }
    public static String getString() throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        return br.readLine();
    }
}