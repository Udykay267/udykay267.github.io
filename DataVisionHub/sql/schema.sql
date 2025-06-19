CREATE DATABASE IF NOT EXISTS datavision;
USE datavision;

CREATE TABLE IF NOT EXISTS insight (
    id INT AUTO_INCREMENT PRIMARY KEY,
    metric VARCHAR(100),
    value DOUBLE
);

INSERT INTO insight (metric, value) VALUES
('User Engagement', 82.4),
('Bounce Rate', 45.3),
('Conversion Rate', 11.1),
('Customer Lifetime Value', 201.5);
