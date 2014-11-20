// Lucy Brooks 10Te

public class point
{
  int x;
  int y;
  
  //Accessors
  public int getX()
  {
    return x;
  }
  public int getY()
  {
    return y;
  }
  public double distanceFromOrigin() 
  {
    return Math.sqrt(x * x + y * y);
  }
  public double distance(int dx, int dy)
  {
    return Math.sqrt((dx - x) + (dy - y));
  }
  public String toString()
  {
    return "("+x+","+y+")";
  }
  
  //Mutators
  public void setX(int newX)
  {
    x=newX;
  }
  public void setY(int newY)
  {
    y=newY;
  }
  public void translate(int dx, int dy) 
  {
    x += dx;
    y += dy;
  }
}
