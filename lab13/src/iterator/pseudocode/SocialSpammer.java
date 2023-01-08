package iterator.pseudocode;

public class SocialSpammer {

    public void send(ProfileIterator iterator, String message) {
        while (iterator.hasMore()) {
            Profile profile = iterator.getNext();
            sendEmail(profile.getId(), message);
        }
    }

    public void sendEmail(String email, String message) {
        System.out.println("Sent message to: '" + email + "'. Message body: '" + message + "'");
    }
}
