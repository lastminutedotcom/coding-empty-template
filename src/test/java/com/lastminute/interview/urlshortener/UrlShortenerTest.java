package com.lastminute.interview.urlshortener;

import org.junit.jupiter.api.*;

class UrlShortenerTest {

  @Test
  void shorten() {
    Assertions.assertEquals(
        "http://short.com/S1", UrlShortener.shorten("http://loooooong.url/any", "S1"));
  }
}
