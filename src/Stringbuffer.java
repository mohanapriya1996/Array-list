
public class Stringbuffer {

	public static void main(String[] args) {
		System.out.println("string is a immutable object");
		String name = "mohana";
		System.out.println("new name "+name.concat("priya"));
		System.out.println("new  name" +  name);
		 StringBuffer name1=new StringBuffer("mohana");
		 System.out.println("Append the name "+name1.append("priya"));
		System.out.println("Appended name "+name1 );

}
}
