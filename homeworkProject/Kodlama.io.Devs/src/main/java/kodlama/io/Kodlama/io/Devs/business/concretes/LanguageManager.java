package kodlama.io.Kodlama.io.Devs.business.concretes;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.dataAccess.concretes.InMemoryLanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LanguageManager implements LanguageService {

    private InMemoryLanguageRepository inMemoryLanguageRepository;
    @Autowired
    public LanguageManager(InMemoryLanguageRepository inMemoryLanguageRepository) {
        this.inMemoryLanguageRepository = inMemoryLanguageRepository;
    }

    @Override
    public List<Language> getAll() {
        return inMemoryLanguageRepository.getAll();
    }

    @Override
    public Language bring(int id) throws Exception {
        if (!isIdExist(id)) throw new Exception("Id bulunamadı.");
        for (Language language : inMemoryLanguageRepository.getAll()){
            if (language.getId() == id){
                int indexOfLanguage = inMemoryLanguageRepository.getAll().indexOf(language);
                return inMemoryLanguageRepository.bring(indexOfLanguage);
            }
        }
        return null;
    }

    @Override
    public void delete(int id) throws Exception {
        if (!isIdExist(id)) throw new Exception("Id bulunamadı!");
        inMemoryLanguageRepository.delete(id);

    }

    @Override
    public void add(Language language) throws Exception {
        if (isNameExist(language)) throw new Exception("İsim zaten mevcut!");
        if (isIdExist(language.getId())) throw new Exception("Id zaten mevcut!");
        if(language.getName().isEmpty()) throw new Exception("Programming language cannot be empty.");
        inMemoryLanguageRepository.add(language);
    }

    @Override
    public void update(Language language) throws Exception {
        if(!isIdExist(language.getId())) throw new Exception("İd bulunamadı!");
        if(isNameExist(language)) throw new Exception("İsim tekrar edemez!");
        if(!isAnyChange(language)) throw new Exception("id ve isim aynı!");
        inMemoryLanguageRepository.update(language);
    }

    public boolean isIdExist(int id){
        for (Language language : inMemoryLanguageRepository.getAll()){
            if (language.getId() == id){
                return true;
            }
        }
        return false;
    }
    public boolean isNameExist(Language language){
        for(Language languages : inMemoryLanguageRepository.getAll()) {
            if(languages.getId() != language.getId() && languages.getName().equalsIgnoreCase(language.getName())) {
                return true;
            }
        }
        return false;
    }

    public boolean isAnyChange(Language language){
        for (Language languages : inMemoryLanguageRepository.getAll()){
            if(languages.getId() == language.getId() && !languages.getName().equals(language.getName())) {
                return true;
            }
            else if(languages.getId() == language.getId() && languages.getName().equals(language.getName())) {
                return false;
            }
        }
        return false;
    }
}
