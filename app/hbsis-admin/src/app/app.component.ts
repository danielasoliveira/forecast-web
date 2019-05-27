import { Component, OnInit } from '@angular/core';
import { CidadeService } from './cidade.service';
import {Cidade} from './models/Cidade'
import {Temperatura} from './models/Temperatura'
import {HttpClient} from '@angular/common/http';
import { Title } from '@angular/platform-browser';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit{
  title = 'hbsis-admin';

  constructor() { }

  ngOnInit() {
  }

}
