public class ShoppingCart extends Customer {

    private float quantityProduts;
    private float productSum;
    private boolean isCostumerPremium;
    private boolean couponsHonored;



    public float getProductSum(){ 
        return productSum;
    }
    public void setProductSum(float productSum){
        this.productSum=productSum;
    }
    
    

    public boolean getisCostumerPremium(){
        return isCostumerPremium;
    }
    public void setCostumerPremium( boolean isCostumerPremium){
        this.isCostumerPremium=isCostumerPremium;
    }
    
    
 public float calculateSum( Customer customer){
        float result = productSum;
          if (customer.isPremiumCustomer()==true){
            if (quantityProduts>3){
                result = productSum*0.88f; }
               else{
    result= productSum*0.9f; 
            } 
        }
               else { 
    result = productSum*1f;
}
return result;
    }




      public double calculatePricePerProduct() throws ArithmeticException{
        double result ;
        try {
            result = productSum/quantityProduts;
        }
        catch (ArithmeticException ex ){ 
            throw  new ArithmeticException( " Shopping cart is empty");
        }
        return result;
      }


























}
