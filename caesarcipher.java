package ceasar;

import java.util.*;
public class encrypt
{
  public static void main(String args[])
  {
	  Scanner sc = new Scanner(System.in);
	char[] e=sc.nextLine().toCharArray();
	int k;
	k=sc.nextInt();
	  for(int i=0;i<e.length;i++)
	  {
	      if(Character.isLowerCase(e[i]))
	      {
		    e[i]=(char) (((int)e[i]+k));
		    if(e[i]>'z')
		    {
		    	e[i]=(char)(e[i]-26);
		    }
	      }
	      else if(Character.isUpperCase(e[i]))
	      {
	    	  e[i]=(char)((int)e[i]+k);
	    	  if(e[i]>'Z')
	    	  {
	    		  e[i]=(char)(e[i]-26);
	    	  }
	      }
	      else
	    	  e[i]=' ';
	
	  }
	System.out.println("encryption is " + new String(e));
	for(int i=0;i<e.length;i++)
	{
		 if(Character.isLowerCase(e[i]))
	      {
		e[i]=(char)((int)e[i]-k);
		if(e[i]<'a')	
		{
			e[i]=(char)(e[i]+26);
		}
	      }
		 else if(Character.isUpperCase(e[i]))
	      {
		e[i]=(char)((int)e[i]-k);
		if(e[i]<'A')	
		{
			e[i]=(char)(e[i]+26);
		}
	      }
	      else
	    	  e[i]=' ';
	}
	System.out.println("decryption is " + new String(e));
  }
}
