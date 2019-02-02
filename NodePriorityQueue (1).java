/*
 * Min priority queue node
 */

public class NodePriorityQueue<T> extends NodeBinaryTree<T>
{
  private int priority;  // The smaller, the higher
  
  public NodePriorityQueue(T content)
  {
    super(content);
  }
  
  public void setPriority(int p)
  {
   priority = p;
  }
  
  public int getPriority()
  {
    return priority;
  }
}