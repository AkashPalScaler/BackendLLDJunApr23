package DesignPatterns.PrototypeAndRegistry;

public class Student implements Prototype<Student> {
    String name;
    String age;
    int psp;
    int avgBatchPSP; // Batch specific properties
    String batchName; // Batch specific properties

    public Student(int avgBatchPSP, String batchName){
        this.avgBatchPSP = avgBatchPSP;
        this.batchName = batchName;
    }
    //copy constructor
    public Student(Student other){
        this.batchName = other.batchName;
        this.avgBatchPSP = other.avgBatchPSP;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getPsp() {
        return psp;
    }

    public void setPsp(int psp) {
        this.psp = psp;
    }

    public int getAvgBatchPSP() {
        return avgBatchPSP;
    }

    public void setAvgBatchPSP(int avgBatchPSP) {
        this.avgBatchPSP = avgBatchPSP;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }
}
