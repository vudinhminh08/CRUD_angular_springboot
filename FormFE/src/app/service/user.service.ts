import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import { User} from "../model/user";
const baseUrl = "http://localhost:8082/qlSv";
@Injectable({
  providedIn: 'root'
})

export class UserService {


  constructor(private http: HttpClient) { }

  getUsers(): Observable<User[]>{
    return this.http.get<User[]>(`${baseUrl}`);
  }
  get(mssv: number): Observable<User> {
    return this.http.get(`${baseUrl}/${mssv}`);
  }

  updateUser(mssv: string, value: User){
    return this.http.put(`${baseUrl}/${mssv}`, value).subscribe();
  }
  createUser(data: any): Observable<any> {
    return this.http.post(baseUrl, data);
  }
  deleteData(mssv : string, value: User) {
    return this.http.delete(`${baseUrl}/${mssv}`).subscribe();
  }
}
