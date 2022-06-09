package org.rescource.filters;

import io.quarkus.arc.Priority;

import javax.ws.rs.ConstrainedTo;
import javax.ws.rs.RuntimeType;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.ext.Provider;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;

@ConstrainedTo(RuntimeType.SERVER)
@Priority(2)
@Provider
public class RequestLogFilter implements ContainerRequestFilter {

    /*
    This filter logs all incomming request, in the event they pass the TraceID filter.
     */
    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
        System.out.println("Log1: Request received at " + LocalDateTime.now().toString() + " for " + requestContext.getMethod());
    }


}
