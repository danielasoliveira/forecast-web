import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {Cidade} from './models/Cidade'

import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root',
})

export class CidadeService {

  constructor(private http: HttpClient) { }

  getCidades()
  {
    return this.http.get('http://localhost:8080/api/cidades');
  }

  getTemperaturas(id:Number)
  {
    return this.http.get('http://localhost:8080/api/cidades/'+id+'/temperatura');
  }

  saveCidade(cidade: Object)
  {
    return this.http.post<Cidade>('http://localhost:8080/api/cidades', cidade );
  }


}
