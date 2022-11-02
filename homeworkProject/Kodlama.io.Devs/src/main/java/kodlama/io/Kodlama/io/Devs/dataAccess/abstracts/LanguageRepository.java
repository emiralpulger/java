package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

import java.util.List;

public interface LanguageRepository {
    List<Language> getAll();
    Language bring(int id);
    public void delete(int id);
    public void add(Language language);
    public void update(Language language);
}
