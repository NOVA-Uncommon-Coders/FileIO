package com.theironyard.novauc;

/**
 * Created by kevinallen on 4/7/17.
 */
public class Magazines {
    String name;
    String genre;
    String pageSize;
    String releaseDate;
    String ranking;

    public Magazines() {
    }

    public Magazines(String name, String genre, String pageSize, String releaseDate, String ranking) {
        this.name = name;
        this.genre = genre;
        this.pageSize = pageSize;
        this.releaseDate = releaseDate;
        this.ranking = ranking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }
}
