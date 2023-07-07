import java.util.*;
class Calendar
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
dates d=new dates();
System.out.println("Enter year:"  );
int y=sc.nextInt();
System.out.println("Enter month:"  );
int m=sc.nextInt();
System.out.println("Enter days:"  );
int w=sc.nextInt();
d.setyears(y);
d.setmonths(m);
d.setdays(w);
System.out.print("Enter the character : ");
    char c=sc.next().charAt(0);
    switch(c)    
    {
        case 'y':
            y = sc.nextInt();
                d.incrementyears(y);
            break;
        case 'm':
            m = sc.nextInt();
                d.incrementmonths(m);
            break;
        case 'w':
            w = sc.nextInt();
                d.incrementdays(w);
            break;
        }
System.out.println("years :  "+d.getyears());
System.out.println("months :  "+d.getmonths());
System.out.println("days  :  "+d.getdays());
}
}
class dates
{
private int years;
private int months;
private int days;
private int validatemonths(int months)
{
return months>=1&& months<=12 ? months :months%12;
}
private int validatedays(int days)
{
return days>=1 && days <=30 ?days :days%12;
}
private int validateyears(int years)
{
return years>1? years :++ years;
}
public void setyears(int years)
{
this.years=years;
}
public void setmonths(int months)
{
this.months=months;
}
public void setdays(int days)
{
this.days=days;
}
public void incrementdays(int days)
{
this.days+=days;
if(this.days>30)
{
incrementmonths(this.days/30);
this.days=this.days%30;
}
}
public void incrementmonths(int months)
{
this.months+=months;
if(this.months>12)
{
incrementyears(this.months/12); 
this.months=this.months%12;
}
}
public void incrementyears(int years)
{
this.years+=years;
}
public int getdays()
{
return days;
}
public int getmonths()
{
return months;
}
public int getyears()
{
return years;
}
}

 