public class MusicProduct extends Product{
    private String singer;


    public String getSinger(){
        return singer;
    }
    public void setSinger(String singer) {
        this.singer=singer;
    }


    @Override
    public String getDescription() {
        return super.getDescription() + ",Singer  : "+ singer;
    }
}
