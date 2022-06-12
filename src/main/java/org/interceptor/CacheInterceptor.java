package org.interceptor;

import javax.annotation.Priority;
import javax.interceptor.AroundConstruct;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Cached
@Interceptor
@Priority(1)
public class CacheInterceptor {

    private CacheMap chacheMap;

    public CacheInterceptor() {
        chacheMap = new CacheMap();
        Cached c = this.getClass().getAnnotation(Cached.class);
    }

    /*
    Whenever a function annotated with @Cached is called this function will be called to check if a similar call has already been made.
    If it's the first time a method is being called with set parameters, a MethodKey will be added to the Cache.
    If a call matching an already existing MethodKey the system will return object from the cache instead of the repo.
     */
    @AroundInvoke
    public Object cacheMethod(InvocationContext invocationContext) throws Exception{
        MethodKey key = new MethodKey(invocationContext.getParameters(), invocationContext.getMethod());
        System.out.println(key.getMethod().toString());
        System.out.println(key.getParameters().toString());
        if (chacheMap.get(key) != null) {
            System.out.println(String.format("USING CACHE"));
            return chacheMap.get(key);
        } else {
            System.out.println(String.format("USING REAL REPO"));
            Object o = invocationContext.proceed();
            chacheMap.put(key, o);
            return o;
        }
    }

    @AroundConstruct
    public Object auditConstructor(InvocationContext invocationContext) throws Exception {
        System.out.println("Before Cache Calling Constructor");
        Object o = invocationContext.proceed();
        System.out.println("After Cache Calling Constuctor");
        return o;
    }
}
