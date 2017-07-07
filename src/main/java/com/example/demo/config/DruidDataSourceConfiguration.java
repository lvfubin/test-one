package com.example.demo.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

/**
 * 数据源bean
 * 连接池
 */
@Configuration
@SuppressWarnings("unused")
public class DruidDataSourceConfiguration {
	//spring-boot默认的日志是logback
	private Logger logger = LoggerFactory.getLogger(DruidDataSourceConfiguration.class);

    @Autowired
    private Environment env;

	@Value("${spring.datasource.url}")
    private String dbUrl;

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;

    @Value("${spring.datasource.driverClassName}")
    private String driverClassName;

    @Value("${spring.datasource.driverClassName}")
    private String typeAliasesPackage;

    @Value("${spring.datasource.driverClassName}")
    private String mapperLocations;



    @Bean    //声明其为Bean实例
    @Primary  //在同样的DataSource中，首先使用被标注的DataSource
    public DataSource dataSource(){

//        BasicDataSource dataSource = new BasicDataSource();
        DruidDataSource datasource = new DruidDataSource();
        datasource.setUrl(dbUrl);
        datasource.setPassword(password);
        datasource.setUsername(username);
        datasource.setDriverClassName(driverClassName);
        logger.info(datasource.toString());
        return datasource;
    }

//    @Bean
//    public SqlSessionFactory sqlSessionFactoryBean()  throws Exception{
//        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//        DataSource dataSource = dataSource();
//        bean.setDataSource(dataSource);
//        bean.setTypeAliasesPackage(typeAliasesPackage);
//        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(env.getProperty("mybatis.mapperLocations")));
        //分页插件
//        PageHelper pageHelper = new PageHelper();
//        Properties props = new Properties();
//        props.setProperty("reasonable", "true");
//        props.setProperty("supportMethodsArguments", "true");
//        props.setProperty("returnPageInfo", "check");
//        props.setProperty("params", "count=countSql");
//        pageHelper.setProperties(props);
        //添加插件
//        bean.setPlugins(new Interceptor[]{pageHelper});
//        try {
//            return bean.getObject();
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
}
