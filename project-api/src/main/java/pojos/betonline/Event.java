package pojos.betonline;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by charlie on 7/5/17.
 */
@XmlRootElement
public class Event {

    @XmlRootElement
    private static class Participant {

        private static class Odds {

            private Integer moneyLine;

            @XmlElement(name = "moneyline")
            public Integer getMoneyLine() {
                return moneyLine;
            }

            public void setMoneyLine(Integer moneyLine) {
                this.moneyLine = moneyLine;
            }
        }

        private String name;

        private String homeOrAway;

        private Odds odds;

        @XmlElement(name = "participant_name")
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @XmlElement(name = "visiting_home_draw")
        public String getHomeOrAway() {
            return homeOrAway;
        }

        public void setHomeOrAway(String homeOrAway) {
            this.homeOrAway = homeOrAway;
        }

        @XmlElement(name = "odds")
        public Odds getOdds() {
            return odds;
        }

        public void setOdds(Odds odds) {
            this.odds = odds;
        }
    }

    private static class Period {

        private static class Spread {

            Double visitingSpread;

            Integer visitingMoneyLine;

            Double homeSpread;

            Integer homeMoneyLine;

            @XmlElement(name = "spread_visiting")
            public Double getVisitingSpread() {
                return visitingSpread;
            }

            public void setVisitingSpread(Double visitingSpread) {
                this.visitingSpread = visitingSpread;
            }

            @XmlElement(name = "spread_adjust_visiting")
            public Integer getVisitingMoneyLine() {
                return visitingMoneyLine;
            }

            public void setVisitingMoneyLine(Integer visitingMoneyLine) {
                this.visitingMoneyLine = visitingMoneyLine;
            }

            @XmlElement(name = "spread_home")
            public Double getHomeSpread() {
                return homeSpread;
            }

            public void setHomeSpread(Double homeSpread) {
                this.homeSpread = homeSpread;
            }

            @XmlElement(name = "spread_adjust_home")
            public Integer getHomeMoneyLine() {
                return homeMoneyLine;
            }

            public void setHomeMoneyLine(Integer homeMoneyLine) {
                this.homeMoneyLine = homeMoneyLine;
            }
        }

        private static class Total {

            Double total;

            Integer overMoneyLine;

            Integer underMoneyLine;

            @XmlElement(name = "total_points")
            public Double getTotal() {
                return total;
            }

            public void setTotal(Double total) {
                this.total = total;
            }

            @XmlElement(name = "over_adjust")
            public Integer getOverMoneyLine() {
                return overMoneyLine;
            }

            public void setOverMoneyLine(Integer overMoneyLine) {
                this.overMoneyLine = overMoneyLine;
            }

            @XmlElement(name = "under_adjust")
            public Integer getUnderMoneyLine() {
                return underMoneyLine;
            }

            public void setUnderMoneyLine(Integer underMoneyLine) {
                this.underMoneyLine = underMoneyLine;
            }
        }


        private String description;

        private String status;

        private Spread spread;

        private Total total;

        @XmlElement(name = "period_description")
        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        @XmlElement(name = "period_status")
        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        @XmlElement(name = "spread")
        public Spread getSpread() {
            return spread;
        }

        public void setSpread(Spread spread) {
            this.spread = spread;
        }

        @XmlElement(name = "total")
        public Total getTotal() {
            return total;
        }

        public void setTotal(Total total) {
            this.total = total;
        }
    }

    private String sportType;

    private String gmtDateTime;

    private List<Participant> participants;

    private Period period;

    @XmlElement(name = "sporttype")
    public String getSportType() {
        return sportType;
    }

    public void setSportType(String sportType) {
        this.sportType = sportType;
    }

    @XmlElement(name = "event_datetimeGMT")
    public String getGmtDateTime() {
        return gmtDateTime;
    }

    public void setGmtDateTime(String gmtDateTime) {
        this.gmtDateTime = gmtDateTime;
    }

    @XmlElement(name = "participant")
    public List<Participant> getParticipants() {
        return participants;
    }


    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

    @XmlElement(name = "period")
    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }
}
