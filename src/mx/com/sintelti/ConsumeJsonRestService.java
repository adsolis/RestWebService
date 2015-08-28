package mx.com.sintelti;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/jsonServicio")
public class ConsumeJsonRestService {
	
	@POST
	@Path("/envio")
	@Consumes("application/json")
	public Response consumirJson(PersonaBean persona) {
		
		System.out.println(persona.getNombre());
		return Response.status(200).entity(persona.getNombre()).build();
	}

}
