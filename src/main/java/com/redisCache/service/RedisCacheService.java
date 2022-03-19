package com.redisCache.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class RedisCacheService {

    @Cacheable(cacheNames = "cache-key")
    public String longWaiting() throws InterruptedException {
        Thread.sleep(5000);
        return "Cache service was worked";
    }

    @CacheEvict(cacheNames = "cache-key")
    public void removeCache(){
        System.out.println("Cache removed");
    }
}
