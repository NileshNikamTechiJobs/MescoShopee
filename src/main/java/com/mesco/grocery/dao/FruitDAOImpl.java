package com.mesco.grocery.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.mesco.grocery.model.Fruit;

/**
 * This class will perform all CRUD operation Fruit entity which include search
 * @author Nilesh
 *
 */
@Repository
public class FruitDAOImpl extends AbstractDAO implements FruitDAO {	
	
	private static final Logger logger = LoggerFactory.getLogger(FruitDAOImpl.class);
	
	public Fruit getDummyFruit() {
		
		logger.info("Start get DummyFruit");
		
		Criteria criteria = this.getCurrentSession().createCriteria(Fruit.class);
		
		criteria.add(Restrictions.eq("fruit", "Dummy"));
		
		Fruit fruit = (Fruit) criteria.uniqueResult();
		
		return fruit;
	}
	
	public List<Fruit> addFruits(List<Fruit> fruits) {
		logger.info("Start adding Fruits");
		
		Session session = this.getCurrentSession();
		
		for (Fruit fruit : fruits) {
			session.saveOrUpdate(fruit);
		}
		
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<Fruit> getFruitList() {
		
		logger.info("Start getting all Fruits");
			
		return this.getCurrentSession().createCriteria(Fruit.class).list();
	}

	public Fruit getFruitListByName(String name) {
		logger.info("Start get Fruit by name");
		
		Criteria criteria = this.getCurrentSession().createCriteria(Fruit.class);
		
		criteria.add(Restrictions.eq("fruit", name));
		
		Fruit fruit = (Fruit) criteria.uniqueResult();
		
		return fruit;
	}

	public List<Fruit> updateFruits(List<Fruit> fruits) {
		logger.info("Start update Fruits");
		
		Session session = this.getCurrentSession();
		
		for (Fruit fruit : fruits) {
			session.saveOrUpdate(fruit);
		}
		
		return fruits;
	}
}
