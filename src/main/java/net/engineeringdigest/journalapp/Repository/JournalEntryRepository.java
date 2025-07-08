package net.engineeringdigest.journalapp.Repository;

import net.engineeringdigest.journalapp.entity.JournalEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepository extends MongoRepository<JournalEntry, String> {

}

