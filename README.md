# JdbcClient Demo

This project demonstrates the use of the `JdbcClient` utility introduced in Spring Boot 3.2.

## Project outline

- The `GreetingController` class exposes a `GET /foo/greeting` operation, that accepts a `recipientName`
parameter (the name of the recipient to be greeted) and a `recipientKind` parameter (category of the
recipient to be greeted, either `RETAIL` or `BUSINESS`). The `getGreeting(..)` method merely relays
these arguments to the `getGreeting(..)` method of the `GreetingService` class.
- The `GreetingService` class receives the arguments collected by the `GreetingController` class, retrieves
a "greeting format" through the `GreetingFormatDao` class, and finally builds a greeting based on that format
and the input arguments.
- The `GreetingFormatDao` class reads the contents of the `GREETING_FORMAT` SQL table for a format matching
the `recipientKind` provided by the `GreetingService` class, maps the record retrieved to a `GreetingFormat`
object and returns it.
- The `create.sql` and `data.sql` files, within the [resources](src/main/resources) directory, create and fill
the `GREETING_FORMAT` SQL table when the application starts