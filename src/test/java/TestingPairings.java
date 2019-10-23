import org.junit.Test;
import secret.app.Pairings;
import secret.app.Participant;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

public class TestingPairings {

    @Test
    public void participantIsAssignedASender() {
        Participant participant = new Participant("Dominika", "do_ma1991@hotmail.com");
        Pairings pairing = new Pairings();
        pairing.assignSender(participant);
        assertEquals("Gareth", participant.getSender());
    }

    @Test
    public void participantIsAssignedARandomRecipient() {
        Participant participant = new Participant("Dominika", "do_ma1991@hotmail.com");
        Pairings pairing = new Pairings();
        pairing.assignRecipient(participant);
        System.out.println(participant.getRecipient());
        assertThat(participant.getRecipient(), is(notNullValue()));
    }

    @Test
    public void participantIsNotAssignedHerself() {
        Participant participant = new Participant("Dominika", "do_ma1991@hotmail.com");
        Pairings pairing = new Pairings();
        pairing.assignRecipient(participant);
        System.out.println(participant.getRecipient());
        assertThat(participant.getRecipient(), is(not(participant.getName())));
    }

    @Test
    public void participantsAreAssignedAUniqueRecipient() {
        Participant participant = new Participant("Dominika", "do_ma1991@hotmail.com");
        Participant participantTwo = new Participant("Gareth", "gaz_field@hotmail.com");
        Pairings pairing = new Pairings();
        pairing.assignRecipient(participant);
        pairing.assignRecipient(participantTwo);
        System.out.println(participant.getRecipient());
        System.out.println(participantTwo.getRecipient());
        assertThat(participant.getRecipient(), is(not(participantTwo.getRecipient())));
    }

}
