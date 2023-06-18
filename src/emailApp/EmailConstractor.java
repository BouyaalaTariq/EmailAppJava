package emailApp;

import java.util.Scanner;

public class EmailConstractor {

	
	private String firstname;
	private String lastname;
	private String password;
	private String email;
	private int emailCapacity=500;
	private String departement;
	private String emailAlter;
	private int length=8;
	private String suffix=".company.com";
	
	
	
	// constructor to receive first & lastname 
	
	public EmailConstractor(String firstname, String lastname) {
			
		this.firstname = firstname;
		this.lastname = lastname;
		
		System.out.println(" Email Created For   "+firstname+ "  " +lastname);
		
		// Call Return Departement :
		
		this.departement=AskDepartement();
		System.out.println(" Departement Is " +departement);
		
		// call Return Password : 
		
		password=RandPass(length);
		System.out.println(" Your Password Is : " +password);
		
		// Call Email Generator 
		
		emailAlter=SetMail();
		System.out.println(emailAlter);
	}
	
	//Ask for departement 
	
	 private String AskDepartement() {
		 
		 System.out.println(" can u please choose your departemen\n  0. none\n 1.Dev\n 2.I2GSP \n3.Fullstack ");
		 
		 Scanner in=new Scanner(System.in);
		 int depChoice=in.nextInt();
		 
		 
		 
		
		  if(depChoice==1) {return "Dev";}
		  else if(depChoice==2) {return "I2GSP";}
		 else if(depChoice==3)   {return "FULLSTACK";}
		 else {return "None";}
		  
		 }
		 
	//Generate a random password
	 
	 private String RandPass(int length) {
		 
		String Setpass="ABCDEFG12345!+-#";
		char[] password=new char[length];
		
		for(int i=0;i<length;i++) {
			
			int rand=(int)(Math.random()* Setpass.length());
			password[i]=Setpass.charAt(rand);
		}
			 return new String (password);
		 
	 }
	 
		// set the Alternate Email 
	 private String SetMail() {
		 return " your Email, Is "+firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+departement.toLowerCase()+suffix;
	 }
		 
	 }
	


	//Set the Mail Box Capacity 
	// set the Alternate Email 
	// chage the Password
	

