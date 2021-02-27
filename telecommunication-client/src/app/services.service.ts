import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { AppUrlConstants } from './constants/AppUrlConstants';
import { ServiceResponse } from './helpers/ApplicationHelperDTO';

@Injectable({
  providedIn: 'root',
})
export class ServicesService {
  constructor(private httpClient: HttpClient) {}

  createCustomer(customer: any) {
    return this.httpClient.post<ServiceResponse[]>(
      environment.apiUrl + AppUrlConstants.CUSTOMER_CREATE,
      customer
    );
  }
  getCustomer() {
    return this.httpClient.get<ServiceResponse[]>(
      environment.apiUrl + AppUrlConstants.CUSTOMER_GET
    );
  }

  createSim(sim: any) {
    return this.httpClient.post<ServiceResponse[]>(
      environment.apiUrl + AppUrlConstants.SIM_CREATE,
      sim
    );
  }
  getSim() {
    return this.httpClient.get<ServiceResponse[]>(
      environment.apiUrl + AppUrlConstants.SIM_GET
    );
  }
}
