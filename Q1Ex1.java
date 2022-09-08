/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package q1ex1;

/**
*
* @author MUON
*/
public class Ex01MuonDeLeon {

/**
* @param args the command line arguments
*/
public static void main(String[] args) {
String title1 = "Family Member 1";
String name1 = "Cyrus Dave De Leon";
int age1 = 15;
String occupation1 = "Student";
System.out.println (title1);
System.out.println (name1);
System.out.println (age1);
System.out.println (occupation1);
System.out.println (" ");

String title2 = "Family Member 2";
String name2 = "Cesar De Leon";
int age2 = 35;
String occupation2 = "OFW";
System.out.println (title2);
System.out.println (name2);
System.out.println (age2);
System.out.println (occupation2);
System.out.println(" ");

String title3 = "Family Member 3";
String name3 = "Ruby Ann Surat";
int age3 = 34;
String occupation3 = "Call Center Agent";
System.out.println (title3);
System.out.println (name3);
System.out.println (age3);
System.out.println (occupation3);
System.out.println(" ");

System.out.println ("The collective sum of the ages of family member 1 and 2 is " + Integer.sum(age1, age2));

boolean whichIsHigher = age1 > age2;
System.out.println ("Is Family member 1 older than Family member 2? " + whichIsHigher);

boolean whoIsOlder = age3 > age1;
System.out.println ("Is Family member 3 older than Family member 1? " + whoIsOlder);
}

}
