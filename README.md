# WishList Management API

WishList Management API is a Java application built using Maven and the Spring Boot framework. It incorporates Spring Security for JWT authentication to manage wishlist-related operations securely.

## Frameworks and Language Used

- Java: The primary programming language used for developing the application.
- Maven: A build automation tool and dependency management tool used for managing the project's dependencies and building the application.
- Spring Boot: A powerful and widely used framework for building Java-based enterprise applications. It provides features like inversion of control, dependency injection, and seamless integration with various other libraries.
- Spring Security: A framework that provides comprehensive security services for Java EE-based enterprise software applications.

### MyUserController

I have implemented controllers for user operations. The provided APIs include:
1. `POST /api/user/`: To register a new myUser.
2. `POST /api/user/login`: To authenticate a user and generate a JWT token.

 ### MyUserController
 I have implemented controllers for  wishlist operations. The provided APIs include:
1. `POST /api/wishlistMyUser/item`: To add wishlist item for a myUser.
2. `DELETE /api/wishlistMyUser/item`: To delete wishlist item by id.
3. `GET /api/wishlistMyUser/Myuser`: To retrieve all wishlist items of myUser.


### Services

The services layer contains business logic for wishlist and customer related operations. It acts as an intermediary between the controllers and the repository, encapsulating complex functionalities.

### Repository

The repository layer is responsible for data access and manipulation. It communicates with the database and performs CRUD (Create, Read, Update, Delete) operations on the User and Wishlist entity.


## Project Summary

TheWishList Management API is an authenticated system where users can register, log in, and perform various operations on their wishlist securely like add wishlist , get all wishlist and delete wish list. JWT authentication is employed to ensure secure access to wishlist endpoints. The application provides functionality for registering users, logging in.


# Database Structure Used
I have used MySql as Database.


For questions or feedback, please contact : Dharmendra Singh Shekhawat  
- Maild Id : dharmendrashekhawat1403@gmail.com

<h1 align="center">Thank You...<h1>
<h3 align = "center"> ***********************************************************<h3>

