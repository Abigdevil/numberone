package com.numberone;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * @author numberone
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
    @MapperScan("com.numberone.*.mapper")
public class Application
{
    public static void main(String[] argds)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(Application.class);
        System.out.println("(♥◠‿◠)ﾉﾞ  CRM客户管理系统启动成功   ლ(´ڡ`ლ)ﾞ  \n");
    }
}