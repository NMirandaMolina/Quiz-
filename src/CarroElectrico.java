 class CarroElectrico extends Carro implements VehiculoElectrico {

    private int nivelBateria;

     public CarroElectrico(String marca, String modelo, int nivelBateria) {
         super(marca, modelo, "electrico");
         this.nivelBateria = nivelBateria;
     }

     @Override
     public void cargarBateria() {
         System.out.println("Cargando bateria ....");
         nivelBateria = 100;
     }

     @Override
     public int nivelBateria() {
         return nivelBateria;
     }

     public void mostrarInformacion(){
         super.mostrarInformacion();
         System.out.println("Nivel de bateria " + nivelBateria + "%");

     }
 }
