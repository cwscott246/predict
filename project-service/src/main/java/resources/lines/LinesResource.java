package resources.lines;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by charlie on 8/14/17.
 */
@Path("lines")
public class LinesResource {

    LinesResourceInterfaceImpl linesResourceInterface = new LinesResourceInterfaceImpl();

    @GET
    public Object getLines() {

        return linesResourceInterface.getEvents();
    }
}
