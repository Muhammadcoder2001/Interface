package Interface;

public class Player implements Interface{

    public String name;
    public  String typeOfSport;
    public  int numberPosition;
    public String teamName;

    public Player(){

    }

    @Override
    public void getInfo(){
        System.out.println("Name is " + this.name + "\n"
        + "Type of Sport " + this.typeOfSport + "\n"
        + "Number of Position " + this.numberPosition + "\n"
        + "Team Name is " + this.teamName);

    }

    @Override
    public void getTeamName(){
        System.out.println("Team name is " + this.teamName);

    }

}
