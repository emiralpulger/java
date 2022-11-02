package kodlama.io.Kodlama.io.Devs.webApi;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/language")
public class LanguagesController {
    private LanguageService languageService;

    @Autowired
    public LanguagesController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("/getall")
    public List<Language> getAll(){
        return languageService.getAll();
    }

    @PostMapping("/add")
    public void add(Language language) throws Exception {
        languageService.add(language);
    }
    @DeleteMapping("/delete")
    public void delete(int id) throws Exception{
        languageService.delete(id);
    }
    @PutMapping("/update")
    public void update(Language language) throws Exception{
        languageService.update(language);
    }
    @GetMapping("/getbyid")
    public void getById(int id) throws Exception{
        languageService.bring(id);
    }

}
