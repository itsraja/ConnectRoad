# ConnectRoad Code Challenge
MS Code Challenge (Home assignment)

# Problem Statement
Write a Spring Boot Application which determines if two cities are connected. Two cities are considered
connected if there’s a series of roads that can be traveled from one city to another in either direction.

List of roads is available in a file. The file contains a list of city pairs (one pair per line, comma separated), 
which indicates that there’s a road between those cities.

Program should respond with ‘yes’ if city1 is connected to city2, ’no’ if city1 is not connected to city2.
Any unexpected input should result in a ’no’ response.

# For Example:
city.txt content is:
Boston, New York
Philadelphia, Newark
Newark, Boston
Trenton, Albany


http://localhost:8080/connected?origin=Boston&destination=Newark
Should return yes

http://localhost:8080/connected?origin=Boston&destination=Philadelphia
Should return yes

http://localhost:8080/connected?origin=Philadelphia&destination=Albany
Should return no

# Development Stack
1. Spring boot web initializer 
2. Eclipse
3. Embeded Tomcat
4. Java 1.8

# Assumptions
City.txt file is always avilable under Resource folder.

![MS](https://user-images.githubusercontent.com/62044788/87993274-18f93580-cab8-11ea-80d3-b50a9e30c9c3.JPG)


# Running the Application
Use Road Spring Boot Application class to launch application from eclipse.

# Launch / Screenshots
You can launch the application at http://localhost:8080 from Browser
and modify url as below to verifiy the road connectivity.
http://localhost:8080/connected?origin=Boston&destination=Newark

![MSYes](https://user-images.githubusercontent.com/62044788/87994768-ca4d9a80-cabb-11ea-8ba0-3a44ad17d466.JPG)

http://localhost:8080/connected?origin=Atlanta&destination=Albany
![MSYes2](https://user-images.githubusercontent.com/62044788/87994833-ee10e080-cabb-11ea-8571-1ec8250520d1.JPG)










  
  
  
