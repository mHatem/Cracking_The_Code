/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistproblems;

/**
 *
 * @author MHatem
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Node LinkedList = new Node(3);
        Node c1 = new Node(7);
        Node c2 = new Node(8);
        Node c3 = new Node(9);
        Node c4 = new Node(2);
        Node c5 = new Node(1);
        LinkedList.next = c1;
        c1.next = c2;
        c2.next = c3;
        c3.next = c4;
        c4.next = c5;
        c5.next = LinkedList;
        

        
       //LinkedList = LinkedListFunctions.removeDuplicate(LinkedList);
        LinkedList = LinkedListFunctions.beginingNode(LinkedList);
          System.out.println(LinkedList.data);
//        while(LinkedList.next != null){
//            System.out.println(LinkedList.data);
//            LinkedList = LinkedList.next;
//        }
    }

}
