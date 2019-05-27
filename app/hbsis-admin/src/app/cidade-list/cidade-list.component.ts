import { Component, OnInit } from '@angular/core';
import { CidadeService } from '../cidade.service';
import {Cidade} from '../models/Cidade'
import {Temperatura} from '../models/Temperatura'
import {HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-cidade-list',
  templateUrl: './cidade-list.component.html',
  styleUrls: ['./cidade-list.component.scss']
})
export class CidadeListComponent implements OnInit {

  cidades : Cidade[];

  constructor(private cidadeService: CidadeService) {
  }
 
  ngOnInit() {
    this.cidadeService.getCidades().subscribe((data:Cidade[]) => {this.cidades = data;});
  }

  getTemperatura(id){

    let temperaturas : Temperatura[];

     this.cidadeService
    .getTemperaturas(id)
    .subscribe((data:Temperatura[]) => {
      temperaturas = data;
      this.setTemperaturaCidade(temperaturas, id);
    });
  }

  setTemperaturaCidade(temperaturas, id){
    for (let index = 0; index < this.cidades.length; index++) {
      const element = this.cidades[index];
      if(element.idGlobal == id){
        element.temperaturas = temperaturas;
      }
      
    }
  }

}
