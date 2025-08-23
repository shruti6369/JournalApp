package net.engineeringdigest.journalapp.cache;

import net.engineeringdigest.journalapp.Repository.ConfigJournalAppRepository;
import net.engineeringdigest.journalapp.entity.ConfigJournalAppEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class AppCache {

    public enum keys{

        WEATHER-API;

    }

    public static final Map<String, String> APP_CACHE = new ConcurrentHashMap<>();

    @Autowired
    private ConfigJournalAppRepository configJournalAppRepository;

    @PostConstruct
    public void init() {
        System.out.println("Loading configuration into APP_CACHE...");
        List<ConfigJournalAppEntity> all = configJournalAppRepository.findAll();
        for (ConfigJournalAppEntity e : all) {
            APP_CACHE.put(e.getKey(), e.getValue());
            System.out.println("Loaded: " + e.getKey() + " = " + e.getValue());
        }
        System.out.println("Final APP_CACHE: " + APP_CACHE);
    }
}
