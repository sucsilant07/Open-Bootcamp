public class Herencia {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setEdad(20);
        cliente.setTelefono(986417250);
        cliente.setNombre("Juan");
        cliente.setCredito(100);

        System.out.println(cliente.getNombre() + " " + cliente.getEdad());
        System.out.println(cliente.getTelefono());
        System.out.println(cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(18);
        trabajador.setTelefono(986877201);
        trabajador.setNombre("Luis");
        trabajador.setSalario(10000);

        System.out.println(trabajador.getNombre() + " " + trabajador.getEdad());
        System.out.println(trabajador.getTelefono());
        System.out.println(trabajador.getSalario());

    }
}
class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public int getTelefono(){
        return this.telefono;
    }
}
class Cliente extends Persona {
    private int credito;

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public int getCredito() {
        return this.credito;
    }
}

class Trabajador extends Persona {
    private int salario;

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalario() {
        return this.salario;
    }
}