package actividad4_tendencia_musical;

public class EstadoEnAuge implements EstadoPopularidad {
    @Override
    public void reproducir(Cancion cancion) {
        cancion.incrementarReproducciones();
    }

    @Override
    public void actualizarEstado(Cancion cancion, int reproducciones, int likes, int dislikes) {
        if (reproducciones > 50000 && likes > 20000) {
            cancion.setEstado(new EstadoEnTendencia());
        } else if (dislikes > 5000) {
            cancion.setEstado(new EstadoNormal());
        }
    }

    @Override
    public void mostrarDetalle(Cancion cancion) {
        Icono_Intellinj_Compatible icono = Icono_Intellinj_Compatible.ROCKET;
        String leyenda = String.format("%s - %s (%s - %d)", cancion.getArtista(), cancion.getTitulo(), cancion.getAlbum(), cancion.getAnioAlbum());
        System.out.println(icono.texto() + " - " + leyenda);
    }
}

