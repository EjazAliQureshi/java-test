import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { ServicesService } from '../services.service';
@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css'],
})
export class CustomerComponent implements OnInit {
  form: FormGroup;
  getCustomers: any;
  getSims: any;
  constructor(
    private formBuilder: FormBuilder,
    private customerService: ServicesService,
    private router: Router,
    private simService: ServicesService
  ) {}

  ngOnInit(): void {
    this.simService.getSim().subscribe(
      (data) => {
        this.getSims = data['data'];
        console.log('----SIM--- ' + this.getSims[0]);
      },
      (error) => console.log(error)
    );
    this.form = this.formBuilder.group({
      txtSimName: this.getSims,
      txtName: ['', [Validators.required]],
      txtMobileNumber: ['', [Validators.required]],
      txtCnic: ['', [Validators.required]],
    });

    this.customerService.getCustomer().subscribe(
      (data) => {
        console.log(data);
        this.getCustomers = data['data'];
      },
      (error) => console.log(error)
    );
  }

  onSubmit(form: any) {
    debugger;
    console.log(this.form.value);
    this.customerService.createCustomer(this.form.value).subscribe(
      (data) => {
        console.log(data);
        this.router.navigate(['customer']);
        window.location.reload();
      },
      (error) => console.log(error)
    );
  }
}
