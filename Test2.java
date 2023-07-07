class Test2
{
	public static void main(String[] args)
	{
		
		Rectangle t = new Rectangle(10 , 5);
		System.out.println("area of Rectangle     : "+t.area());
		System.out.print("perimeter of Rectangle : "+ t.perimeter());
	}
}
class Rectangle
{
	double length;
	double breadth;
	public double area()
	{
		return length*breadth;
	}
	public double perimeter()
	{
		return (2*(length+breadth));
	}
}