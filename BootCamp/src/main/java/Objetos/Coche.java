package Objetos;

public class Coche {
    //atributos     caracteristicas que tiene un coche y varian respecto a otro (todos son coches pero cada uno tiene
    //                                                                          caracteristicas personales diferentes)
        String color;
        String fabricante;
        String modelo;
        Double peso;
        Double largo;
        Integer velocidad = 0;

        //constructores: construir objetos a partir de la clase (coche)

//        public Coche(){
//          this. (asigna valor a un atributo)
//        }
        public Coche(String color, String fabricante, String modelo, Double largo, Double peso){

            this.color = color;
            this.fabricante = fabricante;
            this.modelo = modelo;
            this.largo = largo;
            this.peso = peso;
        }

    public Coche() {
    }

    //comportamiento, metodos:   diferentes comportamientos del atributo
        public void acelerar(Integer km ) {

            if(km > 0 && km <= 180 ){
                this.velocidad += km;
            }
        }

    // toString    alt+insert(Generate) toString
    // imprime valor de los objetos
        @Override
        public String toString() {
            return "Coche: \n" +
                    "Color= "+ color +"/ "+
                    "Fabricante= " + fabricante +"/ "+
                    "Modelo= " + modelo + "/ "+
                    "Largo= " + largo +"/ "+
                    "Peso= " + peso +"/ "+
                    "Velocidad= " + velocidad +".";
        }
}
