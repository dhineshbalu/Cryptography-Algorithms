import java.util.*;
public class MonoCipher
{

   public static void main(String args[])
   {
	  String  k="zyxwvutsrqponmlkjihgfedcba";
	
	   Scanner sc = new Scanner(System.in);
	   String s=sc.nextLine();
    String e = "";
	   for(int i=0;i<s.length();i++)
	   {
		   if(Character.isLowerCase(s.charAt(i)))
		   {
		   int r=(int)((s.charAt(i)-'a'));
		   e=e+k.charAt(r);
		   }
		   else if(Character.isUpperCase(s.charAt(i)))
		   {
			   int r=(int)((s.charAt(i)-'A'));
			   e=e+ (char)(k.charAt(r)-32);
		   }
		   else
			   e=e+" ";
	   }
	  System.out.println("encryption is :" + new String(e));
	  System.out.print("decryption is :");
	  for(int i=0;i<e.length();i++)
	  {
		  char c=e.charAt(i);
		  if(Character.isLowerCase(c))
		  System.out.print((char)(k.indexOf(c)+'a'));
		  else if(Character.isUpperCase(c))
			  System.out.print((char)(k.indexOf(c+32)+'A'));
		  else
			  System.out.print(" ");
	  }
   }
}
