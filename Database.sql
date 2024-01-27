-- Create User table
CREATE TABLE User (
    user_id INT PRIMARY KEY,
    username VARCHAR(50),
    password VARCHAR(50),
    email VARCHAR(100),
    balance DECIMAL(10, 2)
);

-- Create Stock table
CREATE TABLE Stock (
    stock_id INT PRIMARY KEY,
    stock_name VARCHAR(100),
    stock_symbol VARCHAR(10),
    current_price DECIMAL(10, 2)
);

-- Create Transaction table
CREATE TABLE Transaction (
    transaction_id INT PRIMARY KEY,
    user_id INT,
    stock_id INT,
    transaction_type VARCHAR(4), -- 'buy' or 'sell'
    quantity INT,
    price DECIMAL(10, 2),
    date DATE,
    FOREIGN KEY (user_id) REFERENCES User(user_id),
    FOREIGN KEY (stock_id) REFERENCES Stock(stock_id)
);

-- Create Portfolio table
CREATE TABLE Portfolio (
    portfolio_id INT PRIMARY KEY,
    user_id INT,
    stock_id INT,
    quantity INT,
    average_price DECIMAL(10, 2),
    FOREIGN KEY (user_id) REFERENCES User(user_id),
    FOREIGN KEY (stock_id) REFERENCES Stock(stock_id)
);
