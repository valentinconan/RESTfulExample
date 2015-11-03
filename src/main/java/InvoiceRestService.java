import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.rest.Invoice;

@Path("/invoices")
public class InvoiceRestService {

	@GET
	@Path("/get/{id}")
	public Response getInvoice(@PathParam("id") String id){
		return Response.status(200).entity(id).build();
	}
	
	/**
	 * Allows to post data
	 * 
	 * 		{
	 *		"price":999,
	 *		"name":"iPad 3"
	 *		}
	 * @param invoice via JSON
	 * @return the response
	 */
	@POST
	@Path("/post")
	@Consumes("application/json")
	public Response createInvoiceJSON(Invoice invoice) {
		String result = "Product created : " + invoice;
		return Response.status(201).entity(result).build();
	}
	
	/**
	 * Returns an Invoice
	 * @return the invoice
	 */
	@GET
	@Path("/get")
	@Produces("application/json")
	public Invoice getInvoiceJSON() {
		Invoice lInvoice = new Invoice();
		lInvoice.setName("iPad 3");
		lInvoice.setPrice(999);
		return lInvoice; 
	}
	
	/**
	 * Returns an Invoice
	 * @return the invoice
	 */
	@GET
	@Path("/getMulti")
	@Produces("application/json")
	public List<Invoice> getInvoicesJSON() {
		List<Invoice> lInvoices = new ArrayList<Invoice>();
		lInvoices.add(new Invoice("Ipad 1",600));
		lInvoices.add(new Invoice("Ipad 2",700));
		lInvoices.add(new Invoice("Ipad 3",800));
		lInvoices.add(new Invoice("Ipad Air",1000));
		return lInvoices; 
	}

}
