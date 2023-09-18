package labtask_1;

public class Music {


    private String tittle;

    private String duration;

    private String genre;

    private Date releaseDate;

    private Singer singer;

    public Music(String tittle, String duration, String genre, Date releaseDate, Singer singer) {
        this.tittle = tittle;
        this.duration = duration;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.singer = singer;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Singer getSinger() {
        return singer;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }

    public String toString(){
        return String.format("%s/%s/%s/%s/%s",tittle,duration,genre,releaseDate,singer);
    }

}
