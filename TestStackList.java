import java.awt.*;
import trubgp.*;  // TRU Board Games Playground package


public class TestStackList
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
    board.setTitle("Test - Stack");
    
    board.button1SetName("Push");
    board.setText("");
    board.button1ClickEventListener(new BGPEventListener() { @Override public void clicked(int row, int col) {
      push();
    }});

    board.button2SetName("Pop");
    board.button2ClickEventListener(new BGPEventListener() { @Override public void clicked(int row, int col) {
      pop();
    }});
  }


  /**
   * Stack --- StackListADT<String> object
   */
  
  static StackListADT<String> stack = new StackListADT<String>();
  
  
  /**
   * display --- Display a stack on the board
   */
  
  static void display()
  {
    for (int col = 0; col < SIZE; col++) {
      board.cellContent(0, col, "");
      board.cellBackgroundColor(0, col, Color.LIGHT_GRAY);
    }

    NodeADT<String> node = stack.head();
    if (node == null)
      return;
    for (int col = 0; col < stack.size() && col < SIZE; col++) {
      board.cellContent(0, col, node.getElement());
      board.cellBackgroundColor(0, col, Color.CYAN);
      node = node.getNext();
    }
  }
  

  /**
   * push --- Invoked when "Push" button is clicked; 
   *          Read the text and push it into the stack
   */
  
  static void push()
  {
    // read the text from the text field
    String word = board.getText().trim();
    
    // push the text into the stack
    if (word.length() > 0)
      stack.push(word);
    
    // display the stack
    display();
  }
  
  
  /**
   * pop --- Invoked when "Pop" button is clicked; 
   *         Pop the last value from the stack and display it in the text field
   */
  
  static void pop()
  {
    // remove the last from the stack
    String word = stack.pop();
    
    // display the stack
    display();
    
    // display the text in the text field
    board.setText(word);
  }
}
