import java.util.ArrayList;

public class Announcement {
//    private int number;
    private String name;
    private String info;
//    private ArrayList<Announcement> announcements;

    public Announcement(String name, String info) {
            this.name = name;
            this.info = info;
//            announcements = new ArrayList<>();
    }

//    public int getNumber() {
//        return number;
//    }
//
//    public void setNumber(int number) {
//        this.number = number;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

//    public ArrayList<Announcement> getAnnouncements() {
//        return announcements;
//    }
//
//    public void setAnnouncements(ArrayList<Announcement> announcements) {
//        this.announcements = announcements;
//    }
}
