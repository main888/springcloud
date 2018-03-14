package com.atguigu.springcloud;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

 
@SpringBootApplication
@EnableZuulProxy
public class DeptConsumer_zuul_App
{
  public static void main(String[] args)
  {
   SpringApplication.run(DeptConsumer_zuul_App.class,args);
  }
}
 

