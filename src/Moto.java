class Moto extends Vehiculo{

    public Moto(String marca, String modelo, String combustible) {
        super(marca, modelo, combustible);
    }

    @Override
    void encender() {
        System.out.println("Moto encendida");
    }

    @Override
    void apagar() {
        System.out.println("Moto apagada");
    }

    @Override
    void mostrarInformacion() {
        System.out.println("Moto " + getMarca() + getModelo() + ", combustible" + getCombustible());
    }
}
