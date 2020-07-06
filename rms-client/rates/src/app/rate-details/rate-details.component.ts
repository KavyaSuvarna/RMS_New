import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { RateService } from '../rate.service';
import { Rate } from '../rate';

@Component({
  selector: 'app-rate-details',
  templateUrl: './rate-details.component.html',
  styleUrls: ['./rate-details.component.css']
})
export class RateDetailsComponent implements OnInit {
  id: number;
  rate: Rate;

  constructor(private route: ActivatedRoute,private router: Router,
    private rateService: RateService) { }

  ngOnInit(): void {
    this.rate = new Rate();

    this.id = this.route.snapshot.params['id'];
    
    this.rateService.getRate(this.id)
      .subscribe(data => {
        console.log(data)
        this.rate = data;
      }, error => console.log(error));
  }

  list(){
    this.router.navigate(['rates']);
  
  }

}
