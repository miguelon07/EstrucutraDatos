//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args){
        System.out.printf("Hello and welcome!");
        Alumnos alumno1 = new Alumnos();
        Alumnos alumno2 = new Alumnos("12345678Z", 5, "Pepe");

        System.out.println(alumno1);
        System.out.println(alumno2);

    }
}
