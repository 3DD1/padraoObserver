import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    @Test
    void deveNotificarUmJogador() {
        Party party = new Party("Hardcore Paris", 45);
        Player player = new Player("_Krakanov_");
        player.joinParty(party);
        party.sendInviteParty();
        assertEquals("_Krakanov_, your friend join the party{ Name Party = Hardcore Paris, quantidy players = 45}", player.getFriend());
    }

    @Test
    void deveNotificarJogadores() {
        Party party = new Party("Hardcore Paris", 45);
        Player player1 = new Player("_Krakanov_");
        Player player2 = new Player("b0Bx112");
        player1.joinParty(party);
        player2.joinParty(party);
        party.sendInviteParty();
        assertEquals("_Krakanov_, your friend join the party{ Name Party = Hardcore Paris, quantidy players = 45}", player1.getFriend());
        assertEquals("b0Bx112, your friend join the party{ Name Party = Hardcore Paris, quantidy players = 45}", player2.getFriend());
    }

    @Test
    void naoDeveNotificarAluno() {
        Party party = new Party("Hardcore Paris", 45);
        Player player1 = new Player("_Krakanov_");
        party.sendInviteParty();
        assertEquals(null, player1.getFriend());
    }

    @Test
    void deveNotificarAlunoTurmaA() {
        Party party = new Party("Hardcore Paris", 45);
        Party party2 = new Party("Maps 007", 9);
        Player player1 = new Player("_Krakanov_");
        Player player2 = new Player("b0Bx112");
        player1.joinParty(party);
        player2.joinParty(party2);
        party.sendInviteParty();
        assertEquals("_Krakanov_, your friend join the party{ Name Party = Hardcore Paris, quantidy players = 45}", player1.getFriend());
        assertEquals(null, player2.getFriend());
    }


}