public class App {
    public static void mostrarBienvenida() {
        System.out.println("Bienvenido/a al curso java");
    }
    public static void mostrarMenu () {
        System.out.println("1. Entrada, 2. Plato Fuere, 3. Postre, 4. Salir");

    }
    
    public static void main(String[] args) {
        int tabla = 5;
        
        // Llamar metodos de otras clases:
        // 1. Crear instancia de la clase
        Eje1 nivel1 = new Eje1();
        Eje2 eje2 = new Eje2();
        Eje3 eje3 = new Eje3();
        Eje4 eje4 = new Eje4();
        int lanzarDado = eje3.lanzarDado();
        int ObtenerAñoActual = eje4.ObtenerAñoActual();
        Eje5 eje5 = new Eje5();
        Eje6 eje6 = new Eje6();
       
        // 2. Con la instancia de la clase se llama el metodo
        nivel1.mostrarBienvenida();
        eje2.mostrarMenu();
        System.out.println("el resultado del dado es " + lanzarDado);
        System.out.println("El año actual es:" + ObtenerAñoActual);
        eje5.SaludarUsuario();
        eje6.ImprimirTablaMultiplicar(tabla);
        //Llamar metodos dentro de la misma clase App

        
    
}
}