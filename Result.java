package Interface;

public class Result {
    public static void main(String[] args) {
        FotballPlayer player = new GoalKeeper();
        VoleyballPlayer player1 = new PointGuard();
        BasketballPlayer player2 = new Setter();

        player.getInfo();

        System.out.println();
        player.getTeamName();
        System.out.println();

        player1.getInfo();

        System.out.println();
        player1.getTeamName();
        System.out.println();

        player2.getInfo();

        System.out.println();
        player2.getTeamName();
    }
}
