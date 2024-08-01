package Interface;

public class VoleyballPlayer extends  Player{

    private int numberOfPoints ;

    public VoleyballPlayer(){
        this.numberOfPoints = 4;
        super.name = "MuhammadUmar";
        super.teamName ="Argentina";
        super.numberPosition = 9;
        super.typeOfSport ="Voleyball";

    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Number of Points is " + this.numberOfPoints);

    }

    @Override
    public void getTeamName() {
        super.getTeamName();
    }

}
