package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

    List<Language> languages;

    public InMemoryLanguageRepository() {
        languages = new ArrayList<Language>();
        languages.add(new Language(1, "C#"));
        languages.add(new Language(1, "Java"));
        languages.add(new Language(1, "Python"));
        languages.add(new Language(1, "JavaScript"));
    }

    @Override
    public List<Language> getAll() {
        return languages;
    }


    @Override
    public Language bring(int indexOfPLanguage) {
        return languages.get(indexOfPLanguage);
    }

    @Override
    public void delete(int id) {
        for (Language language : languages) {
            if (language.getId() == id) {
                languages.remove(id - 1);
            }
        }
    }

    @Override
    public void add(Language language) {
        languages.add(language);
    }

    @Override
    public void update(Language language) {
        for (Language language1 : languages) {
            if (language1.getId() == language.getId()) {
                language1.setName(language.getName());
            }
        }
    }
}
