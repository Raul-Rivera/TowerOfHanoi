/*
Name: Raul Rivera Ortiz
Course: CSC 122 001
Project #7

Project description:
	The Tower of Hanoi is a classic problem in the world of programming. 
	The problem setup consists of three rods and n disks.
	The disks can be moved from one rod to another. The n disks are of different sizes.
	In this program the number of disk are 1, 2, 3, 4 and 5.
	
Purpose:
	1. Become familiar with if statements and for loops.
	2. Become familiar calling functions.
	3. Become familiar in programs documentations when it's executed.
	
What the program does?:
	Initially all the disks are stacked on the first tower. 
	The disks are stacked in such a way that a disk is always over a disk bigger than itself.
	So you need to move all the disks from the first tower over to the last. 
	You can only move one disk at a time and never place a smaller disk over a larger disk.
	To do this I have an extra tower, it is known as auxiliary tower.
	Since you can only move one disk at a time, the disk you move will have to be at the top of its tower.
	Let’s name the towers as A,B,C and the disks as 1,2,3,...,n.
	I solve this question using simple recursion.
	In the function I write, I will print the movement of the disks.
	Let’s begin with understanding the two main parts of the code to solve the Tower of Hanoi problem.
		The base case in my code is when I only have one disk. That is n=1.
		The recursive calls to solve tower of Hanoi.
			Move the top n-1 disks to the auxiliary tower.
			Move 1 disk from source rod to destination rod.
			Take the n-1 disks from auxiliary disk to the destination rod.
	
How you tested the program:
	First, I wrote my code on a Notepad.
	Then, I save the file in a folder that I made and call it Java-projects.
	Then, I opened the Command Prompt and moved it to the same Path with the command: cd
	Then I compiled the file with the command: javac GFG.java and
	a new file was created with the same name but with the class extension.
	Then I ran the program with the command: java GFG

Limitations if any in the program:
	No limitations.
*/

public class GFG { //Open class GFG.

	public static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) { //Start method.  
	
		if (n == 1) { // If the numbers of disk is equal to 1
			System.out.println("Move disk 1 from rod " +  from_rod + " to rod " + to_rod); // Print this message when the numbers of disk is 1.
			return;
		} // end if conditional
		
		towerOfHanoi(n-1, from_rod, aux_rod, to_rod); // The recursive calls to solve tower of Hanoi.
			   
		System.out.println("Move disk " + n + " from rod " +  from_rod + " to rod " + to_rod); //Print a message when the disk are being moved.
		
		towerOfHanoi(n-1, aux_rod, to_rod, from_rod); // The recursive calls to solve tower of Hanoi.
		
	} //end towerOfHanoi method.

	// Driver method 
	public static void main(String args[]) { // Start main method
	
		for (int n = 1; n<=5; n++){ // 'n' is equal to the number of disks, in this case n = 5. The program will test 
									// what happen when the disk is equal to 1, 2 ,3, 4 and 5.
									
			long t1 = System.currentTimeMillis(); // Calculate the time in milliseconds before the method is called.
			towerOfHanoi(n, 'A', 'C', 'B');  // A, B and C are names of rods 
			long t2 = System.currentTimeMillis(); // Calculate the time in milliseconds after the method is called.
			long t3 = t2 - t1; // Calculate the time in milliseconds of how long the method take to be executed.
							   // This program will calculate how log it's going to take in each game in milliseconds.
							   // Calculate the time when the number of disk are 1, 2, 3, 4 and 5.
		
			System.out.println("\tThe current time is " + t3 +" milliseconds for "+n+" disks"); // Print the time in milliseconds for n disk.
			System.out.println(); //Print a space between lines.
		} // end the for loop.
	} //end main method
} //end of the class GFG

/* NOTE: For the recursive calls the program:
			Move the top n-1 disks to the auxiliary tower.
			Move 1 disk from source rod to destination rod.
			Take the n-1 disks from auxiliary disk to the destination rod.
		 For each game with the n number of disks:
			Prind the amount of time in milliseconds.
*/

/*

Microsoft Windows [Version 10.0.19041.928]
(c) Microsoft Corporation. All rights reserved.

C:\Users\Owner>cd C:\Users\Owner\Java-projects

C:\Users\Owner\Java-projects>javac GFG.java

C:\Users\Owner\Java-projects>java GFG
Move disk 1 from rod A to rod C
        The current time is 20 milliseconds for 1 disks

Move disk 1 from rod A to rod B
Move disk 2 from rod A to rod C
Move disk 1 from rod B to rod C
        The current time is 8 milliseconds for 2 disks

Move disk 1 from rod A to rod C
Move disk 2 from rod A to rod B
Move disk 1 from rod C to rod B
Move disk 3 from rod A to rod C
Move disk 1 from rod B to rod A
Move disk 2 from rod B to rod C
Move disk 1 from rod A to rod C
        The current time is 1 milliseconds for 3 disks

Move disk 1 from rod A to rod B
Move disk 2 from rod A to rod C
Move disk 1 from rod B to rod C
Move disk 3 from rod A to rod B
Move disk 1 from rod C to rod A
Move disk 2 from rod C to rod B
Move disk 1 from rod A to rod B
Move disk 4 from rod A to rod C
Move disk 1 from rod B to rod C
Move disk 2 from rod B to rod A
Move disk 1 from rod C to rod A
Move disk 3 from rod B to rod C
Move disk 1 from rod A to rod B
Move disk 2 from rod A to rod C
Move disk 1 from rod B to rod C
        The current time is 4 milliseconds for 4 disks

Move disk 1 from rod A to rod C
Move disk 2 from rod A to rod B
Move disk 1 from rod C to rod B
Move disk 3 from rod A to rod C
Move disk 1 from rod B to rod A
Move disk 2 from rod B to rod C
Move disk 1 from rod A to rod C
Move disk 4 from rod A to rod B
Move disk 1 from rod C to rod B
Move disk 2 from rod C to rod A
Move disk 1 from rod B to rod A
Move disk 3 from rod C to rod B
Move disk 1 from rod A to rod C
Move disk 2 from rod A to rod B
Move disk 1 from rod C to rod B
Move disk 5 from rod A to rod C
Move disk 1 from rod B to rod A
Move disk 2 from rod B to rod C
Move disk 1 from rod A to rod C
Move disk 3 from rod B to rod A
Move disk 1 from rod C to rod B
Move disk 2 from rod C to rod A
Move disk 1 from rod B to rod A
Move disk 4 from rod B to rod C
Move disk 1 from rod A to rod C
Move disk 2 from rod A to rod B
Move disk 1 from rod C to rod B
Move disk 3 from rod A to rod C
Move disk 1 from rod B to rod A
Move disk 2 from rod B to rod C
Move disk 1 from rod A to rod C
        The current time is 10 milliseconds for 5 disks

C:\Users\Owner\Java-projects>dir
 Volume in drive C has no label.
 Volume Serial Number is 9242-0A43

 Directory of C:\Users\Owner\Java-projects

04/23/2021  12:02 AM    <DIR>          .
04/23/2021  12:02 AM    <DIR>          ..
04/19/2021  11:51 AM             2,511 Clock.class
04/19/2021  11:51 AM            10,867 Clock.java
02/04/2021  01:02 AM             1,279 Diamond.class
02/04/2021  01:06 AM            11,880 Diamond.java
04/19/2021  11:51 AM             2,075 driverClock.class
04/19/2021  10:35 AM             2,734 driverClock.java
04/09/2021  11:17 AM               101 examples.java
03/15/2021  12:38 AM             3,742 GameRecord.class
03/15/2021  12:44 AM            14,333 GameRecord.java
03/06/2021  12:45 AM             2,405 GameRopasc.class
04/23/2021  12:02 AM            14,391 GameRopasc.java
02/16/2021  05:49 PM             1,984 GameRps.class
02/16/2021  01:45 AM             3,735 GameRps.java
05/03/2021  08:36 AM             1,341 GFG.class              (java compile)
05/03/2021  11:17 AM             3,986 GFG.java               (java file)
01/20/2021  11:17 PM               417 Hello.class
08/16/2019  10:35 AM               119 Hello.java
01/22/2021  07:20 PM               573 HelloWorld.class
01/22/2021  07:18 PM             3,692 HelloWorld.java
03/10/2021  12:39 PM               686 MyName.class
03/10/2021  12:39 PM               483 MyName.java
04/09/2021  11:22 AM               509 new1.class
04/09/2021  11:22 AM               227 new1.java
04/12/2021  09:19 PM             1,019 PointExample1.class
04/12/2021  09:18 PM               294 PointExample1.java
02/15/2021  03:09 PM             1,032 RandomNum.class
02/15/2021  03:08 PM               779 RandomNum.java
03/15/2021  12:40 AM               418 Raul.txt
03/05/2021  02:32 PM             1,917 RecordTest.class
02/24/2021  11:55 AM             1,005 RecordTest.java
03/31/2021  09:38 PM             4,109 searchAndSort.class
03/31/2021  09:42 PM            29,263 searchAndSort.java
03/31/2021  09:39 PM             8,021 Sebas.txt
01/29/2021  11:59 PM               591 Stars.class
01/29/2021  11:59 PM               274 Stars.java
              35 File(s)        132,792 bytes
               2 Dir(s)  916,030,132,224 bytes free

C:\Users\Owner\Java-projects>

*/