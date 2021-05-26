import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from '../@app/app.component';
import {HeaderComponent} from "../@header/header.component";
import {HomeComponent} from "../@home/home.component";
import {FooterComponent} from "../@footer/footer.component";
import {MusiqueComponent} from "../@musique/musique.component";
import {MusiqueService} from "../@musique/musique.service";
import {AppRoutingModule} from "../app-routing.module";
import {HttpClientModule} from "@angular/common/http";
import {JeuVideoComponent} from "../@jeuxVideo/jeuVideo.component";
import {JeuVideoService} from "../@jeuxVideo/jeuVideo.service";
import {MangaComponent} from "../@manga/manga.component";
import {MangaService} from "../@manga/manga.service";
import {AnimeComponent} from "../@anime/anime.component";
import {AnimeService} from "../@anime/anime.service";

@NgModule({
  declarations: [
    AppComponent,
      HeaderComponent,
      HomeComponent,
      FooterComponent,
      MusiqueComponent,
      JeuVideoComponent,
      MangaComponent,
      AnimeComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [
      MusiqueService,
      JeuVideoService,
      MangaService,
      AnimeService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
