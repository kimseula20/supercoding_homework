package com.github.supercoding_day4_homework.config;


import java.util.HashMap;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@EnableJpaRepositories(
    basePackages = {"com.github.supercodingspring.repository.airlineTicket", "com.github.supercodingspring.repository.users",
        "com.github.supercodingspring.repository.passenger", "com.github.supercodingspring.repository.reservations", "com.github.supercodingspring.repository.flight"},
    entityManagerFactoryRef = "entityManagerFactory2",
    transactionManagerRef =  "tmJpa2"
)
public class JpaConfig2 {

  @Bean
  public LocalContainerEntityManagerFactoryBean entityManagerFactory2(@Qualifier("dataSource2") DataSource dataSource) {
    LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
    em.setDataSource(dataSource);
    em.setPackagesToScan("com.github.supercodingspring.repository.airlineTicket", "com.github.supercodingspring.repository.users",
        "com.github.supercodingspring.repository.passenger", "com.github.supercodingspring.repository.reservations", "com.github.supercodingspring.repository.flight");

    JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
    em.setJpaVendorAdapter(vendorAdapter);

    Map<String, Object> properties = new HashMap<>();
    properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
    properties.put("hibernate.format_sql", "true");
    properties.put("hibernate.use_sql_comment", "true");

    em.setJpaPropertyMap(properties);

    return em;
  }

  @Bean(name = "tmJpa2")
  public PlatformTransactionManager transactionManger2(@Qualifier("dataSource2") DataSource dataSource) {

    JpaTransactionManager transactionManager = new JpaTransactionManager();
    transactionManager.setEntityManagerFactory(entityManagerFactory2(dataSource).getObject());
    return transactionManager;
  }
}
