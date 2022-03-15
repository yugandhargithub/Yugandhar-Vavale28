package ExceptionHandaling;

class vaccinationn
{
	public static void ageValidation(int age)
	{
		try {
			
			if(age<18)
			{
				//*thow exception explicitly
				//throw new ArithmeticException("Age not valid for vaccination");
				throw new CovidVaccineValidException("Age not valid for vaccination");
			}
			else
			{
				System.out.println("Age is valid for vaccination");
			}	
		}
		catch(CovidVaccineValidException e)
		//catch(ArithmeticException e)
		{
			
			System.out.println(e.getMessage());
		}
	}

}
public class throwdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vaccinationn.ageValidation(13);
		vaccinationn.ageValidation(21);
	}

}
