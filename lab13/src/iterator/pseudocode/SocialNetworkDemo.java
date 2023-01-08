package iterator.pseudocode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SocialNetworkDemo {
    private static Scanner scanner = new Scanner(System.in);
    private static SocialNetwork network;
    private static SocialSpammer spammer;

    public static void main(String[] args) {
        config();
        sendSpamToFriends("anna.smith@bing.com");
        sendSpamToCoworkers("anna.smith@bing.com");
    }

    public static List<Profile> createTestProfiles() {
        List<Profile> data = new ArrayList<>();
        data.add(new Profile("anna.smith@bing.com", "anna.smith@bing.com", "friends:mad_max@ya.com", "friends:catwoman@yahoo.com", "coworkers:sam@amazon.com"));
        data.add(new Profile("mad_max@ya.com", "mad_max@ya.com", "friends:anna.smith@bing.com", "coworkers:sam@amazon.com"));
        data.add(new Profile("bill@microsoft.eu", "bill@microsoft.eu", "coworkers:avanger@ukr.net"));
        data.add(new Profile("avanger@ukr.net", "avanger@ukr.net", "coworkers:bill@microsoft.eu"));
        data.add(new Profile("sam@amazon.com", "sam@amazon.com", "coworkers:anna.smith@bing.com", "coworkers:mad_max@ya.com", "friends:catwoman@yahoo.com"));
        data.add(new Profile("catwoman@yahoo.com", "catwoman@yahoo.com", "friends:anna.smith@bing.com", "friends:sam@amazon.com"));
        return data;
    }

    public static void config() {
        System.out.println("Please specify social network to target spam tool (default:Facebook):");
        System.out.println("1. Facebook");
        System.out.println("2. LinkedIn");
        String choice = scanner.nextLine();
        if (choice.equals("2")) {
            network = new LinkedIn(createTestProfiles());
        } else {
            network = new Facebook(createTestProfiles());
        }
        spammer = new SocialSpammer();
    }

    public static void sendSpamToFriends(String profileId) {
        System.out.println("\nIterating over friends...\n");
        ProfileIterator iterator = network.createFriendsIterator(profileId);
        spammer.send(iterator, "Very important message");
    }

    public static void sendSpamToCoworkers(String profileId) {
        System.out.println("\nIterating over coworkers...\n");
        ProfileIterator iterator = network.createCoworkersIterator(profileId);
        spammer.send(iterator, "Very important message");
    }
}
