public class Number
{
	public static void main(String[] args) {
	    String s="sruthi is a  girl";
	    int j=1;
	    for(int i=0;i<s.length();i++){
	    if((s.charAt(i) == ' ' )&&(s.charAt(i+1)!=' '))
	    j++;
	    }
		System.out.print(j);
	}
}