class Test1{
 public static void main(String[] args)
{
Triangle t = new Triangle();
t.h= 5;
t.b = 7;
System.out.println(t.area());
System.out.println(t.perimeter());
}
}
class Triangle{
int b,h;
public  double area(){
return 0.5*b*h;
}
public int perimeter(){
return 3*(b);
}
}