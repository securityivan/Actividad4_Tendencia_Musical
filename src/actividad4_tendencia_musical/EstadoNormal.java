package actividad4_tendencia_musical;

public class EstadoNormal implements EstadoPopularidad {
    @Override
    public void reproducir(Cancion cancion) {
        cancion.incrementarReproducciones();
    }

    @Override
    public void actualizarEstado(Cancion cancion, int reproducciones, int likes, int dislikes) {
        if (reproducciones > 1000) {
            cancion.setEstado(new EstadoEnAuge());
        }
    }

    @Override
    public void mostrarDetalle(Cancion cancion) {
        Icono_Intellinj_Compatible icono = Icono_Intellinj_Compatible.MUSICAL_NOTE;
        String leyenda = String.format("%s - %s - %s", cancion.getArtista(), cancion.getAlbum(), cancion.getTitulo());
        System.out.println(icono.texto() + " - " + leyenda);
    }
}
