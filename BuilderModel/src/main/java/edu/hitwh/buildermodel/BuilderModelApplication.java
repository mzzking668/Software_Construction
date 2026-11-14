package edu.hitwh.buildermodel;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuilderModelApplication {
  public static void main(String[] args) {
      ResourceBuilder1 resourceBuilder1 = new ResourceBuilder1();
      resourceBuilder1.setName("1号资源池")
              .setMaxTotal(10)
              .setMaxIdle(8)
              .setMinIdle(0);
      ResourcePoolConfig1 rp = resourceBuilder1.build();
      ResourcePoolConfig1 rp1 = new ResourcePoolConfig1(resourceBuilder1);


  }


}
