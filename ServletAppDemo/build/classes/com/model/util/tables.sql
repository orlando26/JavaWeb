create table USER(
	Id int not null auto_increment,
    Name varchar(50) not null,
    Last_Name varchar(50) not null,
    Email varchar(50),
    Age int not null,
    Address varchar(100),
    State varchar(50),
    City varchar(100),
    Password varchar(100),
    
    primary key(Id)
)

CREATE TABLE IF NOT EXISTS STATE(
	Id int not null auto_increment,
	Name VARCHAR(50) NOT NULL,
	Abbrev VARCHAR(10) NOT NULL,
	LastModified TIMESTAMP NOT NULL,

	primary key(Id)
) ENGINE=InnoDB;

CREATE TABLE IF NOT EXISTS CITY(
	Id int not null auto_increment,
	Id_State int NOT NULL,
	Name VARCHAR(50) NOT NULL,
	LastModified TIMESTAMP NOT NULL,
	FOREIGN KEY(Id_State) REFERENCES STATE(Id),

	PRIMARY KEY(Id)
) ENGINE=InnoDB;

-- endpoint: mysqldb.covrvaofu1mm.us-east-1.rds.amazonaws.com
-- username: tecgurus
-- schema: cursojava
-- password: password



