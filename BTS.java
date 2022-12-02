//Zach Johnston
//CS 145
// Used to help create nodes for the information we add for User
// We are able to use this information in order to plug it into the other NoSuchFieldError
// Checks if we are searching/removing or inserting users
import java.util.ArrayList;
class BST {


class Node {

User user;
Node one, two;

public Node(User u) {
user = u;
one = two = null;
}
}

// Center for BST
Node center;

// Constructor
myBST() {
center = null;
}

// This method to insert user
void insert(User u) {
center = insert(center, u);
System.out.println(u+ " information was added");
}

// A method to insert a new user
Node insert(Node center, User u) {
//Returns a new node if empty
if (center == null) {
center = new Node(u);
return center;
}

//Move down
if (u.compareTo(center.user) < 0) {
center.one = insert(center.one, e);
} else if (u.compareTo(center.user) > 0) {
center.two = insert(center.two, u);
}
//Returns the node pointer
return center;
}

//Used to delete user
void delete(User u)
{
center = delete(center, e);
System.out.println(e+ " was deleted from the company");
}

//Used to delete a user
Node delete(Node center, Employee u)
{
//If the tree is empty
if (center == null) return center;

//Move down
if (u.compareTo(center.user) < 0)
center.one = delete(center.one, u);
else if (u.compareTo(center.user) > 0)
center.two = delete(center.two, u);

//Otherwise delete.
else
{
//Only has on child on node
if (center.one == null)
return center.one;
else if (center.two == null)
return center.two;


center.user = min(center.two);

// Delete the inorder successor
center.two = delete(center.two, center.u);
}

return center;
}

User min(Node center)
{
User minval = center.user;
while (center.one != null)
{
minval = center.one.user;
center = center.one;
}
return minval;
}

User search(User u) {
Node node = search(center, u);
if(node!=null)
return node.user;
return null;
}

// method to search for user
Node search(Node center, User u)
{
// If the total is empty
if (center == null)
return center;

if(center.user.getLastname().equals(u.getLastname())){
if(center.user.getFirstname().equals(u.getFirstname()))
return center;
}
else if (u.compareTo(center.user) < 0)
return search(center.one, u);
else if (u.compareTo(center.user) > 0)
return search(center.two, u);
return null;
}

// method to get user array from total
User[] get() {
User[] users = new User[8];
ArrayList<User> user = new ArrayList<>();
get(center,user);
for(int i=0; i<8; i++){
if(user.size()>i)
users[i]=user.get(i);
else
users[i]=null;
}

return users;
}

//Method for getting ArrayList and
void get(Node center, ArrayList<User> user) {
if (center != null) {
getEmployees(center.one, user);
user.add(center.user);
getEmployees(center.two, user);
}
}
}