package DesignPatterns.BuilderPattern;

public class Builder {
    String name;
    int age;
    int psp;
    String univName;
    long phnNo;
    int gradYear;


//    public Student build() throws Exception{
//        return new Student(this);
//    }

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
