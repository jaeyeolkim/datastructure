package queue;

import java.util.Stack;
import org.junit.jupiter.api.Test;

public class StackTest {

  @Test
  void pushAndPop() {
    Stack<Integer> stack = new Stack<>();
    stack.push(1);
    stack.push(2);
    stack.push(3);

    System.out.println("pop = " + stack.pop());
    System.out.println("pop = " + stack.pop());
  }
}
