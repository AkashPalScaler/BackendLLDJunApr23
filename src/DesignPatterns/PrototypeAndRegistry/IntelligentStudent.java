package DesignPatterns.PrototypeAndRegistry;

public class IntelligentStudent extends Student {
    int minIQ; //Common batch property
    int iq;

    public IntelligentStudent(int avgBatchPSP, String batchName, int minIQ) {
        super(avgBatchPSP, batchName);
        this.minIQ = minIQ;
    }

    public IntelligentStudent(IntelligentStudent other) {
        super(other);
        this.minIQ = other.minIQ;
    }

    @Override
    public IntelligentStudent clone(){
        return new IntelligentStudent(this);
    }

    public int getMinIQ() {
        return minIQ;
    }

    public void setMinIQ(int minIQ) {
        this.minIQ = minIQ;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}
