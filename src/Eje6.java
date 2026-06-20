public class Eje6 {

    public void imprimirTablaMultiplicar(int tabla) {
        System.out.println("Tabla de multiplicar " + tabla);
        for (int i = 1; i <= 10; i++) {
            int resultado = tabla * i;
            System.out.println(tabla + " x " + i + " = " + resultado);
        }
    }

}
