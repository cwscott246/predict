package resources.lines;

import client.BetOnline;
import pojos.betonline.LineFeed;

/**
 * Created by charlie on 8/14/17.
 */
public class LinesResourceInterfaceImpl implements LinesResourceInterface {

    @Override
    public LineFeed getEvents() {
        BetOnline betOnline = BetOnline.connect();
        return betOnline.getLines();
    }
}