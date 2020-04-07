import java.util.ArrayList;

public class AnnouncementRepository {
    private ArrayList<Announcement> announcements;

    public AnnouncementRepository() {
        this.announcements = new ArrayList<>();
    }

    public void save(Announcement announcement) {
        announcements.add(announcement);
    }

    public ArrayList<Announcement> getAll() {
        return announcements;
    }
}
