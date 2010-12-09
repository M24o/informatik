// MyTurtle.java

import ch.aplu.turtle.*;

class MyTurtle
{
  Turtle t = new Turtle();

  MyTurtle()
  {
  t.hideTurtle();
  t.setPos(-150,140);
  kreuz();
  t.right(90);
  //grosses Kreuz
  for (int x = 0; x < 3; x++)
  {
  t.penUp();
  t.forward(100);
  t.penDown();
  kreuz();
  }
  //kleineres Kreuz
  t.right(90);
  t.penUp();
  t.forward(100);
  t.penDown();
  kreuzklein();
  t.right(90);
 for (int k = 0; k < 3; k++)
 {
 t.penUp();
 t.forward(100);
 t.penDown();
 kreuzklein();
 }
  //sehr kleines Kreuz
  t.left(90);
  t.penUp();
  t.forward(70);
  t.penDown();
  kreuzsehrklein();
  t.left(90);
for (int l = 0; l < 3; l++)
 {
 t.penUp();
 t.forward(100);
 t.penDown();
 kreuzsehrklein();
 }
 
}

  double a = 50;
  void dreieck()
{
t.left(30);
t.forward(a);
t.right(120);
t.forward(a);
t.right(120);
t.forward(a);
t.left(30);
}

void kreuz()
{
for (int i = 0; i < 4; i++)
{
dreieck();
t.right(90);
}
}

void dreieckklein()
{
double e = a*0.6;
t.left(30);
t.forward(e);
t.right(120);
t.forward(e);
t.right(120);
t.forward(e);
t.left(30);
}

void kreuzklein()
{
for (int i = 0; i < 4; i++)
{
dreieckklein();
t.right(90);
}
}

void dreiecksehrklein()
{
double r = a*0.3;
t.left(30);
t.forward(r);
t.right(120);
t.forward(r);
t.right(120);
t.forward(r);
t.left(30);
}

void kreuzsehrklein()
{
for (int i = 0; i < 4; i++)
{
dreiecksehrklein();
t.right(90);
}
}
  

  public static void main(String[] args)
  {
    new MyTurtle();
  }
}