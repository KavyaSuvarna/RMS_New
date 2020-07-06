import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class RateService {

  private baseUrl = 'http://localhost:8080/rms';

  constructor(private http:HttpClient) { }

  getRate(id: number): Observable<any> {
    return this.http.get(`${this.baseUrl}/${id}`);
  }

  createRate(rate: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl}/add`, rate);
  }

  updateRate(id: number, value: any): Observable<Object> {
    return this.http.put(`${this.baseUrl}/${id}`, value);
  }

  deleteRate(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/delete/${id}`);
  }

  getRateList(): Observable<any> {
    return this.http.get(`${this.baseUrl}/all`);
  }
}
