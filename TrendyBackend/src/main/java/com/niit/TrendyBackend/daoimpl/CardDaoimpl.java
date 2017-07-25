//package com.niit.TrendyBackend.daoimpl;
//
//import java.util.List;
//
//import org.hibernate.Criteria;
//import org.hibernate.Query;
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.niit.TrendyBackend.dao.CardDao;
//
//import com.niit.TrendyBackend.model.Card;
//
//@Repository("cardDao")
//@EnableTransactionManagement
//@Transactional
//
//public class CardDaoimpl implements CardDao{
//	@Autowired
//	SessionFactory sessionFactory;
//	
//	public CardDaoimpl(SessionFactory sessionFactory)
//	{
//		this.sessionFactory=sessionFactory;
//	}
//
//	@Override
//	public boolean saveorupdate(Card card) {
//		sessionFactory.getCurrentSession().saveOrUpdate(card);
//		return true;
//	}
//
//	@Override
//	public boolean delete(Card card) {
//		sessionFactory.getCurrentSession().delete(card);
//		return true;
//	}
//	@Override
//	public Card getCard(String Card_Id) {
//		String g1="from Card where card_Id='"+Card_Id+"'";
//		Query w = sessionFactory.getCurrentSession().createQuery(g1);
//		List<Card> list=(List<Card>)w.list();
//		if(list==null||list.isEmpty())
//		{
//			return null;
//		}
//		return list.get(0);
//	}
//
//	@Override
//	public List<Card> list() {
//		List<Card> card= (List<Card>)sessionFactory.getCurrentSession().createCriteria(Card.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
//		return card;
//	}
//
//	
//	
//	
//}
//
//
//
//
