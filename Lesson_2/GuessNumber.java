public class GuessNumber {
    private Player player;

    public GuessNumber(Player player) {
        this.player = player;
    }

    public char play(int secretNumber) {
        if(player.getNumber() > secretNumber) {
            return '>';
        } else if(player.getNumber() < secretNumber) {
            return '<';
        } else {
            return '=';
        }
    }
}