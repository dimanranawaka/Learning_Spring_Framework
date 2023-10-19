package lk.ijse.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;
<<<<<<< HEAD

=======
import java.sql.DriverManager;
>>>>>>> origin/master


@Configuration
public class JPAConfig {

    // Database access(username,password,name.url)
    // Spring data JPA need a vendor to run ORM
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean(DataSource ds, JpaVendorAdapter vad){
        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
        factory.setDataSource(ds);
        factory.setJpaVendorAdapter(vad);
        factory.setPackagesToScan("lk.ijse.spring.entity");
        return factory;
    }

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setUsername("root");
        ds.setPassword("1234");
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/h2?createDatabaseIfNotExists=true");
        return ds;
    }
    @Bean
    public JpaVendorAdapter jpaVendorAdapter(){
        HibernateJpaVendorAdapter vad = new HibernateJpaVendorAdapter();
        vad.setDatabase(Database.MYSQL);
        vad.setGenerateDdl(true);
        vad.setDatabasePlatform("org.hibernate.dialect.MySQL8Dialect");
        vad.setShowSql(true);
        return vad;
    }
}
