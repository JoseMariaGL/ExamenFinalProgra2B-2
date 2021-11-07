package Data;

public class aTelefonos {
    private int IDTelefono;
    private String IMEI;
    private String Modelo;
    private String Marca;
    private String MACAdress;

    public aTelefonos(int IDTelefono, String IMEI, String Modelo, String Marca, String MACAdress) {
        this.IDTelefono = IDTelefono;
        this.IMEI = IMEI;
        this.Modelo = Modelo;
        this.Marca = Marca;
        this.MACAdress = MACAdress;
    }

    public aTelefonos() {
    }

    public int getIDTelefono() {
        return IDTelefono;
    }

    public void setIDTelefono(int IDTelefono) {
        this.IDTelefono = IDTelefono;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getMACAdress() {
        return MACAdress;
    }

    public void setMACAdress(String MACAdress) {
        this.MACAdress = MACAdress;
    }
    
}
