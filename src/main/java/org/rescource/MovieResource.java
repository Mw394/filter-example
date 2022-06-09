package org.rescource;
import org.rescource.dto.MovieDTO;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/movies")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MovieResource {

    @POST
    @Path("/create")
    public Response createMovie(MovieDTO movie) {
        return Response.ok().build();
    }


}
