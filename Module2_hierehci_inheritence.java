class Main{
	public static void main (String args[])
	{
		Sub_Class1 sc1 = new Sub_Class1(20504,"St.perter's college");
		Sub_Class2 sc2 = new Sub_Class2(23094,"Malla Reddy college");
		String a=sc1.final1();
		String b=sc2.final1();
		System.out.println(a+"\n"+b);

	}
}
class Sub_Class1 extends Super_Class{
	
	Sub_Class1(int college1,String college2)
	{
		super(college_Code,college_Name);
	}

}
class Sub_Class2 extends Super_Class{
	
	Sub_Class2(int college1,String college2)
	{
		super(college_Code,college_Name);
	}
}
class Super_Class{

	int college_Code;
	String college_Name;
	Super_Class(int college_Code,String college_Name)
	{
		this.college_Code=college_Code;
		this.college_Name = college_Name;
	}
	String final1()
	{
		return "College code : "+college_Code+"\nCollege Name : "+college_Name;
	}
}