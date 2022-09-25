public class MessagingService {

    private ArrayList<Message> track;

    public MessagingService() {
        this.track = new ArrayList<>();
    }

    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            
        this.track.add(message);
        }
    }

    public ArrayList<Message> getMessages() {
            return this.track;
    }
}
