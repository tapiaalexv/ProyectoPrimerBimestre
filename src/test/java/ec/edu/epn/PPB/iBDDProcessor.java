package ec.edu.epn.PPB;

public class iBDDProcessor {

    private iBDD baseDatos;

    public iBDDProcessor(iBDD baseDatos) {
        this.baseDatos = baseDatos;
    }

    public boolean verificarContraseĆ±aAntigua(String password){
        iBDDResponse respuesta = (iBDDResponse) baseDatos.requestLastPass(new iBDDRequest(password));
        return respuesta.getStatus() == iBDDResponse.BDDStatus.OK;

    }
}
