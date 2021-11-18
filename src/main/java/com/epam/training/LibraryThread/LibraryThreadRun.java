package com.epam.training.LibraryThread;


import com.epam.training.LibraryThread.classes.BookLibrary;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public class LibraryThreadRun {

    static Logger myLogger = LogManager.getLogger(LibraryThreadRun.class.getName());

    public static void main(String[] args) throws IOException {
        myLogger.info("Application started");
        int booksFreeCount = 5;
        int booksByReadyRoomCount = 5;
        int peoplesCount = 10;

        BookLibrary bookLibrary = new BookLibrary(booksFreeCount, booksByReadyRoomCount, peoplesCount);

        try {
            bookLibrary.startWorkLibrary();

        } catch (InterruptedException e) {
            e.printStackTrace();
            myLogger.error(e.getMessage());
        }

        myLogger.info("Application stopped");
    }
}
