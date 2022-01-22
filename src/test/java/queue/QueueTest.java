package queue;

import java.util.LinkedList;
import java.util.Queue;
import org.junit.jupiter.api.Test;

public class QueueTest {

  @Test
  void enqueueAndDequeue() {
    Queue<Integer> integers = new LinkedList<>();

    // Enqueue
    // 큐에 데이터 추가는 add 또는 offer 를 사용
    integers.add(1);
    integers.offer(2);
    System.out.println("integers.size() = " + integers.size());

    // Dequeue
    // poll() 큐의 첫 번째 값 반환하고 큐에서 삭제
    System.out.println("integers = " + integers.poll());
    System.out.println("integers.size() = " + integers.size());
  }
}
