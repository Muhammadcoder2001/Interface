package Interface;

public class PointGuard  extends VoleyballPlayer{

    private int countOfGuards;

    public PointGuard(){
        this.countOfGuards = 4;

    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Count of guard is " + this.countOfGuards);

    }

    @Override
    public void getTeamName(){
        super.getTeamName();

    }

}
