package org.interceptor;

import java.util.HashMap;

public class CacheMap {

    private final HashMap<MethodKey, Object> map;

    public CacheMap() {
        this.map = new HashMap<>();
    }

    public Object get(MethodKey key) {
        return map.get(key);
    }

    public void put(MethodKey key, Object o) {
        map.put(key,o);
    }
}
