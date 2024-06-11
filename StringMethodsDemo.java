public class StringMethodsDemo
{
	public static void main(String[] args) 
	{
		String s1 = "Aditya";
		String s2 = "ADitya";
				
		System.out.println("Test: "+s1.charAt(3));
		System.out.println("Test: "+s1.equals(s2));
		System.out.println("Test: "+s1.equalsIgnoreCase(s2));
		System.out.println("Test: "+s1.compareTo(s2));
		System.out.println("Test: "+s1.compareToIgnoreCase(s2));
		System.out.println("Test: "+s1.startsWith("Adi"));
		System.out.println("Test: "+s1.endsWith("ya"));
		System.out.println("Test: "+s1.indexOf("a"));
	}
}