public class Driver 
{
	public static void main(String[] args)
	{
		String s = "hello";
		String s2 = "elephant";
		Driver.removeVowels(s);
		Driver.removeConsonants(s);
		Driver.removeDigits(s);
		
	}
	
	//returns a new String with all of the vowels
	//removed form the parameter String
	//"hello" -> hll
	static String removeVowels(String s)
	{
		String answer = "";
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) == 'a')
			{
				answer = answer;
			}
			else if(s.charAt(i) == 'e')
			{
				answer = answer;
			}
			else if(s.charAt(i) == 'i')
			{
				answer = answer;
			}
			else if(s.charAt(i) == 'o')
			{
				answer = answer;
			}
			else if(s.charAt(i) == 'u')
			{
				answer = answer;
			}
			else
			{
				answer = answer + s.charAt(i);
			}
		}
		System.out.println(answer);
		return answer;
		
	}
	
	//returns a new String with all of the consonants
	//removed form the parameter String
	//"hello" -> eo
	static String removeConsonants(String s)
	{
		String answer = "";
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) == 'a')
			{
				answer = answer + s.charAt(i);
			}
			else if(s.charAt(i) == 'e')
			{
				answer = answer + s.charAt(i);
			}
			else if(s.charAt(i) == 'i')
			{
				answer = answer + s.charAt(i);
			}
			else if(s.charAt(i) == 'o')
			{
				answer = answer + s.charAt(i);
			}
			else if(s.charAt(i) == 'u')
			{
				answer = answer + s.charAt(i);
			}
			else
			{
				answer = answer;
			}
		}
		System.out.println(answer);
		return answer;
		
	}
		
	//returns a new String with all of the numbers
	//removed form the parameter String
	//"he11o" -> heo
	static String removeDigits(String s)
	{
		String answer = "";
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) >= '0' && s.charAt(i) <= '9')
			{
				answer = answer;
			}
			else
			{
				answer = answer + s.charAt(i);
			}
		}
		System.out.println(answer);	
		return answer;
	}
		
	//return the first occurence in s where c is found or -1 if 
	//it was not found - we can't use the String's indexOf
	static int indexOf(String s, char c)
	{
		for(int i = 0; i < s.length(); i = i + 1)
		{
			if(s.charAt(i) == c)
			{
				return i;
			}
		}
		//if we are still kicking....
		return -1;
	}
	
	static void displayString(String s)
	{
		//should display the contents of the String one character per line
		for(int i = 0; i < s.length(); i = i + 1)
		{
			System.out.println(s.charAt(i));
		}
	}
	
	static void displayWithSpaces(String s)
	{
		String answer = "";
		for(int i = 0; i < s.length(); i = i + 1)
		{
			answer = answer + s.charAt(i) + " ";
		}
		System.out.println(answer);
	}
	
	//this method should display on a single line the input String
	//in reverse: "hello" -> "olleh"
	static String reverseString(String s)
	{
		String answer = "";
		for(int i = s.length()-1; i >= 0; i = i - 1)
		{
			answer = answer + s.charAt(i);
		}
		return answer;
	}
}