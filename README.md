# House Moving App

A Spring Boot application for providing house moving estimates and handling customer quote requests. The backend exposes REST APIs for calculating moving cost estimates and managing customer quotes.

---

## Features

* Calculate moving cost estimates based on house size and distance.
* Submit and store customer quotes.
* Retrieve all submitted quotes.
* MySQL database integration.
* RESTful API endpoints.
* Optional Thymeleaf frontend for server-side rendering.

---

## Tech Stack

* **Backend:** Java, Spring Boot, Spring Data JPA
* **Database:** MySQL
* **Frontend:** HTML, JavaScript (Fetch API) / Thymeleaf (optional)
* **Build Tool:** Maven

---

## Project Structure

```
moveapp/
 ├── src/main/java/com/house/moveapp
 │    ├── MoveappApplication.java
 │    ├── controller/
 │    │    ├── EstimateController.java
 │    │    └── QuoteController.java
 │    ├── model/
 │    │    ├── Customer.java
 │    │    └── QuoteRequest.java
 │    ├── repository/
 │    │    ├── CustomerRepository.java
 │    │    └── QuoteRepository.java
 │    └── service/
 │         ├── EstimateService.java
 │         ├── QuoteService.java
 │         └── impl/
 │               ├── EstimateServiceImpl.java
 │               └── QuoteServiceImpl.java
 └── src/main/resources/
      ├── application.properties
      └── templates/  (optional Thymeleaf templates)
```

---

## Database Setup

1. Create a database in MySQL:

```sql
CREATE DATABASE moveapp;
```

2. Configure your MySQL credentials in `src/main/resources/application.properties`:



## API Endpoints

### Estimate

* **GET** `/api/estimate?houseSize=2BHK&distanceMiles=15`
* Returns the estimated price for a move.

### Quotes

* **POST** `/api/quotes`

  * Body: JSON with customer details, house size, addresses, moving date, and instructions
  * Example:

```json
{
  "pickupAddress": "123 Main St",
  "dropAddress": "456 Oak St",
  "houseSize": "2BHK",
  "movingDate": "2025-12-01",
  "instructions": "Handle with care",
  "customer": {
    "name": "John Doe",
    "email": "john@example.com",
    "phone": "1234567890"
  }
}
```

* **GET** `/api/quotes`

  * Returns all submitted quotes.

---

## Running the Application

1. Build the project using Maven:

```bash
mvn clean package
```

2. Run the Spring Boot application:

```bash
java -jar target/moveapp-0.0.1-SNAPSHOT.jar
```

3. Access APIs at `http://localhost:8080`.

---

## Frontend

* Optional: Use **Thymeleaf** templates or plain HTML + JS Fetch API to call the backend APIs.
* Example for submitting quotes via JS:

```javascript
fetch('/api/quotes', {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify(quoteData)
})
.then(res => res.json())
.then(data => console.log(data));
```

---

## License

This project is open-source and available under the MIT License.
