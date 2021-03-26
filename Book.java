public class Book extends Product{
    private String author;



    public String getAuthor(){return author;}
    public void setAuthor(String author){this.author=author;}

    @Override
    public String getDescription() {
        return super.getDescription()+ ",Written by  : "+ author;
    }
}
