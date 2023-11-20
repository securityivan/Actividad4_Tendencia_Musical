package actividad4_tendencia_musical;

public interface EstadoPopularidad {
    void reproducir(Cancion cancion);

    void actualizarEstado(Cancion cancion, int reproducciones, int likes, int dislikes);

    void mostrarDetalle(Cancion cancion);
}
