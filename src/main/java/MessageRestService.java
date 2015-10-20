
import java.util.List;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

@Path("/message")
public class MessageRestService {

	/**
	 * Returns a message with the value of param
	 * @param msg to return
	 * @return a msg containing param
	 */
	@GET
	@Path("/unique/{param}")
	public Response getMessage(@DefaultValue("defaultParam") @PathParam("param") String msg){
		String result = "Restful example : " + msg;
		return Response.status(200).entity(result).build();
	}

	/**
	 * Returns a message with a multiple values of params
	 * @param msg a list of msg
	 * @param uniqueMsg an unique parameter. The default value of this parameter is "defaultParam" 
	 * @return a message with the list of msg and the uniqueMsg
	 */
	@GET
	@Path("/multi")
	public Response getMessages(@QueryParam("params") List<String> msg, 
			@DefaultValue("defaultParam") @QueryParam("uniqueParam") String uniqueMsg){
		String result = "Restful example : " +uniqueMsg+ " and "+ msg;
		return Response.status(200).entity(result).build();
	}

	/**
	 * Returns a message with a multiple values of params
	 * @param info Context containing the parameters
	 * @return a message with the list of msg and the uniqueMsg
	 */
	@GET
	@Path("/multiContext")
	public Response getMessages(@Context UriInfo info){
		List<String> lStrings = info.getQueryParameters().get("params");
		String result = "Restful example : " + lStrings;
		return Response.status(200).entity(result).build();
	}
	
	
	
	
	
	
	/*@QueryParam("from") int from,
		@QueryParam("to") int to,
		@QueryParam("orderBy") List<String> orderBy)*/
//	
//	@GET
//	@Path("/webbrowser/{param}")
//	public Response getWebBrowser(@HeaderParam("User-Agent") String whichBrowser){
//		String result = "Restful example : " + whichBrowser;
//		return Response.status(200).entity(result).build();
//	}
//	
	
	/*
	 @FormParam

@PathParam

@QueryParam

@HeaderParam

@CookieParam

@MatrixParam
	 */
}
