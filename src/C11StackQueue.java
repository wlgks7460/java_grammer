import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class C11StackQueue {
    public static void main(String[] args) {
//        Stack<Integer> mySt = new Stack<>();
//        mySt.push(10);
//        mySt.push(20);
//        mySt.push(30);
////        pop : 스택에서 요소를 제거 후 해당 요소 반환
//        System.out.println(mySt.pop()); //30
////        peek : 스택에서 마지막 요소 반환, 제거 x
//        System.out.println(mySt.peek()); //20
//        System.out.println(mySt); // 10, 20
//
////        String타입 5개 정도 추가후 while문을 통해 모두 출력
//        Stack<String> mySt2 = new Stack<>();
//        mySt2.push("hi1");
//        mySt2.push("hi2");
//        mySt2.push("hi3");
//        mySt2.push("hi4");
//        mySt2.push("hi5");
//
//        while(!mySt2.isEmpty()){
//            System.out.println(mySt2.pop());
//        }

//
////        웹페이지 방문 뒤로가기 기능 구현
////        웹페이지 방문
////        방문한 사이트 출력 + 뒤로가기 기능 구현
////        스캐너로 신규사이트 방문 or 뒤로가기
////        신규사이트 방문일 경우, 해당 주소 push
////        뒤로 가기일 경우 해당 주소 pop
//        Stack<String> backwards = new Stack<>();
//        Stack<String> forkwards = new Stack<>();
//        while(true){
//            System.out.println("신규사이트 방문시 1번, 앞으로가기 2번, 뒤로가기 3번");
//            Scanner sc = new Scanner(System.in);
//            String input = sc.nextLine();
//            if(input.equals("1")){
//                System.out.println("방문하신 사이트를 입력해주세요");
//                Scanner sc2 = new Scanner(System.in);
//                String input2 = sc2.nextLine();
//                System.out.println("방문하신 사이트는 " + input2 + " 입니다.");
//                backwards.push(input2);
//            }else if(input.equals("2")){
//                String temp = forkwards.pop();
//                System.out.println("앞으로 가기를 통해 방문한 곳은 " + temp + " 입니다.");
//
//            }else{
//                String temp = backwards.pop();
//                forkwards.push(temp);
//                System.out.println("뒤로가기 사이트는 " + backwards.peek() + " 입니다.");
//
//            }
//        }
//

//        큐 선언
////        선입선출
//        Queue<Integer> myQue = new LinkedList<>();
//        myQue.add(10);
//        myQue.add(20);
//        myQue.add(30);
//        System.out.println(myQue.poll()); //10
//        System.out.println(myQue); // 20, 30

//        프린터 대기열 예제
//        문서1추가, 문서2 추가, 문서3 출력
//        while문을 통해 "현재 인쇄중인 문서 : 문서1"

//        Queue<String> printerQue = new LinkedList<>();
//        printerQue.add("문서1");
//        printerQue.add("문서2");
//        printerQue.add("문서3");
//        while(!printerQue.isEmpty()){
//            System.out.println("현재 인쇄중인 문서 : " +printerQue.poll());
//        }

//        길이에 제한이 있는 큐 : ArrayBlockingQueue
        Queue<String> myQue = new ArrayBlockingQueue<>(3);
//        add와 offer의 차이 : add는 길이가 다 찼을 때 에러를 발생, offer공간이 충불할때만 add
        myQue.offer("hello1");
        myQue.offer("hello2");
        myQue.offer("hello3");
        myQue.offer("hello4");
        System.out.println(myQue);

////        우선순위 큐 : 프로그래머스 더 맵게
//
//        Queue<Integer> pq = new PriorityQueue<>();
//        pq.add(30);
//        pq.add(20);
//        pq.add(10);
//        pq.add(40);
//        pq.add(50);
//        System.out.println(pq);
//
//        while(!pq.isEmpty()){
//            System.out.println(pq.poll());
//        }


    }
}
