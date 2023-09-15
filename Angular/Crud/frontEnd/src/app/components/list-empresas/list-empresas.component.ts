import { Component, OnInit } from '@angular/core';
import { Empresa } from 'src/app/interfaces/empresa';

@Component({
  selector: 'app-list-empresas',
  templateUrl: './list-empresas.component.html',
  styleUrls: ['./list-empresas.component.css']
})
export class ListEmpresasComponent implements OnInit{
    listEmpresas: Empresa [] =[
      {id: 1, company: `Zarca, S.L.`, telefono: `678995325`, contacto: `Pedro Rios`, poblacion:`Castellbisbal` },
      {id: 2, company: `Clinica Teknon`, telefono: `696040483`, contacto: `Angeles Soler`, poblacion:`Barcelona` }
  ]


  constructor(){}

  ngOnInit(): void {
      
  }

}
