
public class Test 
{
	public static void main(String args[])
	{
		 	int Letters [] = new int[26];
		 	String text = "abcdefghijklmnopqrstuvwxyz";
		    int minimumCount = 0;
		    int lettersCovered = 0;
		    for(int x = 0; x < text.length(); x++)
		    {
		        if(Letters[(text.charAt(x) - 97)] == 0)
		        {
		        	System.out.println("Hit");
		            lettersCovered ++;
		            Letters[(text.charAt(x) - 97)] = 1;
		        }
		        if(lettersCovered <= 9)
		        {
		            minimumCount++;
		        }
		        else if(lettersCovered <= 18)
		        {
		            minimumCount +=2;
		        }
		        else
		        {
		            minimumCount +=3;
		        }
		    }
		    System.out.println(minimumCount);
		    
		    }
	}

