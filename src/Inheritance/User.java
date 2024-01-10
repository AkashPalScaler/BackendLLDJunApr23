package Inheritance;

public class User {
    int user_id;
    private int age;

    

    int getAge(){
        return age;
    }

    void setAge(int age){
        if(age > 0) {
            this.age = age;
        }
    }
}
