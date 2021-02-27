import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { ServicesService } from '../services.service';

@Component({
  selector: 'app-sims',
  templateUrl: './sims.component.html',
  styleUrls: ['./sims.component.css'],
})
export class SimsComponent implements OnInit {
  form: FormGroup;
  getSims: any;

  constructor(
    private formBuilder: FormBuilder,
    private simService: ServicesService,
    private router: Router
  ) {}

  ngOnInit(): void {
    this.form = this.formBuilder.group({
      txtSimName: ['', [Validators.required]],
      txtSimNumber: ['', [Validators.required]],
    });
    this.simService.getSim().subscribe(
      (data) => {
        console.log(data);
        this.getSims = data['data'];
      },
      (error) => console.log(error)
    );
  }

  onSubmit(form: any) {
    debugger;
    console.log(this.form.value);
    this.simService.createSim(this.form.value).subscribe(
      (data) => {
        console.log(data);
        this.router.navigate(['sim']);
        window.location.reload();
      },
      (error) => console.log(error)
    );
  }
}
