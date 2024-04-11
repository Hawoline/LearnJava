package queue;

import java.util.LinkedList;
import java.util.Queue;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QueueTest {
  @Test 
  public void testOffer() {
    Queue<Integer> queue = new LinkedList<>();
    queue.offer(1);
    queue.offer(2);
    queue.offer(3);
    queue.offer(4);
    queue.offer(5);
    queue.offer(6);

    int i = 1;
    while (!queue.isEmpty()) {
      assertEquals(i++, queue.poll());
    }
  }
}
