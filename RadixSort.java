import java.util.*;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;



public class RadixSort{


 

 
  public static void main(String[] args) {
    
    
    LinkedQueue[] bin= {
  
    new LinkedQueue<String>(),
    new LinkedQueue<String>(),
    new LinkedQueue<String>(),
    new LinkedQueue<String>(),
    new LinkedQueue<String>(),
    new LinkedQueue<String>(),
    new LinkedQueue<String>(),
    new LinkedQueue<String>(),
    new LinkedQueue<String>(),
    new LinkedQueue<String>(),
    new LinkedQueue<String>(),
    new LinkedQueue<String>(),
    new LinkedQueue<String>(),
    new LinkedQueue<String>(),
    new LinkedQueue<String>(),
    new LinkedQueue<String>(),
    new LinkedQueue<String>(),
    new LinkedQueue<String>(),
    new LinkedQueue<String>(),
    new LinkedQueue<String>(),
    new LinkedQueue<String>(),
    new LinkedQueue<String>(),
    new LinkedQueue<String>(),
    new LinkedQueue<String>(),
    new LinkedQueue<String>(),
    new LinkedQueue<String>()
  };
  
  
    LinkedQueue<String> masterqueue=  new LinkedQueue<String>();
  
  // choose file to import  
  File file = new File("short.txt");
  
  
 try{
  Scanner scanner = new Scanner(file);
    
  while (scanner.hasNextLine()) {
  String word = scanner.nextLine();
  
  masterqueue.enqueue(word);
  //System.out.println(word);
  
  }
  //scanner.close();
  
 }
  
  catch (FileNotFoundException e) {
            e.printStackTrace();
        }
  
  
  for(int i=6; i>-1; i--){
    for(int j=0; j<26; j++){
      bin[j].clear();
      //System.out.println(j);
    }
    
    while(!masterqueue.isEmpty()){
      
      String s =masterqueue.dequeue();
      //System.out.println(s);
      char c = s.charAt(i);
      
      int index= c-'a';
      //System.out.println(index);
      bin[index].enqueue(s);
      
    
    }
    for(int k=0; k<26; k++){
      masterqueue.append(bin[k]);
      //System.out.println("lol");
      //System.out.println(k);
     
    }
    
  } 
  
  
  while(!masterqueue.isEmpty()){
    System.out.println(masterqueue.dequeue()); 
  }
  
  }

 }