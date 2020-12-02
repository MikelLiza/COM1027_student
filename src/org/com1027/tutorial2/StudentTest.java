/**
 * 
 */
package org.com1027.tutorial2;

/**
 * @author ml01329
 *
 */
public class StudentTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Module m1 = new Module("com1027");
		Module m2 = new Module("com1028");
		Module m3 = new Module("com1026");
		Student s1 = new Student("Joe","Bloggs",10, m1, m2);
		System.out.println(s1);
		System.out.println(s1.getForename());
		System.out.println(s1.toString());
		Student s2 = new Student("Stella","Kazamia",0, m1, m3);  
		System.out.println(s2);
	}
		

}
