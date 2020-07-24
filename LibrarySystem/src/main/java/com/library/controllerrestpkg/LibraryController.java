package com.library.controllerrestpkg;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.library.modelpkg.Book;
import com.library.service.LibraryService;


@RestController
public class LibraryController {
	@Autowired
	private LibraryService libService;
	
	@GetMapping(value = "/")
	public String hello() {
		return "Hello World";
	}
	@GetMapping("/findAllBooks")
	public Collection<Book> getAllBooks(){
		return libService.findAllBooks();
	}
	@GetMapping("/delete")
	public void deleteBook(@RequestParam long id) {
		libService.delete(id);
	}
	/*@PostMapping("/addbook")
	public void addBook(@RequestBody Book book ) {
	libService.addBook(book);
	}*/
	
}
