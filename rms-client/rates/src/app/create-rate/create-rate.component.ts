import { Component, OnInit } from '@angular/core';
import { Rate } from '../rate';
import { RateService } from '../rate.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-rate',
  templateUrl: './create-rate.component.html',
  styleUrls: ['./create-rate.component.css']
})
export class CreateRateComponent implements OnInit {
  rate: Rate = new Rate();

  constructor(private rateService: RateService,
    private router: Router) { }

  ngOnInit(): void {
  }

  newEmployee(): void {
    this.rate = new Rate();
  }

  save() {
    this.rateService.createRate(this.rate)
      .subscribe(data => console.log(data), error => console.log(error));
    this.rate = new Rate();
    this.gotoList();
  }

  onSubmit() {
    this.save();    
  }

  gotoList() {
    this.router.navigate(['/rates']);
  }

}
