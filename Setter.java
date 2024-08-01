package Interface;

public class Setter extends BasketballPlayer {

    private int countOfSet;

    public Setter(){
        this.countOfSet = 7;


    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Count of set " + this.countOfSet);

    }

    @Override
    public void getTeamName(){
        super.getTeamName();

    }
}
