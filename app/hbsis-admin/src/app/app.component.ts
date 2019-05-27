import { Component, OnInit } from '@angular/core';
import { CidadeService } from './cidade.service';
import {Cidade} from './models/Cidade'
import {Temperatura} from './models/Temperatura'
import {HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit{
  title = 'hbsis-admin';

  cidades : Cidade[];
  cidade : Cidade = new Cidade();
  submitted = false;
  id:Number;

  constructor(public http: HttpClient, private cidadeService: CidadeService) { }

  ngOnInit() {
    this.getCidades();
  }

  getCidades(){
    this.cidadeService
    .getCidades()
    .subscribe((data:Cidade[]) => {
      this.cidades = data;
    });
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

  newCidade(): void {
    this.submitted = false;
    this.cidade = new Cidade();
  }

  save() {
    this.cidadeService.saveCidade(this.cidade)
      .subscribe(data => console.log(data), error => console.log(error));
    this.cidade = new Cidade();
  }

  onSubmit() {
    this.submitted = true;
    this.save();
  }


}
