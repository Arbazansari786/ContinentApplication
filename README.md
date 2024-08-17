Develop a Spring Boot application to:
Consume the JSON data from this API: https://dummy-json.mock.beeceptor.com/continents
Store the fetched data in a database of your choice (e.g., H2, MySQL, PostgreSQL).

Submission:-
Spring REST
Spring Data JPA: For database interaction.
Lombok: To reduce boilerplate code for POJOs.
MYSQL Database: for development and testing.
Maven: Dependency management and build tool.

API EndPoints
Fetch Continents

URL: GET /fetch
Description: Fetches continent data from an external source and saves it to the database.
Response: Returns an ApiResponse object with a success message and saved data.

Error Handling
==============
In case of failure during saving, the application throws a ContinentSaveException which is handled by a global exception handler.
The error response will include the exception message and a success: false flag.

