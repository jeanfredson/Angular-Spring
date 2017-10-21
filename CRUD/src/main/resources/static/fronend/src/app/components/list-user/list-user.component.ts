import { Component, OnInit } from '@angular/core';
import { UserService } from '../../service/user.service';
import { User } from '../../user';

@Component({
  selector: 'app-list-user',
  templateUrl: './list-user.component.html',
  styleUrls: ['./list-user.component.css']
})
export class ListUserComponent implements OnInit {

  private users:User[];

  constructor(private _userService:UserService) { }

  ngOnInit() {
    this._userService.getUsers().subscribe((users) =>{
      console.log(users);
    }, (erro) => {
      console.log(erro);
    });
  }

}
