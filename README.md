# Shipment-Tracking-API
This is a Java Spring Boot learning project where i create a Api to track Load Shipment For a logistics Company . The API performs all the CRUD Operations with POSTGRES SQL database .

<h1>Technologies</h1>
Java
Spring-Boot
Prostgres SQL
Maeven
Postman

<h1>Dependencies</h1>
Spring-Boot-JBA
Spring-Boot-Postgres SQL
Spring-Boot-Web

<h1>API Operations</h1>
<li>GET url/load</li>
![image](https://github.com/com-Abhijeet/Shipment-Tracking-API/assets/96511266/74af42dc-8832-45ab-a7b1-709d87877ed0)

<li>Get url/load/{loadId}</li>
![image](https://github.com/com-Abhijeet/Shipment-Tracking-API/assets/96511266/23e54136-8e81-4cb9-8c55-4a68890d3673)

Post url/load
body
{
  "loadId":1015,
	"loadingPoint": "Delhi",
	"unloadingPoint": "Mumbai",
	"productType": "Food",
	"truckType": "Lorry",
	"noOfTrucks": "4",
	"weight": "562",
  "optional":"comment: Payment pending",
	"shipperId" :1075,
	"date" : "24-07-2023"
}
![image](https://github.com/com-Abhijeet/Shipment-Tracking-API/assets/96511266/cd7ba1cc-aecc-4c14-a9c3-30e3bc53d76c)





