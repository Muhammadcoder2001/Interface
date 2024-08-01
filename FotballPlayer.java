package Interface;

public class FotballPlayer extends  Player{

    private int countOfRedCards ;
    private int countOfYellowCards;
    private int countOfGoals;

    public FotballPlayer(){
        this.countOfGoals = 7;
        this.countOfRedCards = 1;
        this.countOfYellowCards = 3;
        super.name ="Jamshid";
        super.teamName = "Rearsenal";
        super.numberPosition = 6;
        super.typeOfSport = "Football";

    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Count of Redcards are " + this.countOfRedCards + "\n"
        + "Count of YellowCards are " + this.countOfYellowCards + "\n"
        + "Count of goals are " + this.countOfGoals);

    }

    @Override
    public void getTeamName(){
        System.out.println(super.teamName);
    }


}
