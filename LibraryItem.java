package library1.dev.craig;

//Base class for all library items
abstract class LibraryItem {
 protected String id;
 protected String title;
 protected boolean isAvailable;
 
 /**
  * Constructor for LibraryItem
  * @param id Unique identifier for the item
  * @param title Title of the item
  */
 public LibraryItem(String id, String title) {
     this.id = id;
     this.title = title;
     this.isAvailable = true;
 }
 
 // Getters
 public String getId() { return id; }
 public String getTitle() { return title; }
 public boolean isAvailable() { return isAvailable; }
 
 // Abstract method to be implemented by subclasses
 public abstract String getItemType();
 
 /**
  * Checks out the item if available
  * @return true if checkout successful, false otherwise
  */
 public boolean checkout() {
     if (isAvailable) {
         isAvailable = false;
         return true;
     }
     return false;
 }
 
 /**
  * Returns the item to the library
  */
 public void returnItem() {
     isAvailable = true;
 }
 
 /**
  * String representation of the library item
  */
 @Override
 public String toString() {
     return String.format("[%s] %s - %s (%s)", 
         id, getItemType(), title, isAvailable ? "Available" : "Checked Out");
 }
}