/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ANTO AWESOME
 */
import java.util.Random;
public class Password {
    public static boolean passwordValidator(String pass1, String pass2){
	int charLowerCount = 0;
        int numCount = 0;
	int charUpperCount = 0;	
	String special="[$,#,!,`,_,%]";
   
for (int i = 0; i < pass1.length(); i++) {

            char ch = pass1.charAt(i);

            if (Character.isDigit(ch)) numCount++;
            else if (Character.isUpperCase(ch)) charUpperCount++;
		else if (Character.isLowerCase(ch)) charLowerCount++;
            
        }
     if (pass1.length() < 8 || pass1.length()>32) 
{
	System.out.println("Password should contain at least 8 characters.");
	return false;
}

else if(numCount<2)
{
System.out.println("Password must contain at least 2 numbers.");
	return false;
}
else if(charUpperCount<1)
{
System.out.println("Password must contain at least 1 capital letter character.");
	return false;
}
else if(charLowerCount<1)
{
System.out.println("Password must contain at least 1 small letter character.");
	return false;
}
else if(!pass1.equals(pass2)){
System.out.println("Re-Enter password not correct");
	return true;
}
else if(!pass1.matches(special))
{
System.out.println("Password must contain a special character");
return false;
}
else
{
System.out.println("Success");
return true;
 }   

   }  

    public static String passwordGenerator(int length){
      StringBuffer rbfr=new StringBuffer();
        String password = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^*&()_+";
	
        
	for(int i=0;i<length;i++)
	{
        Random rnd = new Random();
	int number12=rnd.nextInt(password.length());
	
		char ch=password.charAt(number12);
		rbfr.append(ch);
	
	}	
	
         return rbfr.toString();
	
    }

}

