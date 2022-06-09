package org.rescource.filters;

import io.quarkus.arc.Priority;

import javax.ws.rs.ConstrainedTo;
import javax.ws.rs.RuntimeType;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;
import java.io.IOException;


@Provider
@Priority(1)
@ConstrainedTo(RuntimeType.SERVER)
public class TraceIDFilter implements ContainerRequestFilter {
    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
        if (!requestContext.getHeaders().containsKey("TraceID")) {
            requestContext.abortWith(Response.status(400, "Requires TraceID Header").build());
        } else {
            System.out.println("Request TraceID: " + requestContext.getHeaders().getFirst("TraceID"));
        }
    }
}
