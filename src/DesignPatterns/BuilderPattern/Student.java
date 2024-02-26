package DesignPatterns.BuilderPattern;

import javax.xml.validation.Validator;

public class Student {
    String name;
    int age;
    int psp;
    String univName;
    long phnNo;
    int gradYear;

    public static Builder getBuilder(){
        return new Builder();
    }

    private Student(Builder studB) throws Exception{
        if(studB.name != null){
            if(studB.name.length() <= 1){
                throw new Exception("Validation Failed");
            }
        }

        if(studB.age < 20){
            throw  new Exception("Validation Failed");
        }

        if(studB.phnNo ==123456789){
            throw new Exception("Invalid");
        }


        this.name = studB.name;
        this.age = studB.age;
        this.psp = studB.psp;
        this.univName = studB.univName;
        this.phnNo = studB.phnNo;
        this.gradYear = studB.gradYear;

    }

    public static class Builder {
        String name;
        int age;
        int psp;
        String univName;
        long phnNo;
        int gradYear;

        public Student build() throws Exception{
            return new Student(this);
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setPsp(int psp) {
            this.psp = psp;
            return this;
        }

        public Builder setUnivName(String univName) {
            this.univName = univName;
            return this;
        }

        public Builder setPhnNo(long phnNo) {
            this.phnNo = phnNo;
            return this;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }
    }

}
