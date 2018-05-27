package net.dev.shoppingbackend.daoImp;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.dev.shoppingbackend.dao.CategoryDAO;
import net.dev.shoppingbackend.dto.Category;

@Repository("CategoryDAO")
@Transactional
public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	private SessionFactory sessionFactory;

	private static List<Category> categories = new ArrayList<Category>();

	/*static {

		Category category = new Category();

		// adding first Category

		category.setId(1);
		category.setName("Television");
		category.setDescription("This is some description for tele");
		category.setImageURL("CAT_1.png");

		categories.add(category);

		category = new Category();

		// adding second Category

		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is some description for Mobile");
		category.setImageURL("CAT_2.png");

		categories.add(category);
		category = new Category();

		// adding third Category

		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is some description for Laptop");
		category.setImageURL("CAT_3.png");
		categories.add(category);
	}*/

	@Override
	public List<Category> list() {

		String selectActiveCategory = "FROM Category where active = :active";
		
		Query query = sessionFactory.getCurrentSession().createQuery(selectActiveCategory);
		
		query.setParameter("active", true);
		
		return query.getResultList();
	}

	@Override
	public Category get(int id) {

		/*for (Category category : categories) {
			if (category.getId() == id) {
				return category;
			}
		}*/
		return sessionFactory.getCurrentSession().get(Category.class, Integer.valueOf(id));
	}

	@Override
	public boolean add(Category category) {
		try {
			sessionFactory.getCurrentSession().persist(category);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean update(Category category) {
		try {
			sessionFactory.getCurrentSession().update(category);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean delete(Category category) {
		category.setActive(false);
		try {
			sessionFactory.getCurrentSession().update(category);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

}
