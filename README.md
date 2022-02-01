# Url Shortener

Basically a URL shortener is a service to generate, retrieve and delete short URLs mapped to real URLs like goo.gl and bit.ly.  
We will need a couple of features in our shortener.  
Let's assume we are working on a library to be reused in other projects.

## 1. Shorten a URL with a custom keyword
The first feature that our product experts think we need is the generation of a short URL where the user shorten a URL choosing a specific "keyword" to bind to the URL.    
We want the user to give in input:
- the URL he wants to shorten
- a custom keyword

And we want the system to give back to the user his short URL.
The base URL for short urls will always be http://short.com.

Here is some example:
* example 1
  * input URL: http://looooong.com/somepath/newService
  * input keyword: S1
  * expected output: http://short.com/S1

* example 2
  * input URL: https://anotherlong.com/anypath/my-page
  * input keyword: P1
  * expected output: http://short.com/S2
  

## 2. Retrieve a shortened URL 
Now that our users are able to generate short URLs, we need to give them the possibility to get back the original one.
We want the user to input:
* a shortened URL

And to receive in output:
* the original URL

Example
* input URL: http://short.com/S1
* expected output: http://looooong.com/somepath/newService


## 3. Validate the keyword
We discovered that users tend to chose keyword too long or too short, so we want to enforce some constraint: keyword length must be between 4 and 15 chars.


## 4. Generate a random shortened URL
We discovered that actually part of our users do not like to input a keyword, they would prefer to have an auto-generated one.  
So, we want the user to give in input:
- a URL

And to receive in output:
- a short URL made of 4 random alphanumeric characters

Example:
- input URL: http://some.domain.com/somepath
- output URL: http://short.com/ZfG3

Remember, this is something that only part of the users will need, not all of them.


## 5. A different way for generating short URLs
We want to test a different way for generating the keywords.  
We want the user to give in input:
- a URL

And to receive in output:
- a short URL made of an incremental integer from 1 to N

Examples:
- example 1:
  - input URL: http://some.domain.com/somepath
  - output URL: http://short.com/1

- example 2:
  - input URL: https://anotherlong.com/anypath/myPage
  - output URL: http://short.com/2

Remember, this is an experiment, we need in some way to have both the ways implemented.
