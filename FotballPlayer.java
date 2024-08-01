package Interface;

public class FotballPlayer extends  Player{

    public int countOfRedCards ;
    public int countOfYellowCards;
    public int countOfGoals;

    public FotballPlayer(){
        this.countOfGoals = 7;
        this.countOfRedCards = 1;
        this.countOfYellowCards = 3;

    }

    @Override
    public void getInfo(){
        this.getInfo();

    }

    @Override
    public void getTeamName(){
        System.out.println(this.teamName);
    }


}
