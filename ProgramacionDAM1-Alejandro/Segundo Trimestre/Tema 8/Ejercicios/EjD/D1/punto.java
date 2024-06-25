package EjD.D1;

public class punto {
  int x;
  int y;
  
  public punto(int x, int y) {
  this.x = x;
  this.y = y;
  }
  
  public void imprime() {
  System.out.println("(" + x + ", " + y + ")");
  }
  
  public void setXY(int x, int y) {
  this.x = x;
  this.y = y;
  }
  
  public void desplaza(int dx, int dy) {
  this.x += dx;
  this.y += dy;
  }
  
  public int distancia(punto p) {
  int dx = this.x - p.x;
  int dy = this.y - p.y;
  return (int)Math.sqrt(dx + dy);
  }
  
  public int getX() {
  return x;
  }
  
  public int getY() {
  return y;
  }
  
  public void setX(int x) {
  this.x = x;
  }
  
  public void setY(int y) {
  this.y = y;
  }
  }
