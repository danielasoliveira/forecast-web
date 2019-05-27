import { Component, OnInit } from '@angular/core';
import { CidadeService } from '../cidade.service';
import { ActivatedRoute, Router } from '@angular/router';
import {Cidade} from '../models/Cidade';

@Component({
  selector: 'app-cidade-form',
  templateUrl: './cidade-form.component.html',
  styleUrls: ['./cidade-form.component.scss']
})
export class CidadeFormComponent {

  cidade : Cidade;

  constructor(private route: ActivatedRoute, private router: Router, private cidadeService: CidadeService) {
    this.cidade = new Cidade();
  }
  
  onSubmit() {
    this.cidadeService.saveCidade(this.cidade).subscribe(result => this.gotoUserList());
  }

  gotoUserList() {
    this.router.navigate(['/cidades']);
  }

}
