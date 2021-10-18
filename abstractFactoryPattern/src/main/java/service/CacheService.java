package service;

import java.util.concurrent.TimeUnit;

/**
 * 定义使⽤接⼝，提供给用户使用
 */
public interface CacheService {

    String get(final String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);

}
