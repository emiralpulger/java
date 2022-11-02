package kodlama.io.Kodlama.io.Devs.business.abstracts;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

import java.util.List;

public interface LanguageService {
    List<Language> getAll();
    public Language bring(int id) throws Exception;
    public void delete(int id) throws Exception;
    public void add(Language language) throws Exception;
    public void update(Language language) throws Exception;
}
