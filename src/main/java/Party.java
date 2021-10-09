import java.util.Observable;

public class Party extends Observable {
    private String nameParty;
    private int  quantityPlayersInParty;

    public Party(String nameParty, int quantityPlayersInParty) {
        this.nameParty = nameParty;
        this.quantityPlayersInParty = quantityPlayersInParty;
    }

    public void sendInviteParty(){
        setChanged();
        notifyObservers();
    }
    @Override
    public String toString(){
        return "Party{" +
                " Name Party = "+ nameParty+
                ", quantidy players = " + quantityPlayersInParty+
                '}';
    }
}
