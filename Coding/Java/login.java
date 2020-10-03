package Login_PasswordCheck;

import java.util.Scanner;

public class login {
	
	//Password Conditions:
	//1. length b/w 5 to 12
	//2. no special characters
	//3. no consecutive 5 letters or 5 numbers

	public static void main(String[] args) {
		int c=0, sp=0, count=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your username (only Email id Allowed) for Sign-Up:");
		String user=scan.nextLine();
		String pass="";
		
		if(user.contains(".") && user.contains("@") && (user.contains(".com") || user.contains(".in")) == true)
		{
			if(user.lastIndexOf('.') > user.lastIndexOf('@'))
			{
				System.out.println("User name is valid");
				c=1;
				}
			else
			{
				System.out.println(". operator should come after @");
				c=1;
			}
		}
		else
		{
			System.out.println("User name is invalid");
		}
		
		if(c==1)
		{
			System.out.println("Enter your Password for Sign-Up:");
			pass = scan.nextLine();
			if(pass.length()>=5 && pass.length()<=12)
			{
				if(pass.equalsIgnoreCase(user) == true)
				{
					System.out.println("Username and password can't be same");
				}
				else
				{
					for(int i=0 ; i<pass.length() ; i++)
					{
						if (((int)pass.charAt(i) >= 0 && (int)pass.charAt(i) <= 47) || 
							((int)pass.charAt(i) >= 58 && (int)pass.charAt(i) <= 64) ||
							((int)pass.charAt(i) >= 91 && (int)pass.charAt(i) <= 96) ||
							((int)pass.charAt(i) >= 123 && (int)pass.charAt(i) <= 127))
						{
							System.out.println("Password should not contain any special character");
							sp=0;
							break;
						}
						else
						{
							sp=1;
						}
					}
					if(sp==1)
					{
						for(int i=0 ; i<pass.length()-1 ; i++)
						{
							if( ( ( (pass.charAt(i)>='A' && pass.charAt(i)<='Z') || (pass.charAt(i)>='a' && pass.charAt(i)<='z') )  &&
									( (pass.charAt(i+1)>='A' && pass.charAt(i+1)<='Z') || (pass.charAt(i+1)>='a' && pass.charAt(i+1)<='z') ) ) ||
									( (pass.charAt(i)>='0' && pass.charAt(i)<='9') && (pass.charAt(i+1)>='0' && pass.charAt(i+1)<='9') ))
							{
								count++;
								if(count>=4)
								{
									break;
								}
							}
							else
							{
								count = 0;
							}
						}
						
						if(count>=4)
						{
							System.out.println("There cannot be five consecutive characters or numbers");
						}
						else
						{
							System.out.println("Password is correct");
						}
					}
				}
			}
			else
			{
				System.out.println("Length of password is too short");
			}
		}
	
	}
}