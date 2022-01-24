package datastructure.linkedlist;

public class SingleLinkedList<T> {
  public Node<T> head = null;

  public void addNode(T data) {
    if (head == null) {
      head = new Node<>(data);
    } else {
      Node<T> node = head;
      // 끝까지 이동한 후
      while (node.next != null) {
        node = node.next;
      }
      // 맨 끝을 현재 노드로 연결
      node.next = new Node<>(data);
    }
  }

  public void printAll() {
    if (head != null) {
      Node<T> node = head;
      System.out.println("first node.data = " + node.data);
      while (node.next != null) {
        node = node.next;
        System.out.println("node.data = " + node.data);
      }
    }
  }
}
