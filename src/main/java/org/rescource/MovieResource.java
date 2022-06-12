package org.rescource;
import org.rescource.dto.CreateMovieDTO;
import org.rescource.dto.MovieDTO;
import org.service.MovieService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.stream.Collectors;

@Path("/movies")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MovieResource {

    private final MovieService movieService;

    @Inject
    public MovieResource(MovieService movieService) {
        this.movieService = movieService;
    }

    @POST
    @Path("/create")
    public MovieDTO createMovie(CreateMovieDTO movie) {
        return new MovieDTO((movieService.createMovie(movie.getTitle(), movie.getDirector(), movie.getReleaseYear())));
    }

    @GET
    @Path("/getAll")
    public List<MovieDTO> getMovies() {
        return movieService.getMovies().stream().map(MovieDTO::new).collect(Collectors.toList());
    }

    @GET
    @Path("/{id}")
    public MovieDTO getMovie(@PathParam("id") String id) {
        System.out.println(id);
        return new MovieDTO(movieService.getMovie(id));
    }

    @GET
    @Path("/testFilters")
    public Response testFilters() {
        return Response.ok().build();
    }


}
