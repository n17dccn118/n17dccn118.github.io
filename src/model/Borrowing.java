package model;

import java.util.ArrayList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Welcome
 */
public class Borrowing {
    private int id;
    private Reader reader;
    private ArrayList<BookState> bookState = new ArrayList<>();

    public Borrowing() {
    }

    public Borrowing(int id, Reader reader, ArrayList<BookState> bookState) {
        this.id = id;
        this.reader = reader;
        this.bookState = bookState;
    }
    
    public void addFromKeyBoard(Reader reader, BookState bookState){
        this.bookState.add(bookState);
        this.reader = reader;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public ArrayList<BookState> getBookState() {
        return bookState;
    }

    public void setBookState(ArrayList<BookState> bookState) {
        this.bookState = bookState;
    }
    
    
}
