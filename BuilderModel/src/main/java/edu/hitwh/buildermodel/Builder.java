package edu.hitwh.buildermodel;

public interface Builder {
    public Builder setName(String name);
    public Builder setMaxTotal(int maxTotal);
    public Builder setMinIdle(int minIdle);
    public Builder setMaxIdle(int maxIdle);
    public Object build();
}
