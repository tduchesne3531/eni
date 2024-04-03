public class PC implements Empruntable {

    private String marque;
    private String type;
    private String disqueDur;
    private String gpu;
    private String cpu;

    public PC(String marque, String type, String disqueDur, String gpu, String cpu) {
        this.marque = marque;
        this.type = type;
        this.disqueDur = disqueDur;
        this.gpu = gpu;
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "PC{" +
                "marque='" + marque + '\'' +
                ", type='" + type + '\'' +
                ", disqueDur='" + disqueDur + '\'' +
                ", gpu='" + gpu + '\'' +
                ", cpu='" + cpu + '\'' +
                '}';
    }
}
