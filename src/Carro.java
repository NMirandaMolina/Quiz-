class Carro extends Vehiculo {


      public Carro(String marca, String modelo, String combustible) {
           super(marca, modelo, combustible);
      }

      @Override
     void encender() {
           System.out.println("Carro encendido");
     }

     @Override
     void apagar() {
          System.out.println("Carro apagado");
     }

     @Override
     void mostrarInformacion() {
          System.out.println("Carro " + getMarca() + getModelo() + ", combustible" + getCombustible());
     }



}
