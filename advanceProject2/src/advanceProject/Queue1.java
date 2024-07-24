/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advanceProject;



/**
 *
 * @author MAS
 */
public class Queue1 {
    
    private Node first = null; // least-recently added
    private Node last = null; // most-recently added
 private int c=0;
 
  // is the queue empty?
  public int size(){
       return c;
   }
    
    public boolean isEmpty() {
        return first == null;
    }
 
    public String dequeue() {
    
          String item = first.item;
        first = first.next;
        return item;

    }
    public void enqueue(String item) {
        Node x = new Node();
        x.item = item;
        if (isEmpty()) {
            first = x;
            last = x;
        } else {
            last.next = x;
            last = x;
        }
        c++;
    }
  private class Node {

        private String item;
        private Node next;
    }
}
