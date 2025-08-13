package library1.dev.craig;

//Member class to represent library members
class Member {
 private String memberId;
 private String name;
 private String email;
 private java.util.List<String> checkedOutItems;
 
 /**
  * Constructor for Member
  * @param memberId Unique member ID
  * @param name Member's name
  * @param email Member's email
  */
 public Member(String memberId, String name, String email) {
     this.memberId = memberId;
     this.name = name;
     this.email = email;
     this.checkedOutItems = new java.util.ArrayList<>();
 }
 
 // Getters
 public String getMemberId() { return memberId; }
 public String getName() { return name; }
 public String getEmail() { return email; }
 public java.util.List<String> getCheckedOutItems() { return checkedOutItems; }
 
 /**
  * Adds an item to member's checked out list
  * @param itemId Item ID that was checked out
  */
 public void checkoutItem(String itemId) {
     checkedOutItems.add(itemId);
 }
 
 /**
  * Removes an item from member's checked out list
  * @param itemId Item ID that was returned
  */
 public void returnItem(String itemId) {
     checkedOutItems.remove(itemId);
 }
 
 @Override
 public String toString() {
     return String.format("Member[%s]: %s (%s) - %d items checked out", 
         memberId, name, email, checkedOutItems.size());
 }
}