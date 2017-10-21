import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserService } from '../../service/user.service';
import { User } from '../../user';

@Component({
  selector: 'app-list-user',
  templateUrl: './list-user.component.html',
  styleUrls: ['./list-user.component.css']
})
export class ListUserComponent implements OnInit {

  private users:User[];

  constructor(private _userService:UserService, private _router:Router) { }

  ngOnInit() {
    this._userService.getUsers().subscribe((users) =>{
      console.log(users);
      this.users=users;
    }, (erro) => {
      console.log(erro);
    });
  }
  deleteUser(user){
    this._userService.deleteUse(user.id).subscribe((data) => {
      this.users.splice(this.users.indexOf(user), 1);
    },(erro) => {
      console.log(erro);
    });
  }
  updateUser(user){
    this._userService.setter(user);
    this._router.navigate(['/user']);

  }
  newUser(){
    let user = new User(); 
    this._userService.setter(user);
    this._router.navigate(['/user']);

  }

}
