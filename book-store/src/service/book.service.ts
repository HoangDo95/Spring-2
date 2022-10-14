import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {environment} from '../environments/environment';
import {Book} from '../model/Book';

const URL_BOOK = `${environment.apiUrl}`;

@Injectable({
  providedIn: 'root'
})
export class BookService {

  constructor(private httpClient: HttpClient) {
  }

  getAll(page: number, nameSearch: string, size: number): Observable<Book[]> {
    return this.httpClient.get<Book[]>(URL_BOOK + 'page?page=' + page + '&name=' + nameSearch + '&size=' + size);
  }

  getAllB(): Observable<Book[]> {
    return this.httpClient.get<Book[]>(URL_BOOK + 'listB');
  }
}
