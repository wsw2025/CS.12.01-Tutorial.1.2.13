public class Square {
    private boolean isBlack;
    private int num;
    public Square(boolean isBlack, int num)
    {
        this.isBlack = isBlack;
        this.num = num;
        // To be implemented.

    }

    public void setNum(int num){
        this.num = num;
    }

    public boolean isBlack(){
        return isBlack;
    }

    public int getNum(){
        return this.num;
    }
}
