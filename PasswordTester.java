/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ANTO AWESOME
 */
import java.util.Scanner;
import java.util.Random;
public class PasswordTester {

    public static void main(String[] args) {

        Password passw = new Password();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a new password:");
		String pass1 = scan.next();
            System.out.println("Re-enter the same password:");
        String pass2 = scan.next();
	int c=1;
	boolean res=passw.passwordValidator(pass1,pass2);
while(res!=true&&c<2)
{
c++;
System.out.println("Enter a new password:");
		 pass1 = scan.next();
            System.out.println("Re-enter the same password:");
         pass2 = scan.next();
 res=passw.passwordValidator(pass1,pass2);

}
 if(c>=2)
{
	String passgen="";
	String strong = "[A-Z,a-z,!,#,%,`,(,),^,$]+[0-9]{2,10}";
	int nn=8;
        passgen=passw.passwordGenerator(nn);
	int co=1;
	while(co<5){
	if(!passgen.matches(strong)){
	passgen=passw.passwordGenerator(++nn);
	}
	co++;
System.out.println(passgen);
	}
	
}
        
      
    }
}
