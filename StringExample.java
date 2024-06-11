// String Demo Example

public class StringExample 
{
	public static void main(String[] args) 
	{
		String s1 = "A";
		String s2 = "Engineering";
		String s3 = new String("College");
		StringBuffer sb = new StringBuffer("AS");
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s1.equals(s3));
		System.out.println(s1.length());
		System.out.println(s1.concat("hai"));
		
		sb.insert(0, "for ");
		
		System.out.println(sb);
	}
}
