package net.dev.shoppingbackend.dao;

import java.util.List;

import net.dev.shoppingbackend.dto.Category;

public interface CategoryDAO {

	boolean addCategory(Category category);
	
	List<Category> list();
	
	Category get(int id);
}
