public class VertexString extends Vertex<String>
{
  public VertexString(String content)
  {
    super(content);
  }
  
  public VertexString(int id, String content)
  {
    super(id, content);
  }
  
  public VertexString(int id, String content, VertexString parent)
  {
    super(id, content, parent);
  }
}