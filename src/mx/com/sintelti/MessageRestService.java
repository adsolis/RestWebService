package mx.com.sintelti;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/mensaje")
public class MessageRestService implements RestWS {
	
	@GET
	@Path("/crear/{parametro}")
	@Produces("application/json")
	@Override
	public PersonaBean printMessage(@PathParam("parametro") String parametro) {
		
		PersonaBean persona = new PersonaBean();
		persona.setNombre(parametro);
		
		String result = "Ejemplo de rest : " + parametro;
		return persona;

	}
	
	

}
