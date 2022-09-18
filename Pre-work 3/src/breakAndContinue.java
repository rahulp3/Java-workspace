class student{
	int id;
	String name;
}
class breakAndContinue{
	public static void main(String[] args) {
		student s1 = new student();
		student s2 = new student();
		s1.id = 123;
		s1.name = "Rahul";
		System.out.println(s1.id+" "+s1.name);
		System.out.println(s2.id+" "+s2.name);
	}
}