package secret.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pairings {

    public static void main(String[] args) {
    }

    public void assignRecipient(Participant participant) {
        String[] names = {"Gareth", "Dominika", "Bozena", "Marcin", "Artur", "Racheal", "Karolina", "Kamil", "Sarah"};
            int index = (int) (Math.random() * (8 - 0) + 1) - 1;
            String recipientName = names[index];
            participant.setRecipient(names[index]);

            while (participant.getName() == recipientName) {

                    int indexTwo = (int) (Math.random() * (8 - 0) + 1) - 1;
                    recipientName = names[indexTwo];
            }
            participant.setRecipient(recipientName);
        }


    public void assignSender(Participant participant) {
        participant.setSender("Gareth");
    }
}
