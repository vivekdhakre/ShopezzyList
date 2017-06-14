#total 14 tables
CREATE TABLE ushop.user (
	user_pkey bigint UNSIGNED NOT NULL auto_increment,
	user_app_id varchar(200) NOT NULL UNIQUE,
	
	family_category_fkey bigint ,
	user_name varchar(100) ,
	user_email varchar(100) ,
	user_msisdn varchar(100) ,
	is_veg int,
	age  int,
	lat_long varchar(50) ,
	address varchar(100) ,
	pin_code varchar(50) ,
	city varchar(50) ,
	  
	created_by varchar(50) DEFAULT 'Admin' NOT NULL,
	created_on timestamp DEFAULT CURRENT_TIMESTAMP,
	updated_by varchar(50) DEFAULT 'Admin' NOT NULL,
	updated_on timestamp DEFAULT '0000-00-00 00:00:00',
	PRIMARY KEY (user_pkey)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE ushop.grocery_item (
	grocery_item_pkey bigint UNSIGNED NOT NULL auto_increment,
	grocery_item_name varchar(100) NOT NULL UNIQUE,
#	grocery_category_fkey bigint ,
	grocery_item_image varchar(100),
	grocery_item_quantity varchar(100),
	
	
	created_by varchar(50) DEFAULT 'Admin' NOT NULL,
	created_on timestamp DEFAULT CURRENT_TIMESTAMP,
	updated_by varchar(50) DEFAULT 'Admin' NOT NULL,
	updated_on timestamp DEFAULT '0000-00-00 00:00:00',
	PRIMARY KEY (grocery_item_pkey)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE ushop.grocery_item_instance (
	grocery_item_instance_pkey bigint UNSIGNED NOT NULL auto_increment,
	grocery_item_fkey bigint ,
	grocery_brand_fkey bigint ,
	grocery_item_instance_image varchar(100),
	
	grocery_item_instance_name varchar(100) NOT NULL UNIQUE,
	grocery_item_quality_category varchar(100) ,
	grocery_item_mrp varchar(100) ,
	
	created_by varchar(50) DEFAULT 'Admin' NOT NULL,
	created_on timestamp DEFAULT CURRENT_TIMESTAMP,
	updated_by varchar(50) DEFAULT 'Admin' NOT NULL,
	updated_on timestamp DEFAULT '0000-00-00 00:00:00',
	PRIMARY KEY (grocery_item_instance_pkey)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE ushop.grocery_store (
	grocery_store_pkey bigint UNSIGNED NOT NULL auto_increment,
	grocery_store_name  varchar(100) NOT NULL UNIQUE,
	grocery_store_logo_image varchar(100) , 
	
	created_by varchar(50) DEFAULT 'Admin' NOT NULL,
	created_on timestamp DEFAULT CURRENT_TIMESTAMP,
	updated_by varchar(50) DEFAULT 'Admin' NOT NULL,
	updated_on timestamp DEFAULT '0000-00-00 00:00:00',
	PRIMARY KEY (grocery_store_pkey)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


CREATE TABLE ushop.grocery_store_branch (
	grocery_store_branch_pkey bigint UNSIGNED NOT NULL auto_increment,
	grocery_store_branch_name varchar(200) NOT NULL UNIQUE,
	grocery_store_fkey bigint ,
	grocery_store_branch_address varchar(100),
	grocery_store_branch_city varchar(100),
	grocery_store_branch_lat_long varchar(100),
	grocery_store_branch_pin_code varchar(100),
	
	created_by varchar(50) DEFAULT 'Admin' NOT NULL,
	created_on timestamp DEFAULT CURRENT_TIMESTAMP,
	updated_by varchar(50) DEFAULT 'Admin' NOT NULL,
	updated_on timestamp DEFAULT '0000-00-00 00:00:00',
	PRIMARY KEY (grocery_store_branch_pkey)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE ushop.grocery_store_inventory (
	grocery_store_inventory_pkey bigint UNSIGNED NOT NULL auto_increment,
	grocery_store_branch_fkey bigint ,
	grocery_item_instance_fkey bigint ,
	
	created_by varchar(50) DEFAULT 'Admin' NOT NULL,
	created_on timestamp DEFAULT CURRENT_TIMESTAMP,
	updated_by varchar(50) DEFAULT 'Admin' NOT NULL,
	updated_on timestamp DEFAULT '0000-00-00 00:00:00',
	PRIMARY KEY (grocery_store_inventory_pkey)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE ushop.user_shopping_list (
	user_shopping_list_pkey bigint UNSIGNED NOT NULL auto_increment,
	user_fkey bigint ,
	item_list_json  text,
	  
	created_by varchar(50) DEFAULT 'Admin' NOT NULL,
	created_on timestamp DEFAULT CURRENT_TIMESTAMP,
	updated_by varchar(50) DEFAULT 'Admin' NOT NULL,
	updated_on timestamp DEFAULT '0000-00-00 00:00:00',
	PRIMARY KEY (user_shopping_list_pkey)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE ushop.default_shopping_list (
	default_shopping_list_pkey bigint UNSIGNED NOT NULL auto_increment,
	family_category_fkey bigint ,
	item_list_json  text,
	time_granularity int ,
#	grocery_item_fkey bigint,
	
	created_by varchar(50) DEFAULT 'Admin' NOT NULL,
	created_on timestamp DEFAULT CURRENT_TIMESTAMP,
	updated_by varchar(50) DEFAULT 'Admin' NOT NULL,
	updated_on timestamp DEFAULT '0000-00-00 00:00:00',
	PRIMARY KEY (default_shopping_list_pkey)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE ushop.deal (
	deal_pkey bigint UNSIGNED NOT NULL auto_increment,
	grocery_item_instance_fkey bigint ,
	grocery_store_fkey bigint ,
	grocery_item_fkey bigint ,
	deal_explanation varchar(1000),
	deal_image varchar(100),
	
	created_by varchar(50) DEFAULT 'Admin' NOT NULL,
	created_on timestamp DEFAULT CURRENT_TIMESTAMP,
	updated_by varchar(50) DEFAULT 'Admin' NOT NULL,
	updated_on timestamp DEFAULT '0000-00-00 00:00:00',
	PRIMARY KEY (deal_pkey)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE ushop.family_category (
	family_category_pkey bigint UNSIGNED NOT NULL auto_increment,
	family_category_name varchar(100) NOT NULL UNIQUE,
	
	created_by varchar(50) DEFAULT 'Admin' NOT NULL,
	created_on timestamp DEFAULT CURRENT_TIMESTAMP,
	updated_by varchar(50) DEFAULT 'Admin' NOT NULL,
	updated_on timestamp DEFAULT '0000-00-00 00:00:00',
	PRIMARY KEY (family_category_pkey)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE ushop.grocery_brand (
	grocery_brand_pkey bigint UNSIGNED NOT NULL auto_increment,
	brand_name varchar(100) NOT NULL UNIQUE,
	grocery_brand_image varchar(100),
	
	created_by varchar(50) DEFAULT 'Admin' NOT NULL,
	created_on timestamp DEFAULT CURRENT_TIMESTAMP,
	updated_by varchar(50) DEFAULT 'Admin' NOT NULL,
	updated_on timestamp DEFAULT '0000-00-00 00:00:00',
	PRIMARY KEY (grocery_brand_pkey)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE ushop.grocery_category (
	grocery_category_pkey bigint UNSIGNED NOT NULL auto_increment,
	grocery_category_name varchar(100) NOT NULL UNIQUE,
	grocery_category_image varchar(100),
	grocery_category_order_one int,
	grocery_category_order_two int,
	grocery_category_order_three int,
	grocery_category_order_four int,
	
	created_by varchar(50) DEFAULT 'Admin' NOT NULL,
	created_on timestamp DEFAULT CURRENT_TIMESTAMP,
	updated_by varchar(50) DEFAULT 'Admin' NOT NULL,
	updated_on timestamp DEFAULT '0000-00-00 00:00:00',
	PRIMARY KEY (grocery_category_pkey)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE ushop.item_mapping (
	item_mapping_pkey bigint UNSIGNED NOT NULL auto_increment,
	grocery_category_fkey bigint,
	grocery_item_fkey bigint,
	
	created_by varchar(50) DEFAULT 'Admin' NOT NULL,
	created_on timestamp DEFAULT CURRENT_TIMESTAMP,
	updated_by varchar(50) DEFAULT 'Admin' NOT NULL,
	updated_on timestamp DEFAULT '0000-00-00 00:00:00',
	PRIMARY KEY (item_mapping_pkey)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE ushop.item_instance_mapping (
	item_instance_mapping_pkey bigint UNSIGNED NOT NULL auto_increment,
	mapping_fkey bigint,
	item_instance_fkey bigint,
	 
	created_by varchar(50) DEFAULT 'Admin' NOT NULL,
	created_on timestamp DEFAULT CURRENT_TIMESTAMP,
	updated_by varchar(50) DEFAULT 'Admin' NOT NULL,
	updated_on timestamp DEFAULT '0000-00-00 00:00:00',
	PRIMARY KEY (item_instance_mapping_pkey)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE ushop.postal_code (
	postal_code_pkey bigint UNSIGNED NOT NULL auto_increment,
	
	country_code      varchar(20),
	postal_code       varchar(20),
	place_name        varchar(180),
	admin_name1       varchar(100),
	admin_code1     varchar(20),
	admin_name2       varchar(100),
	admin_code2      varchar(20),
	admin_name3       varchar(100),
	admin_code3       varchar(20),
	latitude         varchar(20),
	longitude        varchar(20),
	accuracy         int ,
	
	
	created_by varchar(50) DEFAULT 'Admin' NOT NULL,
	created_on timestamp DEFAULT CURRENT_TIMESTAMP,
	updated_by varchar(50) DEFAULT 'Admin' NOT NULL,
	updated_on timestamp DEFAULT '0000-00-00 00:00:00',
	PRIMARY KEY (postal_code_pkey)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE ushop.country(
	country_pkey bigint UNSIGNED NOT NULL auto_increment,
	country_name varchar(50),
	country_currency varchar(50),
	country_metric_system varchar(50),
	country_language varchar(50),
	 
	created_by varchar(50) DEFAULT 'Admin' NOT NULL,
	created_on timestamp DEFAULT CURRENT_TIMESTAMP,
	updated_by varchar(50) DEFAULT 'Admin' NOT NULL,
	updated_on timestamp DEFAULT '0000-00-00 00:00:00',
	PRIMARY KEY (country_pkey)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
CREATE TABLE ushop.city(
	city_pkey bigint UNSIGNED NOT NULL auto_increment,
	city_name varchar(50),
	city_country varchar(50),
	 
	created_by varchar(50) DEFAULT 'Admin' NOT NULL,
	created_on timestamp DEFAULT CURRENT_TIMESTAMP,
	updated_by varchar(50) DEFAULT 'Admin' NOT NULL,
	updated_on timestamp DEFAULT '0000-00-00 00:00:00',
	PRIMARY KEY (city_pkey)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
==================================================================================================================
 LOAD DATA INFILE 'C:/Users/Ganesha Ram/Desktop/IN.txt' INTO TABLE postal_code;