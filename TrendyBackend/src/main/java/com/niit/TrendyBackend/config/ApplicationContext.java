package com.niit.TrendyBackend.config;

import java.util.Properties;

	import javax.sql.DataSource;

	import org.hibernate.SessionFactory;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.context.annotation.Bean;
	import org.springframework.context.annotation.ComponentScan;
	import org.springframework.context.annotation.Configuration;
	import org.springframework.jdbc.datasource.DriverManagerDataSource;
	import org.springframework.orm.hibernate5.HibernateTransactionManager;
	import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
	import org.springframework.transaction.annotation.EnableTransactionManagement;

//import com.niit.TrendyBackend.dao.BillingDao;
//import com.niit.TrendyBackend.dao.CardDao;
//import com.niit.TrendyBackend.dao.CartDao;
//import com.niit.TrendyBackend.dao.CartitemsDao;
import com.niit.TrendyBackend.dao.CategoryDao;
//import com.niit.TrendyBackend.dao.OrderDao;
//import com.niit.TrendyBackend.dao.OrderitemsDao;
import com.niit.TrendyBackend.dao.ProductDao;
//import com.niit.TrendyBackend.dao.ShippingDao;
import com.niit.TrendyBackend.dao.SupplierDao;
import com.niit.TrendyBackend.dao.UserDao;
//import com.niit.TrendyBackend.daoimpl.BillingDaoimpl;
//import com.niit.TrendyBackend.daoimpl.CardDaoimpl;
//import com.niit.TrendyBackend.daoimpl.CartDaoimpl;
//import com.niit.TrendyBackend.daoimpl.CartitemsDaoimpl;
import com.niit.TrendyBackend.daoimpl.CategoryDaoImpl;
//import com.niit.TrendyBackend.daoimpl.OrderDaoimpl;
//import com.niit.TrendyBackend.daoimpl.OrderitemsDaoimpl;
import com.niit.TrendyBackend.daoimpl.ProductDaoimpl;
//import com.niit.TrendyBackend.daoimpl.ShippingDaoimpl;
import com.niit.TrendyBackend.daoimpl.SupplierDaoimpl;
import com.niit.TrendyBackend.daoimpl.UserDaoimpl;
//import com.niit.TrendyBackend.model.Billing;
//import com.niit.TrendyBackend.model.Card;
//import com.niit.TrendyBackend.model.Cart;
//import com.niit.TrendyBackend.model.Cartitems;
import com.niit.TrendyBackend.model.Category;
//import com.niit.TrendyBackend.model.Order;
//import com.niit.TrendyBackend.model.Orderitems;
import com.niit.TrendyBackend.model.Product;
//import com.niit.TrendyBackend.model.Shipping;
import com.niit.TrendyBackend.model.Supplier;
import com.niit.TrendyBackend.model.User;

	@Configuration
	@ComponentScan("com.niit.*")
	@EnableTransactionManagement
	public class ApplicationContext 
	{
		@Bean("dataSource")
		public DataSource getDataSource() {
			DriverManagerDataSource dataSource = new DriverManagerDataSource();
			dataSource.setDriverClassName("org.h2.Driver");
			dataSource.setUrl("jdbc:h2:tcp://localhost/~/test/trendy");
			dataSource.setUsername("sa");
			dataSource.setPassword("sa");
			return dataSource;
	}
		private Properties getHibernateProperties() {
			Properties properties = new Properties();
			properties.put("hibernate.connection.pool_size", "10");
			properties.put("hibernate.hbm2ddl.auto", "update");
			properties.put("hibernate.show_sql", "true");
			properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
			return properties;
		}
		
		@Autowired
		@Bean("sessionFactory")
		public SessionFactory getSessionFactory(DataSource dataSource) {
			LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
			sessionBuilder.addProperties(getHibernateProperties());
//			sessionBuilder.addAnnotatedClass(Category.class);
			sessionBuilder.addAnnotatedClass(Product.class);
//			sessionBuilder.addAnnotatedClass(Billing.class);
//			sessionBuilder.addAnnotatedClass(Shipping.class);
			sessionBuilder.addAnnotatedClass(Supplier.class);
			sessionBuilder.addAnnotatedClass(User.class);
//			sessionBuilder.addAnnotatedClass(Cart.class);
//			sessionBuilder.addAnnotatedClass(Cartitems.class);
//			sessionBuilder.addAnnotatedClass(Order.class);
//			sessionBuilder.addAnnotatedClass(Orderitems.class);
//			sessionBuilder.addAnnotatedClass(Card.class);
			return sessionBuilder.buildSessionFactory();
		}
		
		@Autowired
		@Bean("transactionManager")
		public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
			HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
			return transactionManager;
		}
//
//		@Autowired
//		@Bean("categoryDao")
//		public CategoryDao getCategoryDao(SessionFactory sessionFactory) {
//			return new CategoryDaoImpl(sessionFactory);
//		}

		@Autowired
		@Bean("productDao")
		public ProductDao getProductDao(SessionFactory sessionFactory) {
			return new ProductDaoimpl(sessionFactory);
		}

//		@Autowired
//		@Bean("billingDao")
//		public BillingDao getBillingDao(SessionFactory sessionFactory) {
//			return new BillingDaoimpl(sessionFactory);
//		}

//		@Autowired
//		@Bean("shippingDao")
//		public ShippingDao getShippingDao(SessionFactory sessionFactory) {
//			return new ShippingDaoimpl(sessionFactory);
//		}
		@Autowired
		@Bean("supplierDao")
		public SupplierDao getSupplierDao(SessionFactory sessionFactory) {
			return new SupplierDaoimpl(sessionFactory);
		}
		@Autowired
		@Bean("userDao")
		public UserDao getUserDao(SessionFactory sessionFactory) {
			return new UserDaoimpl(sessionFactory);
		}
//		@Autowired
//		@Bean("cartDao")
//		public CartDao getCartDao(SessionFactory sessionFactory) {
//			return new CartDaoimpl(sessionFactory);
//		}
//		@Autowired
//		@Bean("cartitemsDao")
//		public CartitemsDao getCartitemsDao(SessionFactory sessionFactory) {
//			return new CartitemsDaoimpl(sessionFactory);
//		}
//		@Autowired
//		@Bean("orderDao")
//		public OrderDao getOrderDao(SessionFactory sessionFactory) {
//			return new OrderDaoimpl(sessionFactory);
//		}
//		@Autowired
//		@Bean("orderitemsDao")
//		public OrderitemsDao getOrderitemsDao(SessionFactory sessionFactory) {
//			return new OrderitemsDaoimpl(sessionFactory);
//		}
//		@Autowired
//		@Bean("cardDao")
//		public CardDao getcardDao(SessionFactory sessionFactory) {
//			return new CardDaoimpl(sessionFactory);
//		}
}
