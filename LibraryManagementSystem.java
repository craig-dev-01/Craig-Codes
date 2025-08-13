package library1.dev.craig;

//Main class to test the system
public class LibraryManagementSystem {
 
 /**
  * Main method to demonstrate the library management system
  */
 public static void main(String[] args) {
     // Create a library
     Library centralLibrary = new Library("Central City Library");
     
     System.out.println("=== Library Management System Demo ===\n");
     
     // Create various library items
     Book book1 = new Book("B001", "The Java Programming Language", 
         "James Gosling", 928, "978-0321349804");
     Book book2 = new Book("B002", "Clean Code", 
         "Robert C. Martin", 464, "978-0132350884");
     
     DVD dvd1 = new DVD("D001", "The Matrix", 
         "Lana Wachowski", 136, "Sci-Fi");
     DVD dvd2 = new DVD("D002", "Inception", 
         "Christopher Nolan", 148, "Thriller");
     
     Magazine mag1 = new Magazine("M001", "National Geographic", 
         "Vol. 245 No. 3", "March 2024", "National Geographic Society");
     Magazine mag2 = new Magazine("M002", "Scientific American", 
         "Vol. 330 No. 4", "April 2024", "Springer Nature");
     
     // Add items to library
     System.out.println("--- Adding Items to Library ---");
     centralLibrary.addItem(book1);
     centralLibrary.addItem(book2);
     centralLibrary.addItem(dvd1);
     centralLibrary.addItem(dvd2);
     centralLibrary.addItem(mag1);
     centralLibrary.addItem(mag2);
     
     // Display all items
     centralLibrary.displayAllItems();
     
     // Create library members
     Member member1 = new Member("MEM001", "Alice Johnson", "alice@email.com");
     Member member2 = new Member("MEM002", "Bob Smith", "bob@email.com");
     
     System.out.println("\n--- Library Members ---");
     System.out.println(member1);
     System.out.println(member2);
     
     // Test checkout functionality
     System.out.println("\n--- Testing Checkout System ---");
     centralLibrary.checkoutItem("B001"); // Should succeed
     member1.checkoutItem("B001");
     
     centralLibrary.checkoutItem("D001"); // Should succeed
     member2.checkoutItem("D001");
     
     centralLibrary.checkoutItem("B001"); // Should fail - already checked out
     centralLibrary.checkoutItem("X999"); // Should fail - item not found
     
     // Display updated inventory
     centralLibrary.displayAllItems();
     
     // Display library statistics
     centralLibrary.displayStatistics();
     
     // Test return functionality
     System.out.println("\n--- Testing Return System ---");
     centralLibrary.returnItem("B001"); // Should succeed
     member1.returnItem("B001");
     
     centralLibrary.returnItem("X999"); // Should fail - item not found
     
     // Final inventory display
     centralLibrary.displayAllItems();
     centralLibrary.displayStatistics();
     
     // Display updated member information
     System.out.println("\n--- Updated Member Information ---");
     System.out.println(member1);
     System.out.println(member2);
     
     // Demonstrate polymorphism
     System.out.println("\n--- Demonstrating Polymorphism ---");
     LibraryItem[] items = {book1, dvd1, mag1};
     for (LibraryItem item : items) {
         System.out.println("Item Type: " + item.getItemType() + 
             " | Title: " + item.getTitle() + 
             " | Available: " + item.isAvailable());
     }
     
     System.out.println("\n=== Demo Complete ===");
 }
}
