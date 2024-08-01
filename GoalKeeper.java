package Interface;

public class GoalKeeper  extends FotballPlayer{

    private int countOfSaves;

    public GoalKeeper(){
//        super.numberPosition = 4;
//        super.typeOfSport = "Darvozabon";
//        super.teamName ="Real Madrid";
//        super.name ="Abubakr";
        this.countOfSaves = 9;

    }


    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Count of Saves are " + this.countOfSaves);

    }

    @Override
    public void getTeamName(){
        super.getTeamName();
    }

}
