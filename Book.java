package library1.dev.craig;

//Book class extending LibraryItem
class Book extends LibraryItem {
 private String author;
 private int pages;
 private String isbn;
 
 /**
  * Constructor for Book
  * @param id Book ID
  * @param title Book title
  * @param author Author name
  * @param pages Number of pages
  * @param isbn ISBN number
  */
 public Book(String id, String title, String author, int pages, String isbn) {
     super(id, title);
     this.author = author;
     this.pages = pages;
     this.isbn = isbn;
 }
 
 // Getters
 public String getAuthor() { return author; }
 public int getPages() { return pages; }
 public String getIsbn() { return isbn; }
 
 @Override
 public String getItemType() {
     return "Book";
 }
 
 @Override
 public String toString() {
     return super.toString() + String.format(" by %s (%d pages)", author, pages);
 }
}

