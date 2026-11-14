package edu.hitwh.buildermodel;

import io.micrometer.common.util.StringUtils;

public class ResourceBuilder1 implements Builder{
    private static final int DEFAULT_MAX_TOTAL = 8;
    private static final int DEFAULT_MAX_IDLE = 8;
    private static final int DEFAULT_MIN_IDLE = 0;
    private String name;
    private int maxTotal = DEFAULT_MAX_TOTAL;
    private int maxIdle = DEFAULT_MAX_IDLE;
    private int minIdle = DEFAULT_MIN_IDLE;
    public ResourceBuilder1 setName(String name) {
        if (StringUtils.isBlank(name)) {
            throw new IllegalArgumentException("...");
        }
        this.name = name;
        return this;
    }

    public ResourceBuilder1 setMaxTotal(int maxTotal) {
        if (maxTotal <= 0) {
            throw new IllegalArgumentException("...");
        }
        this.maxTotal = maxTotal;
        return this;
    }
    public ResourceBuilder1 setMinIdle(int minIdle) {
        if (minIdle < 0) {
            throw new IllegalArgumentException("...");
        }
        this.minIdle = minIdle;
        return this;
    }
    public ResourceBuilder1 setMaxIdle(int maxIdle) {
        if (maxIdle < 0) {
            throw new IllegalArgumentException("...");
        }
        this.maxIdle = maxIdle;
        return this;
    }

    public ResourcePoolConfig1 build() {
        // 校验逻辑放到这里来做，包括必填项校验、依赖关系校验、约束条件校验等
        if (StringUtils.isBlank(name)) {
            throw new IllegalArgumentException("...");
        }
        if (maxIdle > maxTotal) {
            throw new IllegalArgumentException("...");
        }
        if (minIdle > maxTotal || minIdle > maxIdle) {
            throw new IllegalArgumentException("...");
        }
        return new ResourcePoolConfig1(this);
    }

    public static int getDefaultMaxIdle() {
        return DEFAULT_MAX_IDLE;
    }
    public static int getDefaultMaxTotal() {
        return DEFAULT_MAX_TOTAL;
    }
    public static int getDefaultMinIdle() {
        return DEFAULT_MIN_IDLE;
    }
    public String getName() {
        return name;
    }
    public int getMaxTotal() {
        return maxTotal;
    }
    public int getMaxIdle() {
        return maxIdle;
    }
    public int getMinIdle() {
        return minIdle;
    }

}
