package ec.edu.epn.PPB;


public class UsuarioExecute {
    public static void main(String[] args) {
        System.out.println("== Usuario Execute ==");

        Usuario user = new Usuario();
        String cedula1 = "1726503103";
        String cedula2 = "1788171777";

        if (user.isEcuadorianDocumentValid(cedula1)) {
            System.out.println("**Documento Valido -> " + cedula1);
        } else {
            System.out.println("**Documento No Valido -> " + cedula1);
        }

        if (user.isEcuadorianDocumentValid(cedula2)) {
            System.out.println("**Documento Valido -> " + cedula2);
        } else {
            System.out.println("**Documento No Valido -> " + cedula2);
        }

    }
}

