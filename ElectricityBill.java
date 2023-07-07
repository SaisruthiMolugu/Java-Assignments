import java.util.*;
 class ElectricityBill
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter cmr units");
        int CMR=sc.nextInt();
        System.out.println("enter pmr units");
        int PMR=sc.nextInt();
        System.out.println("enter category");
        char ch = sc.next().charAt(0);
        int units=CMR-PMR;
        int totalbill;
        switch(ch) {
            case 'D':
                if(units <100)
                {
                    totalbill = 100 *1;
                }
                else if(units<=200)
                {
                    totalbill = (100+((units-100)*2));
                }
                else
                {
                    totalbill = (100+(100*2)+((units-200)*3));
                }
                 System.out.println(totalbill);
                break;
                case 'C':
                if(units <100)
                {
                    totalbill = 100 *2;
                }
                else if(units<=200)
                {
                    totalbill = (((units-100)*4)+(100*2));
                }
                else 
                {
                    totalbill = ((100*2)+(100*4)+((units-200)*6));
                }
                 System.out.println(totalbill);
                break;
                case 'I':
                if(units <100)
                {
                    totalbill = 100 *3;
                }
                else if(units<=200)
                {
                    totalbill = (((units-100)*6)+(100*3));
                }
                else 
                {
                    totalbill = ((100*3)+(100*6)+((units-200)*9));
                }
                 System.out.println(totalbill);
                break;
        }


    }
}