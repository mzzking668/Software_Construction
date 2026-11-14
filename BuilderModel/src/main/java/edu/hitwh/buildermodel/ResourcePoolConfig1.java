package edu.hitwh.buildermodel;

public class ResourcePoolConfig1 {
    private static final int DEFAULT_MAX_TOTAL = 8;
    private static final int DEFAULT_MAX_IDLE = 8;
    private static final int DEFAULT_MIN_IDLE = 0;
    private String name;
    private int maxTotal = DEFAULT_MAX_TOTAL;
    private int maxIdle = DEFAULT_MAX_IDLE;
    private int minIdle = DEFAULT_MIN_IDLE;
    public ResourcePoolConfig1(ResourceBuilder1 builder) {
        this.name = builder.getName();
        this.maxIdle = builder.getMaxIdle();
        this.minIdle = builder.getMinIdle();
        this.maxTotal = builder.getMaxTotal();
    }
}
