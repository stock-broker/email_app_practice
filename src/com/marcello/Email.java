package com.marcello;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapactiy;
    private String alternateEmail;

    public Email(String fname, String lname){
        this.firstName = fname;
        this.lastName = lname;
        System.out.println("Emailed Created: " + this.firstName + "\t Last name: " + this.lastName);

        this.department = setDepartment();
        System.out.println("Department is: " + this.department);
    }

    //ask for department
    private String setDepartment(){
        System.out.println("Enter department \n 1 for sales \n 2 development \n 3 account \n 0 for none");
        Scanner in = new Scanner(System.in);
        int departmentChoice = in.nextInt();
        if(departmentChoice == 1) return "sales";
        else if(departmentChoice == 2) return "dev";
        else if(departmentChoice == 3) return "accounting";
        else return "";
    }

    //generate random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%abcdefghijklmnopqrstuvwxyz";
        char[] password = new char[length];
        for(int i=0; i < length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
    //set mailboxCapacity

    //set alternate email

    //change the password
}