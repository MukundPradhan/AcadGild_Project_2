package com.assignments.acadgild.project_2_IMDB;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.assignments.acadgild.project_2_IMDB.JSONGetter.JSONGetter;
import com.assignments.acadgild.project_2_IMDB.model.Movies;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class MainActivity extends AppCompatActivity {

    public static String urlLastestMovie = "http://api.themoviedb.org/3/movie/latest?api_key=8496be0b2149805afa458ab8ec27560c";
    public static String urlNowPlaying = "http://api.themoviedb.org/3/movie/now_playing?api_key=8496be0b2149805afa458ab8ec27560c";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //new GetLatestMovies().execute();
        new GetNowPlayingMovies().execute();
    }



    class GetNowPlayingMovies extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... voids) {
            String responceNowPlayingMovies;

            JSONGetter jsonGetter = new JSONGetter(urlNowPlaying);
            responceNowPlayingMovies = jsonGetter.getJSONNowPlaying();

            try {
                JSONObject jsonObjectNowPlaying = new JSONObject(responceNowPlayingMovies);

                JSONArray jsonArrayResults = jsonObjectNowPlaying.getJSONArray("results");

                for (int i = 0; i < jsonArrayResults.length(); i++) {
                    JSONObject jsonObject = jsonArrayResults.getJSONObject(i);
                    Movies movies = new Movies(getApplicationContext());

                    movies.setTitle(jsonObject.getString("title"));
                  //  Log.e("json",movies.getTitle());


                }

            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }
    }

}
