package Interface;

public class BasketballPlayer extends Player{

    private int numberOfGoals;

    public BasketballPlayer(){
        this.numberOfGoals = 4;
        super.teamName = "Bunyodkor";
        super.name = "Abduholiq";
        super.numberPosition = 1;
        super.typeOfSport = "Basketboll";

    }

    @Override
    public void getTeamName() {
        super.getTeamName();
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Number of Goals is " + this.numberOfGoals);

    }


}
