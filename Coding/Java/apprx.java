package Word_Approximation;

import java.util.Scanner;

public class apprx {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String[] words = {"cheat","sheet","meat","great","wheat"}; // words currently stored in library
		String match = new String();
		int count=0, grt=0;
		System.out.println("Enter a word to scan:");
		String ipt = scan.nextLine();
		
		for(int i=0 ; i<words.length ; i++)
		{
			char[] abc = words[i].toCharArray();
			char[] xyz = ipt.toCharArray();
			
			if(ipt.equals(words[i]))
			{
				match = words[i];
				break;
			}
			
			if(abc.length == xyz.length)
			{
				count=0;
				for(int j=0 ; j<xyz.length ; j++)
				{
					for(int k=j ; k<abc.length ; k++)
						if(abc[k] == xyz[j])
						{
							count++;
						}
				}
			
				if(count > grt)
				{
					grt = count;
					match = words[i];
				}
			}
		}
		
		if(match.equals(ipt))
			System.out.println("Word Found!");
		else
			System.out.println("Word Not Found!\nSuggested Word: " + match);
		
	}
}