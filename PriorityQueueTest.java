/*
 */

import java.io.*;
import java.awt.*;
import javax.swing.*;
import trubgp.*;  // TRU Board Games Playground package


public class PriorityQueueTest
{
  static Board board;  // Game board
  static PriorityQueue<String> queue;  // Min priority queue in which Strings are stored///
  static int SIZE = 20;
  
  
  public static void main(String[] args)
  {
    // Creat a game board
    create();
  }
  
  
  // Create a new board
  
  static void create()
  {
    // Construct a new board
    
    board = new Board(SIZE, SIZE, 40*SIZE, 40*SIZE, "Line", Color.WHITE);  // Line or NoLine
    board.setTitle("Min Priority Queue");
    
    board.button1SetName("Read a data file and save them into a queue");
    board.button1ClickEventListener(new BGPEventListener() { @Override public void clicked(int row, int col) {
      read();
    }});

    board.button2SetName("Remove the min");
    board.button2ClickEventListener(new BGPEventListener() { @Override public void clicked(int row, int col) {
      removeMin();
    }});
    
    board.setText("data.txt");
  }
  
  
  static void read()
  {
    String fileName;
    String line;

    try {
      fileName = board.getText();
      
      // FileReader reads text files in the default encoding.
      FileReader fileReader = new FileReader(fileName);

      // Always wrap FileReader in BufferedReader.
      BufferedReader bufferedReader = new BufferedReader(fileReader);
            
      int count = 0;
      int numElements = 0;
      
      while((line = bufferedReader.readLine()) != null) {
        line = line.trim();
        if (line.length() == 0)
          continue;
        if (line.charAt(0) == '/' && line.charAt(1) == '/')
          continue;
        
        numElements = Integer.parseInt(line);
        
        break;
      }

      // Create the min priority queue in which nodes will have strings as contents
      queue = new PriorityQueue<String>();///

      
      count = 0;
      while(count < numElements) {
        line = bufferedReader.readLine();
        line = line.trim();
        if (line.length() == 0)
          continue;
        if (line.charAt(0) == '/' && line.charAt(1) == '/')
          continue;
        
        // Add an element into the priority queue
        queue.addElement(Integer.parseInt(line), line); // ...(priority and strting)///
        
        count++;
      }   

      // Always close files.
      bufferedReader.close();  
      
      board.setText("");
      displayBFS(0);  // display the queue using BFS

      JOptionPane.showMessageDialog(null, "Reading done");
    }
    catch(FileNotFoundException ex) {
      JOptionPane.showMessageDialog(null, "File not found");
    }
    catch(IOException ex) {
      JOptionPane.showMessageDialog(null, "File i/o error");
    }
  }
  
  
  // Display the queue using BFS
  
  static void displayBFS(int row)
  {
    String contents[] = (bfs(queue.getRoot())).split(",");
    int count = contents.length;
    if (contents.length == 1 && contents[0].equals(""))
      count = 0;
    
    String s = "BFS Traversal";
    for (int col = 0; col < s.length(); col++)
      board.cellContent(row, col, "" + s.charAt(col));

    for (int col = 0; col < count; col++) {
      board.cellContent(row+1, col, contents[col]);
      board.cellBackgroundColor(row+1, col, Color.CYAN);
    }
    for (int col = count; col < SIZE; col++) {
      board.cellContent(row+1, col, "");
      board.cellBackgroundColor(row+1, col, Color.WHITE);
    }
  }
  
  
  // Unitility function to show the content of priority queue
  
  public static String bfs(NodePriorityQueue<String> node)
  {
    QueueListADT<NodePriorityQueue<String>> q = new QueueListADT<NodePriorityQueue<String>>();
    String s = "";
    
    q.enqueue(node);
    while(!q.isEmpty()) {
      node = q.dequeue();
      if (node != null) {
        if (s.length() == 0)
          s = node.getContent();
        else
          s = s + "," + node.getContent();
        q.enqueue((NodePriorityQueue<String>)node.getLeft());
        q.enqueue((NodePriorityQueue<String>)node.getRight());
      }
    }
    
    return s;
  }

  
  // Remove the min node and get its content
  
  static void removeMin()
  {
    if (queue.size() > 0) 
    {
      String s = "Min";
      for (int col = 0; col < s.length(); col++)
        board.cellContent(2, col, "" + s.charAt(col));
      
      String contentInNodeOfMinPriority = queue.removeMin();
      
      board.cellContent(3, 0, contentInNodeOfMinPriority);
      board.cellBackgroundColor(3, 0, Color.CYAN);
      
      displayBFS(0);
    }
  }
}
