# Event Planner

#### Mar 29 2017. v.1.0

#### By _Liam Stabeno_

## Description

This is an event planner.  It will ask the user questions as to what kind of event they want to have.  Given the inputs the event planner will calculate a cost for the event.

## Specifications

Behavior|Input|Output
---|---|---
Asks user how many guests they have|"200"| 200
Asks user what drink option they wish for| "4" | 4
Asks user what food option they wish for| "3" | 3
Asks user what entertainment option they wish for| "1" | 1
If criteria met will present a coupon code to user | Event(200,4,3,1) |You qualify for a coupon enter 200S at the prompt for a discount
Prompts user to enter a coupon code | 200S | You'll receive a $1500 discount
Presents user with total cost of even | Event(200,4,3,1) coupon code = 200S| Thank you your event will cost $19000

## Setup/Installation Requirements
```
cd /desiredLocation
```
```
git clone https://github.com/MLiamS/event-planner
```
```
cd /eventPlanning/src/main/java
```
```
javac app.java
```
```
java app
```

## Know Bugs

Coupons are currently not working...


## contact details

LiamStabeno@gmail.com

## Technologies Used

* Java
* Java libraries



### License

*This software is licensed under the MIT license.*

Copyright (c) 2017 Liam Stabeno
