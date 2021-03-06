package com.yoka.endpoints;

import com.yoka.components.ThemeComponent;
import com.yoka.components.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ThemeEndpoint {

    @Autowired
    ThemeComponent themeComponent;

    @GetMapping(value = "/musiques")
    public ResponseEntity<List<Musique>> listMusic(){
        return new ResponseEntity<>(themeComponent.getMusicList(), HttpStatus.OK);
    }

    @PostMapping(value = "/musique/add")
    public ResponseEntity<Musique> addMusic(@RequestBody Musique musique) {
        if(themeComponent.nodeExist(musique)){
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
        return new ResponseEntity<>(themeComponent.addMusic(musique), HttpStatus.CREATED);
    }

    @GetMapping(value = "/jeuxVideos")
    public ResponseEntity<List<JeuVideo>> listVideoGames(){
        return new ResponseEntity<>(themeComponent.getVideoGameList(), HttpStatus.OK);
    }

    @PostMapping(value = "/jeuVideo/add")
    public ResponseEntity<JeuVideo> addVideoGame(@RequestBody JeuVideo jeuVideo) {

        if(themeComponent.nodeExist(jeuVideo)){
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
        return new ResponseEntity<>(themeComponent.addVideoGame(jeuVideo), HttpStatus.CREATED);
    }

    @GetMapping(value = "/mangas")
    public ResponseEntity<List<Manga>> listManga(){
        return new ResponseEntity<>(themeComponent.getMangaList(), HttpStatus.OK);
    }

    @PostMapping(value = "/manga/add")
    public ResponseEntity<Manga> addManga(@RequestBody Manga manga) {
        if(themeComponent.nodeExist(manga)){
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
        return new ResponseEntity<>(themeComponent.addManga(manga), HttpStatus.CREATED);
    }

    @GetMapping(value = "/animes")
    public ResponseEntity<List<Anime>> listAnime(){
        return new ResponseEntity<>(themeComponent.getAnimeList(), HttpStatus.OK);
    }

    @PostMapping(value = "/anime/add")
    public ResponseEntity<Anime> addAnime(@RequestBody Anime anime) {
        if(themeComponent.nodeExist(anime)){
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
        return new ResponseEntity<>(themeComponent.addAnime(anime), HttpStatus.CREATED);
    }

    @GetMapping(value = "/series")
    public ResponseEntity<List<Serie>> listSerie(){
        return new ResponseEntity<>(themeComponent.getSerieList(), HttpStatus.OK);
    }

    @PostMapping(value = "/serie/add")
    public ResponseEntity<Serie> addSerie(@RequestBody Serie serie) {
        if(themeComponent.nodeExist(serie)){
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
        return new ResponseEntity<>(themeComponent.addSerie(serie), HttpStatus.CREATED);
    }

    @GetMapping(value = "/films")
    public ResponseEntity<List<Film>> listFilm(){
        return new ResponseEntity<>(themeComponent.getFilmList(), HttpStatus.OK);
    }

    @PostMapping(value = "/film/add")
    public ResponseEntity<Film> addFilm(@RequestBody Film film) {
        if(themeComponent.nodeExist(film)){
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
        return new ResponseEntity<>(themeComponent.addFilm(film), HttpStatus.CREATED);
    }

    @PostMapping(value = "/anime/score/add")
    public ResponseEntity<Double> addScore(@RequestBody Anime anime, @RequestHeader String score) {
        return new ResponseEntity<>(themeComponent.addScore(Double.parseDouble(score), anime), HttpStatus.OK);
    }

    @PostMapping(value = "/film/score/add")
    public ResponseEntity<Double> addScore(@RequestBody Film film, @RequestHeader String score) {
        return new ResponseEntity<>(themeComponent.addScore(Double.parseDouble(score), film), HttpStatus.OK);
    }

    @PostMapping(value = "/jeuVideo/score/add")
    public ResponseEntity<Double> addScore(@RequestBody JeuVideo jeuVideo, @RequestHeader String score) {
        return new ResponseEntity<>(themeComponent.addScore(Double.parseDouble(score), jeuVideo), HttpStatus.OK);
    }

    @PostMapping(value = "/manga/score/add")
    public ResponseEntity<Double> addScore(@RequestBody Manga manga, @RequestHeader String score) {
        return new ResponseEntity<>(themeComponent.addScore(Double.parseDouble(score), manga), HttpStatus.OK);
    }

    @PostMapping(value = "/musique/score/add")
    public ResponseEntity<Double> addScore(@RequestBody Musique musique, @RequestHeader String score) {
        return new ResponseEntity<>(themeComponent.addScore(Double.parseDouble(score), musique), HttpStatus.OK);
    }

    @PostMapping(value = "/serie/score/add")
    public ResponseEntity<Double> addScore(@RequestBody Serie serie, @RequestHeader String score) {
        return new ResponseEntity<>(themeComponent.addScore(Double.parseDouble(score), serie), HttpStatus.OK);
    }

}
