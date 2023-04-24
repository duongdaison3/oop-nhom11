SELECT `name`, `sql`
  FROM `sqlite_master`
  WHERE type='table';

CREATE TABLE sqlite_sequence(name,seq);
CREATE TABLE "roomType" (
	`type`	TEXT,
	`price`	INTEGER,
	PRIMARY KEY(type)
);
CREATE TABLE "food" (
	`food_id` INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
	`name`	TEXT NOT NULL,
	`price`	INTEGER NOT NULL
);
CREATE TABLE "item" (
	`item_id`	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
	`name`	TEXT NOT NULL,
	`description`	TEXT,
	`price`	INTEGER NOT NULL
);
CREATE TABLE "userInfo" (
	`user_id`	INTEGER PRIMARY KEY AUTOINCREMENT,
	`name`	TEXT NOT NULL,
	`address`	TEXT,
	`phone`	TEXT,
	`type`	TEXT NOT NULL DEFAULT 'regular'
);
CREATE TABLE "orderItem" (
	`order_id`	INTEGER PRIMARY KEY AUTOINCREMENT,
	`booking_id`	INTEGER NOT NULL,
	`item_food`	INTEGER,
	`price`	INTEGER,
	`quantity`	INTEGER,
	`total`	INTEGER
);
CREATE TABLE "booking" (
	`booking_id`	INTEGER PRIMARY KEY AUTOINCREMENT,
	`customer_id`	INTEGER,
	`booking_room`	TEXT,
	`guests`	INTEGER,
	`check_in`	INTEGER,
	`check_out`	INTEGER,
	`booking_type`	TEXT,
	`has_checked_out`	INTEGER
);
CREATE TABLE "room" (
	`room_id`	INTEGER PRIMARY KEY AUTOINCREMENT,
	`room_no`	TEXT NOT NULL,
	`bed_number`	INTEGER,
	`tv`	TEXT,
	`wifi`	TEXT,
	`gizer`	TEXT,
	`phone`	TEXT,
	`room_class`	TEXT NOT NULL
);
