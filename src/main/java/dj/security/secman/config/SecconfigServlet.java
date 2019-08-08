package dj.security.secman.config;

import java.beans.PropertyVetoException;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "dj.security.secman")
@PropertySource("classpath:persist-mysql.properties")
public class SecconfigServlet {
	@Autowired
	private Environment env;
	private Logger logger = Logger.getLogger(getClass().getName());
	@Bean
	public DataSource secDataSrc() {
		ComboPooledDataSource cmb = new ComboPooledDataSource();
		try {
			logger.info("env.get"+env.getProperty("jdbc.driver"));
			cmb.setDriverClass(env.getProperty("jdbc.driver"));
			cmb.setJdbcUrl(env.getProperty("jdbc.url"));
			cmb.setUser(env.getProperty("jdbc.username"));
			cmb.setPassword(env.getProperty("jdbc.password"));
			cmb.setInitialPoolSize(Integer.parseInt(env.getProperty("conpool.initpoolsize")));
			cmb.setMaxPoolSize(Integer.parseInt(env.getProperty("conpool.maxpoolsize")));
			cmb.setMinPoolSize(Integer.parseInt(env.getProperty("conpool.minpoolsize")));
			cmb.setMaxIdleTime(Integer.parseInt(env.getProperty("conpool.maxidletime")));
			
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cmb;
	}
	
	@Bean
	public  ViewResolver viewResolve() {
		InternalResourceViewResolver view = new InternalResourceViewResolver();
		view.setPrefix("/WEB-INF/views/");
		view.setSuffix(".jsp");
		return view;
		
	}

}
