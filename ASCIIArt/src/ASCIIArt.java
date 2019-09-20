/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOU CODE HERE :) 

public class ASCIIArt {
	public static void main (String [] args) {
    hat(); 
    ball();
    double2();
    ball();
    double2();
    ball();
    
		
	}
	public static void hat()  {
	    System.out.println("     /\\___@____/\\");                 
	    System.out.println("     |   $  __  $  |");
	    System.out.println("     <_____________>");
	    System.out.println("    |___||||||||||___|");
	    System.out.println("   _|____||||||||____|_");
	    System.out.println("  // |_____||||||_____| \\\\");
	    System.out.println(" //  |_____ ||||______|  \\\\");
	    System.out.println("//   |_______||_______|   \\\\");
	    System.out.println("||   |________|_______|     ||");
	}
	public static void ball()  {
		System.out.println("                          /-----\\ ");
		System.out.println("                         |-------| ");
	    System.out.println("                         | Ap sc |     ");
	    System.out.println("                          \\----/ ");
	}
	public static void double2()  {
	    System.out.println("                                    /\\___@____/\\");
	    System.out.println("                                    |   $  __  $  |");
	    System.out.println("                               ||   <_____________>");
	    System.out.println("                               ||  |___||||||||||___|");
	    System.out.println("                               || _|____||||||||____|_");
	    System.out.println("                               \\  |_____||||||_____| \\\\");
	    System.out.println("                                \\ |_____ ||||______|  \\\\");
	    System.out.println("                                 \\|_______||_______|   \\\\");
	    System.out.println("                                   |________|_______|    ||");
	}
	
}