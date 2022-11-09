public class Segunda_Parte {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.AgregarPuertas();

        System.out.println(miCoche.puertas);
    }

    static class Coche{
        public int puertas = 4;

        public void AgregarPuertas(){
            this.puertas++;
        }
    }
}