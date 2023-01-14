This repo is all about RESTful API using Spring Boot

< What is RESTful API? >
REST, an abbreviation of Representational State Transfer, is an architecture that can properly utilize the advantages of the web and the excellence of HTTP. It means that a resource is specified through an HTTP URI and the CRUD operation (Four basic actions that a software program should be able to do including Create, Read, Update, and Delete) of the specified resource is applied through an HTTP method (POST, GET, PUT, DELETE).
Therefore, REST may be thought of as an architecture made up of Resources, Verbs, and Representations. The use of REST increases code reusability and allows for a complete separation of work between the frontend and the backend.

< Representation in HTTP? >
For example, there's request & response from the server as below.

  - Client Request Example:
  GET https://example.org/greeting --
  Host: example.org --
  Accept: text/plain, text/html; q=0.9 *; q=0.1 --
  Accept-Language: en, ko; q=0.9, *; q=0.1
  
  - Server Response Example: 
  HTTP/1.1 200 OK --
  Content-Length: 6 --
  Date: Sat, 14 Jan 2023 10:20:47 GMT --
  Last-Modified: Sat, 14 Jan 2023 00:00:07 GMT --
  Content-Type: text/plain --
  Content-Language: en --
  "My name is Miso"
  
When a resource transfer request is received via Get Request, the server delivers one representation of the target resource.
"Representation" refers to data that represents the condition of a resource at a certain moment in time. One representation is made up of representation data and metadata. 
From Above Request-Response example, "My name is Miso" is representation data in the above example, while "Content-Type: text/plain" and "Content-Language: en" are representation metadata.

The acronym REST stands for REpresentational State Transfer. "State" refers to the current state of the web application, while "Transfer" refers to the Transmission rather than State Transition of Website.

Consider the use of a web browser to view a website. When a user on web page A clicks a link to web page B, the web browser renders the web page B indicated by the link.
In the preceding scenario, what is a web application? A program that links a web browser and a web server in order to deliver resources to users. A web server itself is not a web application, but it becomes one when a web browser connects to a web server. 

When two users connect to the same web server using different web browsers, two web apps are running.
By clicking on the link, the browser's page switches from A to B. That is, the web application's state has changed. This state transition was also accomplished through the transfer of representatives. This is why it's called REpresentational State Transfer.

There are two things to keep in mind here.
First point: a transfer is not the same as a state Transfer(transition). When a user clicks on a link, the state of the web application changes, but Transfer refers to a transfer between network components, not that transition. In this case, it refers to the transfer(transmission) of web pages from the server.
Second point: Although both the state of a resource and the state of an application are conveyed by the same word "state," they are fundamentally distinct. Previously, representation was defined as "information that represents the condition of a certain resource at a specific point in time." It refers to the status of the resource, not the application. The application's state refers to the point at which the web application transitioned from rendering web page A to rendering web page B.

< Features of REST API >
REST architecture has the following characteristics.

  (1) Uniform Interface: 
  It is an architectural style that performs operations on resources specified by URI through a unified and limited interface. It can be used on all platforms that follow the HTTP standard protocol.

  (2) Stateless: 
  It simplifies implementation as it only needs to process requests without storing or managing state information (cookies, sessions) for tasks.

  (3) Cacheable:
  As it uses the web standard protocol as it is, it can utilize the existing infrastructure and can use the caching function.

  (4) Self-descriptiveness:
  It offers a framework for self-expression that can be easily understood by reading REST API messages.

  (5) Client-Server:
  Mutual reliance is reduced because the roles of the server that has the resource and the client that requests the resource are clearly distinguished.
   - Server: Provides API and is responsible for processing and storing business logic
   - Client: Directly manages and is responsible for user authentication or status information

  (6) Layered System:
  A REST server can be composed of multiple layers, and can have structural flexibility by adding security, load balancing, and encryption layers, and can use network-based intermediate media such as PROXY and gateway.
