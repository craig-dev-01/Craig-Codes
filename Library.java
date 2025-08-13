package library1.dev.craig;

//Library class to manage all items
class Library {
 private java.util.List<LibraryItem> items;
 private String libraryName;
 
 /**
  * Constructor for Library
  * @param libraryName Name of the library
  */
 public Library(String libraryName) {
     this.libraryName = libraryName;
     this.items = new java.util.ArrayList<>();
 }
 
 /**
  * Adds an item to the library
  * @param item LibraryItem to add
  */
 public void addItem(LibraryItem item) {
     items.add(item);
     System.out.println("Added: " + item.getTitle() + " to " + libraryName);
 }
 
 /**
  * Finds an item by ID
  * @param id Item ID to search for
  * @return LibraryItem if found, null otherwise
  */
 public LibraryItem findItemById(String id) {
     for (LibraryItem item : items) {
         if (item.getId().equals(id)) {
             return item;
         }
     }
     return null;
 }
 
 /**
  * Checks out an item by ID
  * @param id Item ID to checkout
  * @return true if successful, false otherwise
  */
 public boolean checkoutItem(String id) {
     LibraryItem item = findItemById(id);
     if (item != null && item.checkout()) {
         System.out.println("Checked out: " + item.getTitle());
         return true;
     } else if (item != null) {
         System.out.println("Item not available: " + item.getTitle());
     } else {
         System.out.println("Item not found with ID: " + id);
     }
     return false;
 }
 
 /**
  * Returns an item by ID
  * @param id Item ID to return
  * @return true if successful, false otherwise
  */
 public boolean returnItem(String id) {
     LibraryItem item = findItemById(id);
     if (item != null) {
         item.returnItem();
         System.out.println("Returned: " + item.getTitle());
         return true;
     } else {
         System.out.println("Item not found with ID: " + id);
         return false;
     }
 }
 
 /**
  * Displays all items in the library
  */
 public void displayAllItems() {
     System.out.println("\n=== " + libraryName + " Inventory ===");
     if (items.isEmpty()) {
         System.out.println("No items in the library.");
     } else {
         for (LibraryItem item : items) {
             System.out.println(item.toString());
         }
     }
     System.out.println("Total items: " + items.size());
 }
 
 /**
  * Gets the count of available items
  * @return Number of available items
  */
 public int getAvailableItemsCount() {
     int count = 0;
     for (LibraryItem item : items) {
         if (item.isAvailable()) {
             count++;
         }
     }
     return count;
 }
 
 /**
  * Displays library statistics
  */
 public void displayStatistics() {
     int totalItems = items.size();
     int availableItems = getAvailableItemsCount();
     int checkedOutItems = totalItems - availableItems;
     
     System.out.println("\n=== " + libraryName + " Statistics ===");
     System.out.println("Total items: " + totalItems);
     System.out.println("Available items: " + availableItems);
     System.out.println("Checked out items: " + checkedOutItems);
 }
}
