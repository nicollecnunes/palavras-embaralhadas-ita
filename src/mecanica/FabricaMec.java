
package mecanica;

public class FabricaMec {
    private static MecJogo mMecanica;
    
    public static MecJogo get() {
        return  mMecanica;
    }

    public static void set(MecJogo mecanicaDoJogo) {
        FabricaMec.mMecanica = mecanicaDoJogo;
    }
    
}
