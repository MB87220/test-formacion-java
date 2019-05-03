public class Cat{

    String name;
    String color;
    int weight;

    public String talk() {
        return "miau";
    }

    public void eat (String food) {
        System.out.println("El gato va a comer:" + food);
        System.out.println(toString());
    }

    public String toString(){
        return "El gato se llama: " + name + "y es de color: " + color;
    }

    public static void main(String[] args){
        Cat gato1 = new Cat();
        //Asignar valores a variables
        gato1.name = args[0];
        gato1.color = args[1];
        gato1.weight = args [2];

        if (gato.weight < 500) {
            System.out.println("El gato pasa a la sala de cuidados especiales");
        }

        Cat gato2 = new Cat();
        gato2.name = args[0];
        gato2.color = args[1];

        //Imprimir los atributos de gato1
        System.out.println(gato1.talk());
        System.out.println( gato1.toString());

        System.out.println(gato2.talk());
        System.out.println( gato2.toString());

    }
}
