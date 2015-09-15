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
        Node LinkedList = new Node(1);
        LinkedList.appendToTail(2);
        LinkedList.appendToTail(3);
        LinkedList.appendToTail(4);
        
        LinkedList.deleteNode(LinkedList, 3);
    }
    
}
