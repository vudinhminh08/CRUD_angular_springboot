import { Component, OnInit } from '@angular/core';
import {UserService} from "../service/user.service";
import {User} from "../model/user";
import {HttpClient} from "@angular/common/http";
import {DialogModule} from 'primeng/dialog';


@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.scss']
})
export class UserComponent implements OnInit {
  users?: User[];
  selectedUser: User;
  displayModal: boolean = false;
  isAdd = false;

  constructor(private userService: UserService, private http: HttpClient ) {
    this.selectedUser = new User();
  }
 //GET REQUEST
  ngOnInit(): void {
    this.userService.getUsers().subscribe((data:User[]) => {
      this.users = data;
    });
  }
  //POST REQUEST
  onUserRegister(user: User) {
    this.http.post('http://localhost:8082/qlSv', user).subscribe((res) => {
      console.log(res);
    });
  }
  showModalDialog() {
    this.isAdd = true;
    this.displayModal = true;
    this.selectedUser = new User();
  }

  modifyModalDialog(user: User) {
    this.isAdd = false;
    this.displayModal = true;
    this.selectedUser = user;
  }
  // deleteDialog(user: User) {
  //   this.selectedUser = user;
  //   const temp = this.selectedUser.mssv + "";
  //   this.http.delete('http://localhost:8082/qlSv/' + temp).subscribe( data => {
  //     console.log(data);
  //   });
  // }
  deleteDialog(user: User) {
    this.selectedUser = user;
    const temp = "" + this.selectedUser.maSv;;

    this.userService.deleteData(temp, this.selectedUser);
  }


  // updateUser(user: User) {
  //     this.userService.updateUser(user).subscribe((res) => {
  //       console.log(res);
  //     });
  // }

  submitData(userForm: any) {
    console.log(this.selectedUser);
    console.log(userForm);
    if(this.isAdd) {
      this.onUserRegister(this.selectedUser);
    }
    else {
      const temp = "" + this.selectedUser.maSv;;

      this.userService.updateUser(temp, this.selectedUser);
    }
    this.displayModal=false;
  }
}
