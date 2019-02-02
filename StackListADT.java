/*
 * Stack using doubly linked list
 */

public class StackListADT<T>
{
  private LinkedListADT<T> linkedList;
  
  public StackListADT()
  {
    this.linkedList = new LinkedListADT<T>();
  }
  
  public void push(T element)
  {
    ???
  }

  public T pop()
  {
    ???
  }
  
  public T peek()
  {
    return this.linkedList.last();
  }
  
  public boolean isEmpty()
  {
    return ???
  }
  
  public int size()
  {
    return ???
  }
  
  public NodeADT<T> head()
  {
    return linkedList.head();
  }
}
