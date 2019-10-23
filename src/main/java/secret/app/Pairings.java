package secret.app;

public class Pairings {

    public static void main(String[] args) {
    }

    public void assignRecipient(Participant participant) {
        //save all participants onto two lists
        //loop through list 1 to allocate receipeints to each participant
        //loop through list 2 to find receipients
        //once a receipent is picked, remove it from list 2 - unless it matches the participant - then try again
        participant.setRecipient("Gareth");
    }

    public void assignSender(Participant participant) {
        participant.setSender("Gareth");
    }
}
