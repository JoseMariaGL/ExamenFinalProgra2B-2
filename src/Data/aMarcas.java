package Data;

public class aMarcas {
    private int IDMarcas;
    private String NombreMarcas;

    public aMarcas(int IDMarcas, String NombreMarcas) {
        this.IDMarcas = IDMarcas;
        this.NombreMarcas = NombreMarcas;
    }

    public aMarcas() {
    }

    public int getIDMarcas() {
        return IDMarcas;
    }

    public void setIDMarcas(int IDMarcas) {
        this.IDMarcas = IDMarcas;
    }

    public String getNombreMarcas() {
        return NombreMarcas;
    }

    public void setNombreMarcas(String NombreMarcas) {
        this.NombreMarcas = NombreMarcas;
    }
    
}
