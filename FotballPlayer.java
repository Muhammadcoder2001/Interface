package Interface;

public class FotballPlayer extends  Player{

    private int countOfRedCards ;
    private int countOfYellowCards;
    private int countOfGoals;

    public FotballPlayer(){
        this.countOfGoals = 7;
        this.countOfRedCards = 1;
        this.countOfYellowCards = 3;

    }

    @Override
    public void getInfo(){
        super.getInfo();

    }

    @Override
    public void getTeamName(){
        System.out.println(super.teamName);
    }


}
