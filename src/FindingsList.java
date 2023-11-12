import java.util.*;

public class FindingsList {
    Scanner input;

    public FindingsList() throws InterruptedException {
        input = new Scanner(System.in);
    }

    public void startFindingsList() throws InterruptedException {
        Thread.sleep(500);

        System.out.println("Welcome back from your expedition. Time to catalog everything you found.");

        ArrayList<String> rockList = new ArrayList<String>();

        rockList.add("rock");
        rockList.add("weird rock");
        rockList.add("smooth rock");
        rockList.add("not rock");

        System.out.println("Rock data downloaded.");
        System.out.println(rockList);

        System.out.println("Wait a second that last on is not a rock we need to delete that one from the list");

        rockList.remove("not rock");

        System.out.println(rockList);
        System.out.println("Perfect");

        Thread.sleep(1000);

        HashMap<String, String> fossilDirectory = new HashMap<>();

        fossilDirectory.put("BIRD", "The fossil has wings implying it was capable of flight");
        fossilDirectory.put("FISH", "The fossil is vaguely fish shaped implies there was once water");
        fossilDirectory.put("TOOTH", "The tooth from an unknown fossil");

        System.out.println("Fossil data downloaded");
        System.out.println("Which of the fossils would you like to learn more about (Bird, fish, or tooth)?");

        String fossilChoice = input.nextLine().toUpperCase();

        System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));

        Thread.sleep(700);

        HashSet<String> supplies = new HashSet<>();

        supplies.add("Teleporter");
        supplies.add("Stun gun");
        supplies.add("Insta-Heal Capsules");

        System.out.println("Supplies Before Expedition:");
        System.out.println(supplies);

        supplies.remove("Stun gun");

        System.out.println("Supplies After Expedition:");
        System.out.println(supplies);

        Iterator itr = supplies.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
