import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/configs")
public class ConfigRestService {

	/**
	 * Returns informations about the webBrowser
	 * @param whichBrowser
	 * @return a String containing webbrowser's informations
	 */
	@GET
	@Path("/webbrowser")
	public Response getWebBrowser(@HeaderParam("User-Agent") String whichBrowser){
		String result = "Restful example : " + whichBrowser;
		return Response.status(200).entity(result).build();
	}
}
