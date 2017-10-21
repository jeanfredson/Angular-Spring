import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ListUserComponent } from './components/list-user/list-user.component';
import { UserComponent } from './components/user/user.component';
/*Verificação*/
import { UserService } from './service/user.service';
import { HttpModule } from '@angular/http';

const routes: Routes = [
  { path: 'listUser', component:ListUserComponent},
  { path: 'user', component: UserComponent },
  {path: '', pathMatch:'full', redirectTo:'dashboard'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
