import java.util.ArrayList;

public class AnnouncementScreen extends Screen {
    @Override
    public void process(){
        while (true) {
            if (loggedInUser.getUsername().equals("admin")) {

                System.out.println("Create Announcement");
                System.out.println("input name ");
                String name = getStringFromUser();
                System.out.println("input information ");
                String info = getStringFromUser();

                Announcement newAnnouncement = new Announcement(name, info);
                announcementRepository.save(newAnnouncement);

                for (User user : userRepository.getAll()) {
                    if (!user.getUsername().equals("admin"))
                        user.addNewAnnouncements(newAnnouncement);
                }
                System.out.println("1. Create another");
                System.out.println("2. Home");
                int i = getIntegerFromUser();
                if (i == 2) {
                    UserHomeScreen userHomeScreen = new UserHomeScreen();
                    userHomeScreen.process();
                } else if (i != 1) {
                    System.out.println("Wrong input");
                }
            }else {
                System.out.println("All announcement");
                ArrayList<Announcement> announcements = announcementRepository.getAll();
                if (announcements.isEmpty()){
                    System.out.println("You have not announcements");
                }else {
                    for (Announcement announcement : announcements) {
                        System.out.println(announcement.getName() + " : " + announcement.getInfo());
                    }
                }
                UserHomeScreen userHomeScreen = new UserHomeScreen();
                userHomeScreen.process();

            }
        }
    }

}
