public class Game extends Product {
    private int ageRate;
    
    


    public int getAgeRate(){
        return ageRate;
    }
    public void setAgeRate(int ageRate){
        this.ageRate=ageRate;
    }

   
    @Override
    public String getDescription() {
        return super.getDescription()+ ",Age rate recommend : "+ ageRate;
    }
}
