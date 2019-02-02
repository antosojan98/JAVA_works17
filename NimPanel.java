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
public class NimPanel {
	static String ch;
    public static void main (String args[]){
	do {
        Nim scan1 = new Nim();
        System.out.println(" Welcome to the Nim Game! ");
        System.out.println();
        Scanner scan = new Scanner(System.in);
        System.out.print(" Please enter the number of stones to be used in this game : ");
        int NumStones = scan.nextInt();
        scan1.setNumStone(NumStones);
        System.out.println();
        System.out.print(" Enter your name : ");
        String name = scan.next();
        scan1.setName(name);
        System.out.println( );
        scan1.choose(NumStones);
	
	System.out.println("\nWant to play again? (Y/N): ");
	ch=scan.next();
	}while(ch.equals("Y")||ch.equals("y"));
    }
}
