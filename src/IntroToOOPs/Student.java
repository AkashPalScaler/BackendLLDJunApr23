package IntroToOOPs;

public class Student {
    public String name;
    private int id;
    protected int age;
    String batch; //Default

    void printData(){
        id = 10;
        System.out.println(id);
    }
    //Setter
    void setId(int id){
        if(id > 0) {
            this.id = id;
        }
    }
    //Getter
    int getId(){
        return this.id;
    }
}
