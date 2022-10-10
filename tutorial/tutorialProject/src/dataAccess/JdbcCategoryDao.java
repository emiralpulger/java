package dataAccess;

import entities.Category;

public class JdbcCategoryDao implements CatagoryDao{
    @Override
    public void add(Category category) {
        System.out.println("Kategori JDBC ile eklendi : "+category.getCatagoryName());
    }
}
