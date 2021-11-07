package Data;

public class aModelos {
    private int IDModelo;
    private String NombreModelo;

    public aModelos(int IDModelo, String NombreModelo) {
        this.IDModelo = IDModelo;
        this.NombreModelo = NombreModelo;
    }
    
    public aModelos() {
    }

    public int getIDModelo() {
        return IDModelo;
    }

    public void setIDModelo(int IDModelo) {
        this.IDModelo = IDModelo;
    }

    public String getNombreModelo() {
        return NombreModelo;
    }

    public void setNombreModelo(String NombreModelo) {
        this.NombreModelo = NombreModelo;
    }
    
}
