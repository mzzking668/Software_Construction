package edu.hitwh.buildermodel;

public class Developer {
    private Builder builder;
    public Developer(Builder builder) {
        this.builder = builder;
    }
    public ResourcePoolConfig1 BuildResourcePoolConfig1() {
        builder.setMinIdle(0).setName("mzz").setMaxTotal(11).setMaxIdle(10);
        return (ResourcePoolConfig1) builder.build();
    }
}
