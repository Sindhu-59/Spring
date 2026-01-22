package com.xworkz.medisales.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@ComponentScan(basePackages = "com.xworkz.medisales")
public class MediConfig {

    public MediConfig(){
        System.out.println("Configuaration object is created");
    }

    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
        viewResolver.setPrefix("/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/medisales");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("Sindhu@478");
        return driverManagerDataSource;
    }

    public Properties getJpaProperties(){
        Properties properties=new Properties();
        properties.setProperty("hibernate.dialect","org.hibernate.dialect.MySQL8Dialect");
        properties.setProperty("hibernate.show_sql", "true");
        return properties;
    }
    @Bean
    public LocalContainerEntityManagerFactoryBean getEntityManagerFactoryBean(){
        LocalContainerEntityManagerFactoryBean factoryBean=new LocalContainerEntityManagerFactoryBean();
        factoryBean.setDataSource(getDataSource());
        factoryBean.setPackagesToScan("com.xworkz.medisales.entity");
        factoryBean.setJpaProperties(getJpaProperties());
        factoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        return factoryBean;
    }
}
