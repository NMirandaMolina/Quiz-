abstract class Vehiculo {

    private String marca;
    private String modelo;
    private String combustible;

    public Vehiculo(String marca, String modelo, String combustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.combustible = combustible;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    abstract void encender();

    abstract void apagar();

    abstract void mostrarInformacion();

    public void abastecerCombustible(){
        System.out.println("Absteciendo "+ getCombustible());
    }

}
