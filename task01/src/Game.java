

public class Game {
    public Game(String category, String title, String rating) {

    }
    private String title;
    
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    private String category;
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    private String rating;
    public String getRating() {
        return rating;
    }
    public void setRating(String rating) {
        this.rating = rating;
    }

 @Override
    public String toString() {
         return ("Category: "+this.getCategory()+
                     "Title: "+ this.getTitle() +
                     "Rating: "+ this.getRating());

    }
    


}