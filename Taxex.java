import java.util.*;
class Taxex
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ann = sc.nextInt();
        ann = ann*12;
        double tax = 0;
        if(ann<=250000);
        else if(ann>250000 && ann<=500000)
        {
            tax += ((ann - 250000)*0.1);
        }
         else if(ann > 500000 && ann<=1000000)
        {
            tax += (((ann - 500000)*0.2)+(250000*0.1));
        }
         else 
        {
           tax += (((ann - 10000000)*0.3) + (500000*0.2) + (250000*0.1));
        }
        System.out.println(tax);
    }
}