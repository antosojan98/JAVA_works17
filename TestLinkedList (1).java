import java.awt.*;
import trubgp.*;  // TRU Board Games Playground package


public class TestLinkedList
{
  static Board board;  // Game board
  static int SIZE = 20;  // Stack size
  
  
  public static void main(String[] args)
  {
    // Creat a game board
    create();
  }
  
  
  /**
   * create - Create a new board
   */
  
  static void create()
  {
    // Construct a new board
    
    board = new Board(3, SIZE, 600, 90, "Line", Color.LIGHT_GRAY);  // Line or NoLine
    board.setTitle("Test - LinkedList");
    
    board.button1SetName("Add to the first");
    board.setText("");
    board.button1ClickEventListener(new BGPEventListener() { @Override public void clicked(int row, int col) {
      add();
    }});

    board.button2SetName("Remove the last");
    board.button2ClickEventListener(new BGPEventListener() { @Override public void clicked(int row, int col) {
      remove();
    }});
  }


  /**
   * linkedList --- LinkedListADT<String> object
   */
  
  static LinkedListADT<String> linkedList = new LinkedListADT<String>();
  
  
  /**
   * display --- Display a linked list on the board
   */
  
  static void display()
  {
    for (int col = 0; col < SIZE; col++) {
      board.cellContent(0, col, "");
      board.cellBackgroundColor(0, col, Color.LIGHT_GRAY);
    }

    NodeADT<String> node = linkedList.head();
    if (node == null)
      return;
    for (int col = 0; col < linkedList.size() && col < SIZE; col++) {
      board.cellContent(0, col, node.getElement());
      board.cellBackgroundColor(0, col, Color.CYAN);
      node = node.getNext();
    }
  }
  

  /**
   * add --- Invoked when "Add to the first" button is clicked; 
   *         Read the text and add the text into the first place of the linked list
   */
  
  static void add()
  {
    // read the text from the text field
    String word = board.getText().trim();
    
    // add the text to the first place of the linked list
    if (word.length() > 0)
      linkedList.addToFirst(word);
    
    // display the linked list
    display();
  }
  
  
  /**
   * remove --- Invoked when "Remove the last" button is clicked; 
   *            Remove the last value from the linked list and display it in the text field
   */
  
  static void remove()
  {
    // remove the last from the linked list
    String word = linkedList.removeLast();
    
    // display the linked list
    display();
    
    // display the text in the text field
    board.setText(word);
  }
}
