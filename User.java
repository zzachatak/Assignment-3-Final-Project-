//Zach Johnston
//CS 145
// This file is used to help import the data as a String
// We are able to take in the information of the Name Lastname or Number for ID.
// Then we set or get the infromation

public class User implements Comparable<User>{

private String name, lastname, num;
//Create a user list
public User(String name, String lastname, String num) {
this.name = name;
this.lastname = lastname;
this.num = num;
}
//Takes the ID Number
public String getIDNumber() {
return num;
}
//Takes the firstname
public String getFirstname() {
return name;
}
//Takes the last name
public String getLastname() {
return lastname;
}


//Sets the firstname
public void setFirstname(String name) {
this.name = name;
}
//Sets the lastname
public void setLastname(String lastname) {
this.lastname = lastname;
}
//Sets the ID number
public void setIDNumber(String num) {
this.num = num;
}

public boolean equals(User user){
return this.num.equals(user.num);
}
//Compares user input
@Override
public int compareTo(User user) {
int a = this.lastname.compareTo(user.lastname);
if(a!=0) return a;
a = this.name.compareTo(user.name);
if(a!=0) return a;
return (this.num.compareTo(user.num));
}
//Converts to a string
@Override
public String toString() {
return name + " " + lastname + " " + num;
}

}