package com.lastminute.interview.urlshortener;

import org.junit.*;
import org.junit.jupiter.api.Test;

class UrlShortenerTest {

  @Test
  void shorten() {
    Assert.assertEquals(
        "http://short.com/S1", UrlShortener.shorten("http://loooooong.url/any", "S1"));
  }
}
