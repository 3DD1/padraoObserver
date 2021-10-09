import java.util.Observable;
import java.util.Observer;

public class Player implements Observer {
    private String gamerTag;
    private String friend;

    public Player(String gamerTag){
        this.gamerTag = gamerTag;
    }

    public String getFriend(){
        return this.friend;
    }
    public void joinParty(Party party){
        party.addObserver(this);

    }
    public void update(Observable party, Object arg1){
        this.friend = this.gamerTag + ", your friend join the " + party.toString();
    }
}
