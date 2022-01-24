package datastructure.linkedlist;

import org.junit.jupiter.api.Test;

public class NodeTest {

  @Test
  void NodeTest() {
    Node<Integer> node1 = new Node<>(1);
    Node<Integer> node2 = new Node<>(2);

    node1.next = node2;
    // 첫 번째 노드부터 찾아가야 하기 때문에 첫 번째 노트 설정
    Node head = node1;
  }
  
  @Test
  void LinkedTest() {
    SingleLinkedList<Integer> list = new SingleLinkedList<>();
    list.addNode(1);
    System.out.println("list.head.data = " + list.head.data);
    System.out.println("list.head.next = " + list.head.next);
    list.addNode(2);
    System.out.println("list.head.data = " + list.head.data);
    System.out.println("list.head.next = " + list.head.next.data);
  }

  @Test
  void printAll() {
    SingleLinkedList<Integer> linkedList = new SingleLinkedList<>();
    linkedList.addNode(1);
    linkedList.addNode(2);
    linkedList.addNode(3);
    linkedList.printAll();
  }
}
