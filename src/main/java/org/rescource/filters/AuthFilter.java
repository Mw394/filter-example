package org.rescource.filters;

import io.quarkus.arc.Priority;

import javax.ws.rs.ConstrainedTo;
import javax.ws.rs.Priorities;
import javax.ws.rs.RuntimeType;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

@Priority(Priorities.AUTHENTICATION)
@Provider
@ConstrainedTo(RuntimeType.SERVER)
public class AuthFilter implements ContainerRequestFilter {

    /*

     */
    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
        String authHeader = requestContext.getHeaders().getFirst("authorization");
        System.out.println("Auth header is: " + authHeader);
    }
}
