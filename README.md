# workfoce-optimizer
This tool optimizes the given work force based on the workload

**Start the application**

Start the application from Application class which will bring up the Spring Boot application.

**Optimize**

  Returns a array of maps which include the optimal number of Juniors and Seniors cleaners for every structure

* **URL**

  /optimize/

* **Method:**

  `POST`
  
* **Data Params**

     - name: rooms <br />
      description: A array of numbers representing the number of rooms in a structure  <br />
      required: true  <br />
      type: array <br />
      items: <br />
      &nbsp;&nbsp;&nbsp;&nbsp; type: integer   
   
     - name: senior <br />
       description: A number representing the work capacity of senior cleaners  <br />
       required: true  <br />
       type: integer  <br />
       
     - name: junior  <br />
       description: A number representing the work capacity of junior cleaners  <br />
       required: true  <br />
       type: integer  <br />
       
      
* **Success Response:**

  * **Code:** 200 <br />
    **Content:** `[
    {
        "senior": 3,
        "junior": 1
    },
    {
        "senior": 1,
        "junior": 2
    },
    {
        "senior": 2,
        "junior": 0
    },
    {
        "senior": 1,
        "junior": 3
    }
]`

* **Sample Call:**

```
POST /optimize/ HTTP/1.1
Host: localhost:8080 
Content-Type: application/json 
cache-control: no-cache <br />
Postman-Token: 4b9e747a-d0a4-4b27-986b-58445cd6a669 
 { "rooms": [35, 21, 17, 28], 
	"senior": 10, 
	"junior": 6 
 } 
  ```
