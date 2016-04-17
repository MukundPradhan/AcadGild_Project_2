package com.assignments.acadgild.project_2_IMDB.model;

import android.content.Context;

import com.assignments.acadgild.project_2_IMDB.MainActivity;

import java.lang.reflect.Array;

/**
 * Created by mukund on 14/4/16.
 */
public class Movies {
    private String posterPath;
    private String adult;
    private String overview;
    private String releaseDate;
    private Array genreIDs;
    private String id;
    private String title;
    private String language;
    private String originalTitle;
    private String popularity;
    private String voteCount;
    private String video;
    private String voteAvg;
    Context context;

    public Movies(Context context) {
        this.context = context;

    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public String getAdult() {
        return adult;
    }

    public void setAdult(String adult) {
        this.adult = adult;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Array getGenreIDs() {
        return genreIDs;
    }

    public void setGenreIDs(Array genreIDs) {
        this.genreIDs = genreIDs;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public String getPopularity() {
        return popularity;
    }

    public void setPopularity(String popularity) {
        this.popularity = popularity;
    }

    public String getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(String voteCount) {
        this.voteCount = voteCount;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getVoteAvg() {
        return voteAvg;
    }

    public void setVoteAvg(String voteAvg) {
        this.voteAvg = voteAvg;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }


}
