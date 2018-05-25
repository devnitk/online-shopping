package net.dev.shoppingbackend.daoImp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.dev.shoppingbackend.dao.CategoryDAO;
import net.dev.shoppingbackend.dto.Category;

@Repository("CategoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<Category>();

	static {

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
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {

		for (Category category : categories) {
			if (category.getId() == id) {
				return category;
			}
		}
		return null;
	}

}
