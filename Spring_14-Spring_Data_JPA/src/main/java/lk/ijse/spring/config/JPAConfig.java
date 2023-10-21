package lk.ijse.spring.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories(basePackages = "lk.ijse.spring.repo") // should link where we are going to write our queries
@EnableTransactionManagement // AOP -> use the transaction manager to manage transaction
@PropertySource("classpath:properties.properties") // Links the property file
public class JPAConfig {

    @Autowired
    Environment environment;

    //data base access (username,password,name,url)
    //Spring data jpa need a vendor to run ORM
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource ds, JpaVendorAdapter vad){
        // This is the Spring Data JPA main object which handles all the features
        LocalContainerEntityManagerFactoryBean factory= new LocalContainerEntityManagerFactoryBean();
        factory.setDataSource(ds); // for access a data source
        factory.setJpaVendorAdapter(vad); // for accessing a vendor (hibernate)
        factory.setPackagesToScan(environment.getRequiredProperty("pro.entity")); // Set Entity records to Location to the Spring Data JPA
        return factory;
    }

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource ds= new DriverManagerDataSource();
        ds.setUsername(environment.getRequiredProperty("pro.username"));
        ds.setPassword(environment.getRequiredProperty("pro.password"));
        ds.setDriverClassName(environment.getRequiredProperty("pro.driver"));
        ds.setUrl(environment.getRequiredProperty("pro.url"));
        return ds;
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter(){
        HibernateJpaVendorAdapter va= new HibernateJpaVendorAdapter();
        va.setDatabase(Database.MYSQL); // What is the DB
        va.setGenerateDdl(true); // Data definition language enable
        va.setDatabasePlatform(environment.getRequiredProperty("pro.dial")); // platform version
        va.setShowSql(true); // if you wanted to see generated sql
        return va;
    }


    @Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory factory){
        return new JpaTransactionManager(factory);
    }

}
