package com.library.service;

import com.library.repository.Bookrepo;

public class BookSer {

    private Bookrepo repository;

    
    public void setRepository(Bookrepo repo) {
        this.repository = repo;
    }

    public void issueBook() {
        System.out.println("Bookservice start");

        if (repository != null) {
            repository.showRepositoryStatus();
        } else {
            System.out.println("Repo is not available.");
        }
    }
}