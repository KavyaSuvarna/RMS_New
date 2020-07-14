import { Component, OnInit } from '@angular/core';
import { Observable} from 'rxjs';
import { RateService } from "../rate.service";
import { Rate } from "../rate";
import { Router } from '@angular/router';

@Component({
  selector: 'app-rate-list',
  templateUrl: './rate-list.component.html',
  styleUrls: ['./rate-list.component.css']
})
export class RateListComponent implements OnInit {
    rates: Observable<Rate[]>;
    error:String;

  constructor(private rateService: RateService,
    private router: Router) { }

  ngOnInit(): void {
    this.reloadData();
  }

  reloadData(){
    this.rates = this.rateService.getRateList()
  }

  deleteRate(id: number){
    this.rateService.deleteRate(id)
    .subscribe(
      data =>
      {
        this.reloadData();
      },
      error => console.log(error))
  }

 


}
