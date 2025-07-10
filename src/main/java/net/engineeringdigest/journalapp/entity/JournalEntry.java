package net.engineeringdigest.journalapp.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.xml.crypto.Data;
import java.time.LocalDateTime;
import java.util.Date;

@Document(collection = "journal_entries")
public class JournalEntry {
    @Id
    private ObjectId id;
    private String title;
    private String content;
    private LocalDateTime date;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

}

//interface  cow{
//    public void moo();
//    public  void walk();
//}
//abstract class animal{
//    public void walking(){
//        System.out.println("walking");
//    }
//    abstract  public void run();
//}
// class car extends animal implements cow{
//    String color;
//    public void setColor(String color){
//        this.color=color;
//    }
//
//
//    public  void talk(){
//        System.out.println("walking..");
//    }public void moo(){
//         System.out.println("moo");
//     }
//     public  void walk() {
//         System.out.println("walkig..");
//     }public void run(){
//         System.out.println("running");
//     }
//}
