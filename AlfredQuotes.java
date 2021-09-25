// Holds all of the quotes/functionality
import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        String sf1=String.format("Hello, %s, lovely to see you", name);
        return sf1;
    }

    public String guestGreeting(String name, String timeOfDay) {
        String sf1=String.format("Good %s, %s, lovely to see you.", timeOfDay, name);
        return sf1;
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        String sf2=String.format("It is currently %s", date);
        return sf2;
    }
    public String dateAnnouncement(boolean yelling) {
        if (yelling) {
            Date date = new Date();
            String sf2=String.format("It is currently %s", date).toUpperCase();
            return sf2;
        } else {
            return dateAnnouncement();
        }
    }
    
    public String respondBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis") >= 0) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        } else if (conversation.indexOf("Alfred") >= 0) {
            return "As you wish.";
        } else {
            return "Right.  And with that, I shall retire.";
        }
    }
    
    // NINJA BONUS
    // See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

