class Main
{
	public static void main(String args[])
	{
		Hdfc_Class c1 = new Hdfc_Class(78799,89667,38678,"kiran","NFMPK345");
		//c1.calMethod2();
		String res=c1.calMethod_1();
		System.out.println(res);
	}
}
class Hdfc_Class extends Sbi_Class
{
	Hdfc_Class(int account_Number2,int aadhar_Number2,int phone2,String holder_Name2,String pan_Number2)
	{
		super(account_Number2,aadhar_Number2,phone2, holder_Name2, pan_Number2);
	}
}
class Sbi_Class extends Rbi_Class
{

	Sbi_Class(int account_Number1,int aadhar_Number1,int phone1,String holder_Name1,String pan_Number1)
	{
		super( account_Number1, aadhar_Number1, phone1, holder_Name1, pan_Number1);
	}
}


class Rbi_Class
{

	int account_Number,aadhar_Number,phone;
	String holder_Name,pan_Number;
	Rbi_Class(int account_Number,int aadhar_Number,int phone,String holder_Name,String pan_Number)
	{
		this.account_Number= account_Number;
		this.aadhar_Number = aadhar_Number;
		this.phone = phone;
		this.holder_Name=holder_Name;
		this.pan_Number= pan_Number;
	}
	
	String calMethod_1()
	{
		return ("Person Accont : "+account_Number+"\n Account Holder name :"+holder_Name+"\nAadhar number  :"+aadhar_Number+"\n phone number :"+phone+"\n Pan number:"+pan_Number);
	}
}
		
		