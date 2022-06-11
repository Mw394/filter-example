package org.rescource.filters;

import io.quarkus.arc.Priority;
import org.jboss.logging.Logger;

import javax.inject.Inject;
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

    @Inject
    Logger logger;

    /*
    This filter logs all incomming request, in the event they pass the TraceID filter.
     */
    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
        logger.info("Request received at " + LocalDateTime.now().toString() + " for " + requestContext.getMethod());
        System.out.println("Request received at " + LocalDateTime.now().toString() + " for " + requestContext.getMethod());
    }


}
