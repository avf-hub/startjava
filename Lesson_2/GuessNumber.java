public class GuessNumber {
    private Player firstPlayer;
    private Player secondPlayer;
    private int secretNumber;

    public GuessNumber(Player firstPlayer, Player secondPlayer, int secretNumber) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
        this.secretNumber = secretNumber;
    }

    public char playFirstPlayer() {
        if(firstPlayer.getNumber() > secretNumber) {
            return '>';
        } else if(firstPlayer.getNumber() < secretNumber) {
            return '<';
        } else {
            return '=';
        }
    }

    public char playSecondPlayer() {
        if(secondPlayer.getNumber() > secretNumber) {
            return '>';
        } else if(secondPlayer.getNumber() < secretNumber) {
            return '<';
        } else {
            return '=';
        }
    }
}