import java.util.ArrayList;

public class UserHomeScreen extends Screen {
    @Override
    public void process() {
        while (true) {
            ArrayList<Announcement> announcements = loggedInUser.getAnnouncements();
            if (!announcements.isEmpty()){
                System.out.println("You have new announcement");
                for (Announcement announcement : announcements) {
                    System.out.println(announcement.getName() + " : " + announcement.getInfo());
                }
                loggedInUser.cleanAnnouncements();
            }
            System.out.println("1. Messages");
            System.out.println("2. Log Out");
            System.out.println("3. Announcements ");
            int i = getIntegerFromUser();
            if (i == 1) {
                UserMessagesScreen userMessagesScreen = new UserMessagesScreen();
                userMessagesScreen.process();
                break;
            } else if (i == 2) {
                System.out.println("Logged out");
                loggedInUser = null;
                StartScreen startScreen = new StartScreen();
                startScreen.process();
                break;
            } else if (i == 3) {
                AnnouncementScreen AnnouncementScreen = new AnnouncementScreen();
                AnnouncementScreen.process();
                break;
            } else {
                System.out.println("Wrong input");
            }
        }
    }
}