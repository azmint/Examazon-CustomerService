USE examazon;

CREATE TABLE `customer` (
  `customer_id` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `name_reading` varchar(255) NOT NULL,
  `registration_state` INTEGER NOT NULL,
  PRIMARY KEY (`customer_id`)
);