# Spring Practice

Just a repository with which to study basic concepts of the Spring framework.

## Assignment 1

Demonstrate dependency injection by each of the following:

* Java configuration
* XML
* Annotations (e.g., `@Autowired`)

Rather than make a bunch of folders for each of these, much less repositories, I 
decided to take advantage of the commit history. These are the pertinent commit 
history labels:

* Java configuration: "Practicing dependency injection through AppConfig"
* XML: "Changing over to XML dependency injection"
* Annotations: "Switching over to dependency injection by annotations"

These are in chronological order.

## Assignment 2

Create two "RESTful APIs." I'm going to make one of them in this project, the 
other maybe in another project.

In MySQL, I created a table thus:

``` SQL
 CREATE TABLE students (
       id              INT unsigned NOT NULL 
                           AUTO_INCREMENT, 
       name            VARCHAR(150) NOT NULL,                
       phoneA          VARCHAR(40) NOT NULL,
       phoneB          VARCHAR(40),
       phoneC          VARCHAR(40),
       address         VARCHAR(300) NOT NULL,
       PRIMARY KEY     (id)
 );
```
