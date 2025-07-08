package net.engineeringdigest.journalapp.entity;

public class JournalEntry{
    private int id;
    private String title;
    private String content;

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getTitle(){
        return this.title;
    }
    public void setContent(String content){
        this.content=content;
    }
    public String getContent(){
        return this.content;
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
