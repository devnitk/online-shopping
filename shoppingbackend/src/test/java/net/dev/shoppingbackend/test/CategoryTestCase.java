package net.dev.shoppingbackend.test;

import static org.junit.Assert.assertEquals;
import net.dev.shoppingbackend.dao.CategoryDAO;
import net.dev.shoppingbackend.dto.Category;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CategoryTestCase {
	
	private static AnnotationConfigApplicationContext context;
	
	private static CategoryDAO categoryDAO;
	
	private Category category;
	
	@BeforeClass
	public static void init() { 
		
		context = new AnnotationConfigApplicationContext();
		context.scan("net.dev.shoppingbackend");
		context.refresh();
		
		categoryDAO = (CategoryDAO)context.getBean("CategoryDAO");
	}
	
	/*@Test
	public void testAddCategory(){
		
		category = new Category();
		
		category.setName("Television");
		category.setDescription("This is some description about tv");
		category.setImageURL("CAT_1.png");
		
		assertEquals("Successfully added a category..", true, categoryDAO.add(category));
		
		
		category = new Category();

		category.setName("Mobile");
		category.setDescription("This is some description for Mobile");
		category.setImageURL("CAT_2.png");

		assertEquals("Successfully added a category..", true, categoryDAO.add(category));
		
		
		
	}*/
	/*@Test
	public void testGetCategory(){ 
		category = categoryDAO.get(1);
		assertEquals("Successfully Get the category..","Television", category.getName());
	}*/
	
	/*@Test
	public void testUpdateCategory(){ 
		category = categoryDAO.get(1);
		category.setName("Mobile");
		assertEquals("Successfully updated the category..",true, categoryDAO.update(category));
	}*/
	
	/*@Test
	public void testdeleteCategory(){ 
		category = categoryDAO.get(1);
		assertEquals("Successfully deleted the category..",true, categoryDAO.delete(category));
	}*/
	
	@Test
	public void testListCategory() {
		assertEquals("Successfully fetch list of the category..", 3,
				categoryDAO.list().size());
	}
	

}
