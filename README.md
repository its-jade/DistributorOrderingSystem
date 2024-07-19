---

# Distributor Ordering System

This project is a standalone desktop application designed for sales representatives of a beverage distributor. The application allows representatives to log in, manage inventory, add new customers, generate orders, and simulate order submissions, with data stored in JSON format.

## Features

- **User Login**: Secure login for sales representatives.
- **Customer Management**: Add and manage customer information.
- **Inventory Management**: View and update inventory details.
- **Order Creation**: Generate new orders for customers.
- **Data Storage**: Data is stored and managed in JSON files.
- **Standalone Application**: Runs as a desktop application with no web-based elements.

## Project Structure

- `src/main/java/com/example/distributororderingsystem`: Contains Java source files.
  - : Contains controllers for handling UI interactions.
  - : Contains classes for Customer, Order, and Inventory.
- `src/main/resources/com/example/distributororderingsystem`: Contains FXML and CSS files.
  - : Contains FXML files for the UI layout.
- `data`: Directory for storing JSON files (customers.json, orders.json, inventory.json).

## Using the Application

1. **Login**: Enter your credentials to access the system.
2. **Navigate**: Use the left navigation bar to switch between Home, Customers, Orders, Inventory, and Logout.
3. **Add New Customer**: Navigate to the Customers section and fill in the form to add a new customer.
4. **Manage Inventory**: View and update inventory items.
5. **Create Orders**: Navigate to the Orders section to generate new orders.
6. **Logout**: Use the Logout button to safely exit the application.

## JSON Data Management

- **Customers**: Stored in `data/customers.json`.
- **Orders**: Stored in `data/orders.json`.
- **Inventory**: Stored in `data/inventory.json`.

## Acknowledgments

- JavaFX for the UI framework.
- Jackson library for JSON parsing and handling.

---
