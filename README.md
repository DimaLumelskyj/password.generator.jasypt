
<h1 align="center">
  <img src="encrypt.svg" alt="Jasypt data encryption REST API" width="200">
  <br>
  Disease history data grabber
</h1>

# Description
This project is a rest api with endpoints to encrypc and decrypt text.

Application features: 
- Jasypt encryptor/decryptor library used.
- As an core algorithm is used ```PBEWithHMACSHA512AndAES_256```.

# Endpoints
The program consists of the two endpoints:

```
text/decrypt?secret=SECRET-PASSWORD-VALUE&text=TEXT-FOR-DECRYPTION
```

```
text/encrypt?secret=SECRET-PASSWORD-VALUE&text=TEXT-FOR-ENCRYPTION
```

# Output result
Sample output result:
<table style="margin-left: auto; margin-right: auto;" border="1"><tbody><tr><td>Secret password</td><td>@x8HcZsUlfdE</td></tr><tr><td>Decrypted text</td><td>@Java2019</td></tr><tr><td>Encrypted text</td><td>O8PUiDHzgAKmzQpKap+zxqnltgfMhxpI373/nnhghxjLuMJHyOuV8ya9tG9QM0TX</td></tr></tbody></table>


# Description of the repository files
- SRC\controller: configuration classes to set up scheduler runner and locale  
- SRC\dto: dto mapping class
- SRC\service: service classes
- SRC\util: utility classes with encrypting-decrypting implementation
 
## Resources
- application.properties basic app setup:
    - ```jasypt.algorithm``` - default encryption/decryption algorithm is ```PBEWithHMACSHA512AndAES_256```

# Getting Started

That guidance will get you a copy of the project up and running on your local machine for development and experimentation purposes.

### Prerequisites

```
Java JDK (8+)
Maven
Git
Lombok plugin for IDEA
```

### Installing

Cloning project

```
git clone https://github.com/DimaLumelskyj/COVID19-Data-Grabber.git
```

## Deployment

This Spring Boot application can be started in a few ways

Using IDEA

```
Run the main method from Covid19 data scrapper application (Covid19Application.main())
```

Packaging the application as a JAR and run it
```
mvn clean package && java -jar target/covid19-0.0.1-SNAPSHOT.jar
```

Using Maven Spring Boot plugin
```
mvn spring-boot:run
```


## Author
* [Dmytro Lumelskyj] 

Icon made by <a href="https://www.flaticon.com/authors/freepik">Freepik</a> from www.flaticon.com
