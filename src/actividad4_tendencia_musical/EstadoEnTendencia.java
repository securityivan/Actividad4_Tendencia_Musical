package actividad4_tendencia_musical;

public class EstadoEnTendencia implements EstadoPopularidad {
    @Override
    public void reproducir(Cancion cancion) {
        cancion.incrementarReproducciones();
    }

    @Override
    public void actualizarEstado(Cancion cancion, int reproducciones, int likes, int dislikes) {
        if (!cancion.fueReproducidaEnUltimasHoras()) {
            cancion.setEstado(new EstadoNormal());
        }
    }

    @Override
    public void mostrarDetalle(Cancion cancion) {
        Icono_Intellinj_Compatible icono = Icono_Intellinj_Compatible.FIRE;
        String leyenda = String.format("%s - %s (%s - %d)", cancion.getTitulo(), cancion.getArtista(), cancion.getAlbum(), cancion.getAnioAlbum());
        System.out.println(icono.texto() + " - " + leyenda);
    }
}

