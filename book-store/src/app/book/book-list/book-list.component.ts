import {Component, OnInit} from '@angular/core';
import {Book} from '../../../model/Book';
import {BookService} from '../../../service/book.service';

@Component({
  selector: 'app-book-list',
  templateUrl: './book-list.component.html',
  styleUrls: ['./book-list.component.css']
})
export class BookListComponent implements OnInit {
  bookList: Book [] = [];

  constructor(private bookService: BookService) {
  }

  ngOnInit(): void {
    this.getAll();
  }

  getAll() {
    this.bookService.getAll().subscribe(bookList => {
      this.bookList = bookList;
    });
  }
}
