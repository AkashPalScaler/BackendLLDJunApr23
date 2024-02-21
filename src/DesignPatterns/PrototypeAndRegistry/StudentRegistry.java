package DesignPatterns.PrototypeAndRegistry;

import java.util.HashMap;

public class StudentRegistry {
    HashMap<String, Student> map = new HashMap<>();

    void register(String key, Student student){
        map.put(key, student);
    }

    Student get(String key){
        return map.get(key);
    }
}
