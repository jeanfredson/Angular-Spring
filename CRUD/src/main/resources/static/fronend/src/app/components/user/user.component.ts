import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FormsModule } from '@angular/forms';

import { UserService } from '../../service/user.service';
import { User } from '../../user';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {
  private user:User;

  constructor(private _userService:UserService, private _router:Router) { }

  ngOnInit() {
  }

  form(){
    if(this.user.id == undefined){
      this._userService.createUser(this.user).subscribe((user) => {
        console.log(user);
        this._router.navigate(['/']);
      }, (erro) => {
        console.log(erro);
      });
    }else{
      this._userService.updateUser(this.user).subscribe((user) => {
        console.log(user);
        this._router.navigate(['/']);
      }, (erro) => {
        console.log(erro);
      });
    }
  }

}
