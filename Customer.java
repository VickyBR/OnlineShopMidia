public class Customer {

    // ATTRIBUTES

    private String lastName;
    private String firstName;
    private String sex;
    private String birhtDate;
    private boolean isCustomerPremium=false;
    protected double minimuValueShoppingCart;
    private ShoppingCart shoppingCart;


    // METHODS

    public Customer(){
        shoppingCart= new ShoppingCart();
        minimuValueShoppingCart=10; 
    }


        public Customer(String firstName, String lastName, String sex, String birhtDate){
        this.firstName=firstName;
        this.lastName=lastName;
        this.sex=sex;
        this.birhtDate=birhtDate;
        }


        public Customer ( String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        }



    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    
    public String getSex(){
        return sex;
    }
    public void setSex(String sex){
        this.sex=sex;
    }

    public String getBirhtDate(){
        return birhtDate;
    }
    public void setBirhtDate(String birhtDate){
        this.birhtDate=birhtDate;
    }

    public String getClientDescription(){
        return " First name : "+ firstName+ " , Last name : "+ lastName
    +", Birthdate : "+ birhtDate + ", Sex : "+ sex;
    }

    public boolean getisCustomerPremium(){
        return isCustomerPremium;
    }
    public void setisCustomerPremium(boolean isCustomerPremium){
        this.isCustomerPremium=isCustomerPremium;
    }

    public boolean isPremiumCustomer(){
        boolean result = isCustomerPremium;

        if (isCustomerPremium==true){
            System.out.println(" The client is a Premium Customer"); 
        }
 else {
            System.out.println(" The client is not a Premium Customer");
        }
return result; }











}
