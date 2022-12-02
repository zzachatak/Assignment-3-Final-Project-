//Zach Johnston
// CS 145
//This is the main file for the exitProgram
//It create a menu systems and allows the other files to help us run the exitProgram
// We basically input the user to see what they want to do. They can add or delete user
// Load the file which should read out the FileNotFoundException
//Search for a user by the name
// Save the text File
// Or exit the exit exit the Program
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Dictionary {
//User to import the other files
static BST total;
static Scanner scan = new Scanner(System.in);
static User[] users = new User[8];

//Tests some of the functions
public static void main(String[] args) {
total = new myBST();
menu();
}
//Method used for the menu system
private static void menu() {
while (true) {
System.out.println("1. Load file");
System.out.println("2. Add user");
System.out.println("3. Delete user");
System.out.println("4. Search by name");
System.out.println("5. Save file");
System.out.println("6. Exit");
System.out.print("Enter your pick: ");
String UserChoice = scan.next();
switch(UserChoice){
case "1": load(); break;
case "2":
System.out.println("Enter details to add");
add();
break;
case "3":
System.out.println("Enter details to delete");
fire();
break;
case "4":
System.out.println("Enter details to serach");
search();
break;
case "5":
save();
break;
case "6":
exit();
break;
default:
System.out.println("Invlid entry");
break;
}
if(choice.equals("6"))
break;
}
}

//Method used to load the user
static void load() {
try {
File ListFile = new File("User.txt");
Scanner Userscan = new Scanner(ListFile);
while (Userscan.hasNextLine()) {
String row = Userscan.nextLine();
String[] edata = row.split(" ");
User u = new User(eData[0], eData[1], eData[2]);
total.insert(u);
}
Userscan.close();
} catch (FileNotFoundException e) {
System.out.println("Error!");
}
}

// method to add Users
static void add() {
System.out.print("Enter firstName: ");
String n = scan.next();
System.out.print("Enter lastName: ");
String l = scan.next();
System.out.print("Enter id number: ");
String id = scan.next();
User u = new User(f, l, id);
total.insert(u);
}

// method to remove Users
static void fire() {
System.out.print("Enter firstName: ");
String f = scan.next();
System.out.print("Enter lastName: ");
String l = scan.next();
System.out.print("Enter id number: ");
String id = scan.next();
User u = new User(f, l, id);
total.delete(u);
}

// method to search 
private static void search() {
System.out.print("Enter firstName: ");
String f = scan.next();
System.out.print("Enter lastName: ");
String l = in.next();
User u = new User(f, l, "0");
u = total.search(u);
if(u!=null)
System.out.println("User found: "+u);
else
System.out.println("User not found");
}

// method to save within an array
private static void save() {
Users = total.get();
}
//exits
private static void exit() {
System.out.println("Users: ");
for(int i=0; i<Users.length; i++){
if(employees[i]!=null)
System.out.println(Users[i]);
}
}

}