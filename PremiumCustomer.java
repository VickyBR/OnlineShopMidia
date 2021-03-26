public class PremiumCustomer extends Customer{

    private double customerIsPremium= 10;


    public PremiumCustomer(String firstName, String lastName, String sex, String birhDate){
        super(firstName,lastName);
        minimuValueShoppingCart =  minimuValueShoppingCart - customerIsPremium;
    }






}
