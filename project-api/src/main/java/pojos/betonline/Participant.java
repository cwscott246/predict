package pojos.betonline;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by charlie on 8/17/17.
 */
@XmlRootElement
public class Participant {

    private String name;

    private String homeOrAway;

    public String getName() {
        return name;
    }

    @XmlElement(name = "participant_name")
    public void setName(String name) {
        this.name = name;
    }

    public String getHomeOrAway() {
        return homeOrAway;
    }

    public void setHomeOrAway(String homeOrAway) {
        this.homeOrAway = homeOrAway;
    }
}
