package Bucles;

public class For {
    public static void main(String[] args) {

        for (int i = 0 ; i < 10 ; i++){
            System.out.println("El valor de i es: "+ i);
        }
        //ARRAY
        String[] nombre = {"Peppe", "Juan", "Carlos"};
        for (int i = 0; i < nombre.length; i++){
            System.out.println(nombre[i]);
        }

        int suma = 0;
        int[] numeros = {5,7,9};
        for (int i = 0; i < numeros.length; i++){
            suma = suma + numeros[i];
        }

        int contador = 0;
        while(contador <5){
            String nombre1 = "Prueba";
            contador++;
            if(contador == 3){
                continue;
                //break;
            }
            System.out.println("Valor de contador" + contador);
        }

        String dia = "Lunes";  //el dato que ingrese machea con 'case'
        switch (dia){
            case "Lunes":
                System.out.println("Hoy es Lunes!!");
                break;
            case "Miercoles":
                System.out.println("Hoy es Miercoles!!");
                break;
            case "Viernes":
                System.out.println("Hoy es Viernes!!");
                break;
            default:
                System.out.println("Dato invalido");
        }

        int edad = 19;
        if(edad >=18){
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }
}
