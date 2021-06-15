package DataStructure;

import java.util.*;

public class QueueTest {

    public static void main(String[] args) {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        Deque<Integer> qu = new LinkedList<>();

        while (true) {
            String cmd = sc.next();
            switch(cmd) {
                case "push":
                    qu.add(sc.nextInt());
                    break;

                case "pop":
                    result = qu.poll();
                    break;

                case "peek":
                    result = qu.peek();

                case "size":
                    result = qu.size();
                    break;

                case "contains":
                    int a = sc.nextInt();
                    boolean flag = qu.contains(a);
                    System.out.println(a+ " 포함여부 = " + flag);
                    break;

                case "empty":
                    if(qu.isEmpty()) {result = 1;}
                    else {result = 0;}
                    break;

                case "front":
                    result = qu.element();
                    break;

                case "back":
                    result = qu.peekLast();
                    break;

                case "exit":
                    System.out.println("프로그램을 종료합니다...");
                    return;
            }

            System.out.println(result);
        }
    }
}
