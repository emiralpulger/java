package dataAccess;

import entities.Category;

public class HibernateCategoryDao implements CatagoryDao{
    @Override
    public void add(Category category) {
        System.out.println("Catagory Hibernate ile eklendi : " + category.getCatagoryName());
    }
}
