package net.engineeringdigest.journalapp.entity;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;

@Document(collection = "journal_entries")
@Data
@NoArgsConstructor
public class JournalEntry {
    @Id
    private ObjectId id;
    @NonNull
    private String title;
    private String content;
    private LocalDateTime date;



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
