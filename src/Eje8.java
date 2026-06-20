public class Eje8 {
    public static boolean puedeIngresar(int edad, boolean tieneInvitacion, double dineroDisponible) {
        if (edad >= 18 && (tieneInvitacion == true || dineroDisponible > 50.0)) {
            return true;
        } else {
            return false;
        }

    }

}
