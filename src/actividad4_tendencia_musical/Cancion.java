
package actividad4_tendencia_musical;

import java.util.concurrent.TimeUnit;

public class Cancion {
    private String artista;
    private String album;
    private String titulo;
    private int reproducciones;
    private int likes;
    private int dislikes;
    private int anioAlbum;
    private EstadoPopularidad estado;
    private long ultimaReproduccion;

    public Cancion(String artista, String album, String titulo, int anioAlbum) {
        this.artista = artista;
        this.album = album;
        this.titulo = titulo;
        this.anioAlbum = anioAlbum;
        this.estado = new EstadoNormal();
        this.ultimaReproduccion = System.currentTimeMillis();
    }

    public void reproducir() {
        estado.reproducir(this);
        estado.actualizarEstado(this, reproducciones, likes, dislikes);
        estado.mostrarDetalle(this);
        ultimaReproduccion = System.currentTimeMillis();
    }

    public void setEstado(EstadoPopularidad estado) {
        this.estado = estado;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getReproducciones() {
        return reproducciones;
    }

    public void setReproducciones(int reproducciones) {
        this.reproducciones = reproducciones;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    public int getAnioAlbum() {
        return anioAlbum;
    }

    public void setAnioAlbum(int anioAlbum) {
        this.anioAlbum = anioAlbum;
    }

    public EstadoPopularidad getEstado() {
        return estado;
    }

    public long getUltimaReproduccion() {
        return ultimaReproduccion;
    }

    public void setUltimaReproduccion(long ultimaReproduccion) {
        this.ultimaReproduccion = ultimaReproduccion;
    }

    public void incrementarReproducciones() {
        this.reproducciones++;
    }

    public void incrementarLikes() {
        this.likes++;
    }

    public void incrementarDislikes() {
        this.dislikes++;
    }

    public boolean fueReproducidaEnUltimasHoras() {
        long horasTranscurridas = TimeUnit.MILLISECONDS.toHours(
                System.currentTimeMillis() - ultimaReproduccion);
        return horasTranscurridas <= 24;
    }
}