// Node for double linked list

public class NodeADT<T>
{
  private NodeADT<T> prev;
  private NodeADT<T> next;
  private T element;
  
  public NodeADT()
  {
    prev = null;
    next = null;
    element = null;
  }

  public NodeADT(T e)
  {
    prev = null;
    next = null;
    ???
  }
  
  public NodeADT<T> getNext()
  {
    return ???;
  }
  
  public void setNext(NodeADT<T> n)
  {
    ???
  }
  
  public NodeADT<T> getPrev()
  {
    return prev;
  }
  
  public void setPrev(NodeADT<T> p)
  {
    prev = p;
  }
  
  public T getElement()
  {
    return ???;
  }
  
  public void setElement(T e)
  {
    ???
  }
}
