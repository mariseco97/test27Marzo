public class T {

    private int ore;
    private int minuti;
    private int secondi;

    public T (){
    }

    public T(int ore, int minuti, int secondi) {
        this.ore = ore;
        this.minuti = minuti;
        this.secondi = secondi;
    }
    public int getOre() {
        return ore;
    }

    public void setOre(int ore) {
        this.ore = ore;
    }

    public int getMinuti() {
        return minuti;
    }

    public void setMinuti(int minuti) {
        this.minuti = minuti;
    }

    public int getSecondi() {
        return secondi;
    }

    public void setSecondi(int secondi) {
        this.secondi = secondi;
    }



    @Override
    public String toString() {
        return "T{" +
                "ore=" + ore +
                ", minuti=" + minuti +
                ", secondi=" + secondi +
                '}';
    }

    public void setOrario(int ore, int  minuti, int secondi){
        this.ore = ore;
        this.minuti = minuti;
        this.secondi = secondi;
    }

}
