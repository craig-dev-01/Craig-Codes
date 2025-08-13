package library1.dev.craig;

//DVD class extending LibraryItem
class DVD extends LibraryItem {
 private String director;
 private int durationMinutes;
 private String genre;
 
 /**
  * Constructor for DVD
  * @param id DVD ID
  * @param title DVD title
  * @param director Director name
  * @param durationMinutes Duration in minutes
  * @param genre Genre of the movie
  */
 public DVD(String id, String title, String director, int durationMinutes, String genre) {
     super(id, title);
     this.director = director;
     this.durationMinutes = durationMinutes;
     this.genre = genre;
 }
 
 // Getters
 public String getDirector() { return director; }
 public int getDurationMinutes() { return durationMinutes; }
 public String getGenre() { return genre; }
 
 @Override
 public String getItemType() {
     return "DVD";
 }
 
 @Override
 public String toString() {
     return super.toString() + String.format(" directed by %s (%d min, %s)", 
         director, durationMinutes, genre);
 }
}

