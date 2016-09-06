import java.util.*;
import java.util.NoSuchElementException;

public class LinkedQueue<T> implements QueueADT<T>{
  

  private class Listnode{
    public T item;
    public Listnode next;
    
    public Listnode(T item, Listnode next){
     
      this.item= item;
      this.next=next;
      
    }
  
  }
  
  private Listnode front=null;
  private Listnode rear=null;
  
  public void enqueue(T item){
    Listnode newNode= new Listnode(item,null);
    if(isEmpty())
      front=newNode;
    else{
      rear.next=newNode; 
      
    }
    
    rear=newNode;
  }
  
  public T dequeue(){
     if(isEmpty())
       throw new NoSuchElementException();
     
     T item = front.item;
     if(rear==front)
       rear=null;
     
     front = front.next;
     return item;
  
  }
  
  public boolean isEmpty(){
   return front == null; 
  }
  
  public void clear(){
   front=null;
   rear=null;
  
   
  }
  
  public void append(LinkedQueue<T> q){
    if(!this.isEmpty()&& !q.isEmpty()){
      this.rear.next=q.front;
      this.rear=q.rear;
    }
    
    else if(this.isEmpty()){
      this.front=q.front;
      this.rear=q.rear;
    }
  
    
  }
    
  
}