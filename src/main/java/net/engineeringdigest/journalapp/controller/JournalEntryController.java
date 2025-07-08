package net.engineeringdigest.journalapp.controller;

import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;
import net.engineeringdigest.journalapp.entity.JournalEntry;
import java.util.ArrayList;
import java.util.List;
@RestController
public class  JournalEntryController{

    private Map<Integer,JournalEntry> journalEntries=new HashMap<>();

    @PostMapping("journalEntry")

    public boolean createEntry(@RequestBody JournalEntry journalEntry){
        journalEntries.put(journalEntry.getId(),journalEntry);
        return false;
    }
    @GetMapping("getJournalEntry")
    public List<JournalEntry> getEntry(){
        return new ArrayList<>(journalEntries.values());
    }


}