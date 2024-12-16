# OOP_A2
 
Amusement Park Management System
This project is a comprehensive implementation of Object-Oriented Programming (OOP) concepts, including inheritance, polymorphism, interfaces, collections, and file operations. The system efficiently manages visitors and rides in an amusement park while handling data storage and retrieval.

Project Overview
The project is divided into the following parts:

Inheritance, Polymorphism, and Interface Implementation (Parts 1-2)
Queue and LinkedList Management for Visitor Data (Parts 3-5)
Data Export and Import Operations with Exception Handling (Parts 6-7)
Features
1. Inheritance, Polymorphism, and Interfaces
Inheritance:

The Person class serves as the base class, encapsulating common attributes such as name, age, and contact.
The Employee and Visitor classes inherit from Person and add specific properties:
Employee has job and employeeID.
Visitor has visitDate and visitType.
Polymorphism:

The toString() method is overridden in both Employee and Visitor to dynamically display object-specific details.
Interface Implementation:

The RideInterface interface defines the standard operations for ride management, including:
Adding and removing visitors from a queue.
Managing the ride history.
Running a single ride cycle.
2. Queue and LinkedList Management
Queue Management:

A Queue<Visitor> is used to manage visitors waiting in line for a ride, ensuring First-In-First-Out (FIFO) order.
Methods include:
addVisitorToQueue: Add visitors to the queue.
removeVisitorFromQueue: Remove visitors from the queue.
printQueue: Display all visitors in the waiting line.
Ride History Management:

A LinkedList<Visitor> is used to record all visitors who have completed the ride.
Methods include:
addVisitorToHistory: Add visitors to the history list.
checkVisitorFromHistory: Verify if a visitor exists in the ride history.
printRideHistory: Display all visitors from the ride history.
Running a Ride Cycle:

The runOneCycle method simulates one ride cycle by moving visitors from the waiting queue to the ride history list.
The maximum number of riders per cycle is configurable.
3. Data Export and Import with Exception Handling
Data Export:

The exportRideHistory method writes the ride history to a CSV file using BufferedWriter. Each visitor's details are stored on a separate line.
Data Import:

The importRideHistory method reads the CSV file using BufferedReader and reconstructs Visitor objects, adding them back to the ride history.
Exception Handling:

Comprehensive try-catch blocks ensure file operations handle potential errors, such as file not found or invalid data.
