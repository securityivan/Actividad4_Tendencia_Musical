package actividad4_tendencia_musical;

public class Icono_Intellinj_Compatible {
    public static final Icono_Intellinj_Compatible MUSICAL_NOTE = new Icono_Intellinj_Compatible(new int[]{0xD83C, 0xDFB5});
    public static final Icono_Intellinj_Compatible ROCKET = new Icono_Intellinj_Compatible(new int[]{0xD83D, 0xDE80});
    public static final Icono_Intellinj_Compatible FIRE = new Icono_Intellinj_Compatible(new int[]{0xD83D, 0xDD25});

    private final int[] internalEncoding;

    private Icono_Intellinj_Compatible(int[] internalEncoding) {
        this.internalEncoding = internalEncoding;
    }

    public String texto() {
        return new String(internalEncoding, 0, internalEncoding.length);
    }
}
