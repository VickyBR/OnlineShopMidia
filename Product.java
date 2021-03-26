public abstract class Product {


    private String manufacturer;
    private String title;
    private String productNumber;




    public String getManufacturer(){return manufacturer;}
    public void setManufacturer(String manufacturer){this.manufacturer=manufacturer;}

    public String getTitle(){return title;}
    public void setTitle(String title){this.title=title;}

    public String  getProductNumber(){return productNumber;}
    public void setProductNumber(String productNumber){this.productNumber=productNumber;}

    public String getDescription(){
        return " Manufacturer : "+ manufacturer + ", Title  : "+ title
+ ", Product number  : "+ productNumber; }













}
