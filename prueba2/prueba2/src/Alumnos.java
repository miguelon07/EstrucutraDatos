public class Alumnos{
    private String DNI;
    private int NP;
    private String nombreCompleto;

    public Alumnos(){ //metodo constructor por defecto
        DNI="10.000.000-A";
        NP=0;
        nombreCompleto="Nombre apellido1 apellido2";
    }
    public Alumnos(String DNIp, int NPp, String nombreCompletop){
        DNI=DNIp;
        char primerdigito=DNIp.charAt(0);
        if (!Character.isDigit(primerdigito)){
            throw new IllegalArgumentException("DNI incorreto");
        }
        if (NPp>=0){
            throw new IllegalArgumentException("NP incorrecto");
        }
        NP=NPp;
        nombreCompleto=nombreCompletop;
    }

    public int getNP() {
        return NP;
    }

    public void setNP(int NP) {
        this.NP = NP;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    @Override
    public String toString() {
        return "Alumnos{" +
                "DNI='" + DNI + '\'' +
                ", NP=" + NP +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                '}';
    }
}