import org.junit.Test;
import secret.app.Pairings;
import secret.app.Participant;

import static org.junit.Assert.*;

public class TestingParticipants {

    @Test
    public void checkThatParticipantHasName() {
        Participant participant = new Participant("Dominika", "do_ma1991@hotmail.com");
        assertEquals( "Dominika", participant.getName());
    }

    @Test
    public void checkThatParticipantHasEmail() {
        Participant participant = new Participant("Dominika", "do_ma1991@hotmail.com");
        assertEquals( "do_ma1991@hotmail.com", participant.getEmail());
    }

    @Test
    public void participantIsAssignedARecipient() {
        Participant participant = new Participant("Dominika", "do_ma1991@hotmail.com");
        Pairings pairing = new Pairings();
        pairing.assignRecipient(participant);
        assertEquals("Gareth", participant.getRecipient());
    }

    @Test
    public void participantIsAssignedASender() {
        Participant participant = new Participant("Dominika", "do_ma1991@hotmail.com");
        Pairings pairing = new Pairings();
        pairing.assignSender(participant);
        assertEquals("Gareth", participant.getSender());
    }


}
