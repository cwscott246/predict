package pojos.betonline;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by charlie on 8/15/17.
 */
@XmlRootElement(name = "bestlinesports_line_feed")
public class LineFeed {

    private List<Event> events;

    @XmlElement(name = "event")
    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }
}
