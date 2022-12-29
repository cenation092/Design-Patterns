public class PCMMarks {

    private int pMarks;
    private int cMarks;
    private int mMarks;

    public PCMMarks(int pMarks, int cMarks, int mMarks) {
        this.pMarks = pMarks;
        this.cMarks = cMarks;
        this.mMarks = mMarks;
    }
    public int getPMarks() {
        return pMarks;
    }

    public int getCMarks() {
        return cMarks;
    }

    public int getMMarks() {
        return mMarks;
    }

    @Override
    public String toString() {
        return " " + getPMarks() + " " + getCMarks() + " " + getMMarks();
    }
}
