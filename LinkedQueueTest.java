import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class LinkedQueueTest extends TestCase {
  
  /**
   * A test method.
   * (Replace "X" with a name describing the test.  You may write as
   * many "testSomething" methods in this class as you wish, and each
   * one will be called when running JUnit over this class.)
   */
  public void testLinkedQueue() {
    
    //enqueue using strings
    LinkedQueue<String> queue = new LinkedQueue<String>();
    queue.enqueue("food");
    queue.enqueue("drink");
    
    //dequeue using strings
    assertEquals("Enqueued and dequeued drink","food",queue.dequeue());
    
    LinkedQueue<String> queue2 = new LinkedQueue<String>();
    
    queue2.enqueue("soccer");
    queue2.enqueue("basketball");
    
   
    
    // appending queue and queue2
    queue.append(queue2);
    
    //checking that it appended both linkedqueues correctly by dequeueing
    assertEquals("dequeue drink","drink",queue.dequeue());
    assertEquals("dequeue soccer","soccer",queue.dequeue());
    assertEquals("dequeue basketball","basketball",queue.dequeue());
    
    //checking empty method
    assertTrue("check that queue is empty", queue.isEmpty());
    
    
    //testing for integers
    LinkedQueue<Integer> queue3 = new LinkedQueue<Integer>();
    
    // testing enqueue method using integers
    queue3.enqueue(1);
    queue3.enqueue(2);
    queue3.enqueue(3);
    
   
    //testing dequeue method using integers
    assertEquals("dequeue soccer",(Integer)1,queue3.dequeue());
    
    //testing clear function
    queue3.clear();
    
    assertTrue("check that queue3 is empty", queue3.isEmpty());
    
    
  }
  
 
    
    
 
  
}
