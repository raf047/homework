import java.util.ArrayList;

public class User {
    private String username;
    private String password;
    private ArrayList<Message> messages;
    private ArrayList<Announcement> announcements;
//    private ArrayList<Announcement> announcements;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        messages = new ArrayList<>();
        announcements = new ArrayList<>();
    }

    public ArrayList<Announcement> getAnnouncements() {
        return announcements;
    }

    public void setAnnouncements(ArrayList<Announcement> announcements) {
        this.announcements = announcements;
    }

    public void addNewAnnouncements(Announcement announcement){
        this.announcements.add(announcement);
    }

    public void cleanAnnouncements(){
        announcements = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }
}