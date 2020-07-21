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
City Test data for testing application

* Boston,New York
* Philadelphia,Newark
* Newark,Boston
* Trenton,Albany
* New York,Atlanta
* Atlanta,Chicago
* Detriot,Lexington
* Detriot,Albany
* Chicago,Mason
* Albany,Lexington	

City.txt content file is always avilable under "Resource" folder.

![city_texr_data](https://user-images.githubusercontent.com/62044788/88000823-a5adee80-cacc-11ea-8ee0-c3c44dcfb1ba.JPG)


## Road Connectivity Map w.r.t sample city.txt
![road_connect](https://user-images.githubusercontent.com/62044788/88000812-9fb80d80-cacc-11ea-8826-b3a84b1f0ecf.JPG)


# Running the Application
Use Road Spring Boot Application class to launch application from eclipse.

# Launch / Screenshots
You can launch the application at http://localhost:8080 from Browser
and modify url to check connectivity between source city and destination as
http://localhost:8080/connected?origin=Boston&destination=Newark

# Browser output

### USE CASE - 1

### Testing connectivity between "Boston" and "Newark"
Expectec Result : Yes 

http://localhost:8080/connected?origin=Trenton&destination=Lexington
![MSYes1](https://user-images.githubusercontent.com/62044788/88000866-bb231880-cacc-11ea-970c-852355f023fa.JPG)

### Visualization of connectivity between "Trenton" and "Lexington"
### Road Connectivity between Trenton and Lexington w.r.t sample city.txt
![MSYes1_Map](https://user-images.githubusercontent.com/62044788/88000888-c413ea00-cacc-11ea-8025-5bd1a51b6c74.JPG)

### USE CASE - 2
### Testing connectivity between "Boston" and "Mason"
Expectec Result : Yes 

http://localhost:8080/connected?origin=Boston&destination=Mason
![MSYes2](https://user-images.githubusercontent.com/62044788/88000901-cbd38e80-cacc-11ea-9e94-b6bf790801aa.JPG)

### Visualization of connectivity between "Boston" and "Mason"
### Road Connectivity between Boston and Mason w.r.t sample city.txt
![MSYes2_Map](https://user-images.githubusercontent.com/62044788/88000911-d0984280-cacc-11ea-85c2-e5f1cc2ad150.JPG)


### USE CASE - 3
### Testing connectivity between "Boston" and "Lexington" 
Expected Result : NO (Not connected) 


http://localhost:8080/connected?origin=Boston&destination=Lexington
![MSNo2](https://user-images.githubusercontent.com/62044788/88001119-5d430080-cacd-11ea-8f94-487e36d714ec.JPG)

### Road Connectivity between Boston and Lexington w.r.t sample city.txt
![MSNo2_Map](https://user-images.githubusercontent.com/62044788/88001124-6338e180-cacd-11ea-9932-2b449f9d492f.JPG)











  
  
  
