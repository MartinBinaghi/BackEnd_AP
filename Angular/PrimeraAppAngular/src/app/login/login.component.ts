import { Component, OnInit } from '@angular/core';
import {Router, ActivatedRoute} from '@angular/router';
import {AuthService} from '../auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class loginComponent implements OnInit {

  email = '';
  password = '';

  constructor(private authService: AuthService) {}

  Login(){
    this.authService.login(this.email, this.password)
  }

  ngOnInit(): void {}
}
