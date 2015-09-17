/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistproblems;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author MHatem
 */
public class LinkedListFunctions {

    public static Node removeDuplicate(Node head) {
        Node linkedList = head;
        Set<Integer> check = new HashSet<>();
        while (linkedList.next != null) {
            if (!check.add(linkedList.data)) {
                linkedList.next = linkedList.next.next;
            } else {
                linkedList = linkedList.next;
            }
        }
        return head;
    }

    // get begining node in Circular LinkedList 
    public static Node beginingNode(Node head) {
      Node first =  head;
      Node second = head;
      if(head.next == null)
          return null;
      while (second != null || first != null){
          if(first.data == second.data)
              return first;
          first = first.next;
          second = second.next.next;
      }
      
      return first;
    }
}
