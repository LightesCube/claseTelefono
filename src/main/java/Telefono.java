public class Telefono {
    //Atributos
    String modelo;
    String marca;

    public Telefono(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    public void llamar() {
        System.out.println(modelo + "!!");
    }

    public void reproducir() {
        System.out.println("el telefono es un " + modelo + " y su marca es " + marca
        );
    }
}

