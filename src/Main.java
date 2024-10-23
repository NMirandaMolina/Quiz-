//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Vehiculo carro = new Carro ("Ford","Mustang","Gasolina");
        Vehiculo moto = new Moto("Yamaha","MT-07","Gasolina");
        Vehiculo camion = new Camion("Mercedes-Benz","Actros","Diesel");
        CarroElectrico carroElectrico = new CarroElectrico("Tesla", "Model 3", 50);


        carro.encender();
        carro.mostrarInformacion();
        carro.abastecerCombustible();
        carro.apagar();

        moto.encender();
        moto.mostrarInformacion();
        moto.abastecerCombustible();
        moto.apagar();

        camion.encender();
        camion.mostrarInformacion();
        camion.abastecerCombustible();
        camion.apagar();

        carroElectrico.encender();
        carroElectrico.mostrarInformacion();
        carroElectrico.cargarBateria();
        System.out.println("Nivel de bateria despues de cargar: " + carroElectrico.nivelBateria() + "%");
        carroElectrico.apagar();


    }
}