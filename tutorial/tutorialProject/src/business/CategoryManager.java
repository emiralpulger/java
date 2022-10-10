package business;

import business.core.logging.BaseLogger;
import dataAccess.CatagoryDao;
import entities.Category;

import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Logger;

public class CategoryManager {
    private CatagoryDao catagoryDao;
    private BaseLogger[] loggers;
    private ArrayList<String> catagoryNames = new ArrayList<>();

    public CategoryManager(CatagoryDao catagoryDao, BaseLogger[] loggers){
        this.catagoryDao = catagoryDao;
        this.loggers = loggers;
    }

    public void add(Category category){
        if (catagoryNames.size() == 0){
            catagoryNames.add(category.getCatagoryName());
            catagoryDao.add(category);
            for (BaseLogger logger : loggers){
                logger.log(category.getCatagoryName());
            }
        }else {
            for (String k : catagoryNames){
                if (k.equals(category.getCatagoryName())){
                    System.out.println("Bu katagori ismi mevcut : "+ k);// burayı dene olmaz ise değiştir
                }else {
                    catagoryDao.add(category);
                    for (BaseLogger logger : loggers){
                        logger.log(category.getCatagoryName());
                    }
                }
            }
        }
    }
}
