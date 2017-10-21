import { Injectable } from '@angular/core';
import { Http, Response, Headers, RequestOptions} from '@angular/http';
import { Observable } from 'rxjs/Observable';
import { User } from '../user';

import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import 'rxjs/add/observable/throw';


@Injectable()
export class UserService {

  private baseUrl:string='http://localhost:8080/api';
  private headers = new Headers({'content-Type':'application/json'});
  private option = new RequestOptions({headers:this.headers});
  private user = new User();

  constructor(private _http:Http){}

  getUsers(){
    return this._http.get(this.baseUrl+'/users', this.option).map((response:Response)=> response.json())
      .catch(this.erroHandler);
  }
  getUse(id:Number){
    return this._http.get(this.baseUrl+'/user/'+id, this.option).map((response:Response)=> response.json())
      .catch(this.erroHandler);
  }
  deleteUse(id:Number){
    return this._http.get(this.baseUrl+'/user/'+id, this.option).map((response:Response)=> response.json())
      .catch(this.erroHandler);
  }
  createUser(user:User){
    return this._http.post(this.baseUrl+'/user', JSON.stringify(user), this.option).map((response:Response)=> response.json())
      .catch(this.erroHandler);
  }
  updateUser(user:User){
    return this._http.put(this.baseUrl+'/user', JSON.stringify(user), this.option).map((response:Response)=> response.json())
      .catch(this.erroHandler);
  }
  erroHandler(erro:Response){
    return Observable.throw(erro || "SERVER ERRO");
  }

  setter(user:User){
    this.user=user;
  }
  getter(){
    return this.user;
  }

}
