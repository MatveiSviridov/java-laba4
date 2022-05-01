package com.laba4;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ReaderTest {

    @org.junit.jupiter.api.Test
    void reader() throws IOException {
        assertNotEquals(null, Reader.reader("C:\\Users\\Матвей\\Documents\\foreign_names.csv"));
    }
}