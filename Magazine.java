package library1.dev.craig;

//Magazine class extending LibraryItem
class Magazine extends LibraryItem {
 private String issueNumber;
 private String publishDate;
 private String publisher;
 
 /**
  * Constructor for Magazine
  * @param id Magazine ID
  * @param title Magazine title
  * @param issueNumber Issue number
  * @param publishDate Publication date
  * @param publisher Publisher name
  */
 public Magazine(String id, String title, String issueNumber, String publishDate, String publisher) {
     super(id, title);
     this.issueNumber = issueNumber;
     this.publishDate = publishDate;
     this.publisher = publisher;
 }
 
 // Getters
 public String getIssueNumber() { return issueNumber; }
 public String getPublishDate() { return publishDate; }
 public String getPublisher() { return publisher; }
 
 @Override
 public String getItemType() {
     return "Magazine";
 }
 
 @Override
 public String toString() {
     return super.toString() + String.format(" Issue %s (%s) by %s", 
         issueNumber, publishDate, publisher);
 }
}
