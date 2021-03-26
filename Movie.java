public class Movie extends Product {

    private String director;


    public String getDirector(){return director;}
    public void setDirector(String director){this.director=director;}


    @Override
    public String getDescription() {
        return super.getDescription()+ ", Directed by : "+ director;
    }
}
