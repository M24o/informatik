// turtle.java
import ch.aplu.turtle.*;
import java.awt.Color;
public class turtle
{
  private Turtle t = new Turtle();

  public turtle()
  {
    
  }
void grund(s)
  {
    t.fd(s);
    t.rt(60);
    t.fd(k);
    t.rt(90);
    t.fd(k);
    t.lt(60);
    t.fd(s);
    t.rt(90);
    t.fd(s);
    t.rt(90);

  }

void Farbe( int rt)
  {

   {
  if (rt < 1)
    {
      t.setPenColor(new Color(1,255,100));
      t.setLineWidth(1);
    } else if (rt < 2)
  {
      t.setPenColor(new Color(100,255,250));
      t.setLineWidth(1);
    } else if (rt < 3)
    {
      t.setPenColor(new Color(255,200,243));
      t.setLineWidth(3);
    } else if (rt < 4)
    {
      t.setPenColor(new Color(0123,100,013));
      t.setLineWidth(5);
    } else if (rt < 5)
    {
      t.setPenColor(new Color(120,70,233));
      t.setLineWidth(5);
    } else if(rt < 6)
          {
      t.setPenColor(new Color(128,64,0));
      t.setLineWidth(5);
    } else if (rt < 7)
    {
      t.setPenColor(new Color(128,65,1));
      t.setLineWidth(8);
    } else if (rt < 7)
    {
      t.setPenColor(new Color(129,65,32));
      t.setLineWidth(9);
    } else if (rt < 8)
    {
      t.setPenColor(new Color(128,64,230));
      t.setLineWidth(9);
    }
   {







  }
public static void main(String[] args)
  {
    new turtle();
  }
}