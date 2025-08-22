package net.engineeringdigest.journalapp.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "config-journal-app")
@Data
@NoArgsConstructor
public class ConfigJournalAppEntity {

    private String key;
    private String value;




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
