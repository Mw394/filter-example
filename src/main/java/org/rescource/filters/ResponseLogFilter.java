package org.rescource.filters;

import io.quarkus.arc.Priority;
import org.jboss.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.ConstrainedTo;
import javax.ws.rs.RuntimeType;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;
import java.io.IOException;
import java.time.LocalDateTime;


@ConstrainedTo(RuntimeType.SERVER)
@Priority(2)
@Provider
public class ResponseLogFilter implements ContainerResponseFilter {

    @Inject
    Logger logger;
    /*
    This filter logs all responses sent back to requester.
     */
    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException {
        logger.info("Response for: " + requestContext.getRequest().getMethod() + " sent at " + LocalDateTime.now().toString() );
        System.out.println("Response for: " + requestContext.getRequest().getMethod() + " sent at " + LocalDateTime.now().toString() );
    }
}
