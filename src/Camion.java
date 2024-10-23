 class Camion extends Vehiculo{


     public Camion(String marca, String modelo, String combustible) {
         super(marca, modelo, combustible);
     }

     @Override
     void encender() {
         System.out.println("Camion encendido");
     }

     @Override
     void apagar() {
         System.out.println("Camion apagado");
     }

     @Override
     void mostrarInformacion() {
         System.out.println("Camion " + getMarca() + getModelo() + ", combustible" + getCombustible());
     }
 }
