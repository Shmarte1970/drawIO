import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddEditEmpresasComponent } from './add-edit-empresas.component';

describe('AddEditEmpresasComponent', () => {
  let component: AddEditEmpresasComponent;
  let fixture: ComponentFixture<AddEditEmpresasComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AddEditEmpresasComponent]
    });
    fixture = TestBed.createComponent(AddEditEmpresasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
