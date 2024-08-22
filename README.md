# Makersharks Search API
## Overview
Makersharks is building a search page where buyers can search for manufacturers based on their customized requirements. This project is a proof of concept (POC) for the search API, which allows users to filter manufacturers by location, nature of business, and manufacturing processes.

## Features
- Retrieve manufacturers based on location, nature of business, and manufacturing processes.
- Pagination support for large result sets.
- Input validation and sanitization.
  
## Technologies Used
- **Spring Boot** for application framework
- **Spring Data JPA** for data persistence
- **MYSQL Database** for database

## Prerequisites
- **Java 17** or higher
- **Maven** for project management and build
- **Git** for version control 
- **Postman** for testing the API

## Getting Started

### Clone the Repository
```bash
git clone https://github.com/your-username/makersharks-search-api.git
cd makersharks-search-api


**BUILD THE PROJECT**
mvn clean install

**RUN THE APPLICATION**
mvn spring-boot:run

**Access the API**
By default, the application runs on http://localhost:8080


**POST /api/supplier/query**
Content-Type: application/json
{
    "location": "India",
    "natureOfBusiness": "small_scale",
    "manufacturingProcesses": "3d_printing",
    "page": 0,
    "size": 5
}
