use workon_ecommerce;
create table if not exists accounts
(
	accountId int(5) auto_increment
		primary key,
	email varchar(50) not null,
	password varchar(255) not null,
	permission int(1) default 0 not null,
	isDeleted tinyint(1) null,
	createdDate datetime null,
	modifiedDate datetime null
);

create table if not exists contacts
(
	contactId int(5) auto_increment
		primary key,
	lastName varchar(25) null,
	firstName varchar(25) null,
	phone varchar(15) null,
	email varchar(25) null,
	addressLine varchar(100) null,
	ward varchar(25) null,
	city varchar(25) null,
	isDeleted tinyint(1) null,
	createdDate datetime null,
	modifiedDate datetime null
);

create table if not exists customers
(
	customerId int(5) auto_increment
		primary key,
	contactId int(5) not null,
	accountId int(5) not null,
	gender varchar(6) null,
	isDeleted tinyint(1) null,
	createdDate datetime null,
	modifiedDate datetime null,
	constraint customers_contactId_uindex
		unique (contactId),
	constraint customers_accounts_fk
		foreign key (accountId) references accounts (accountId),
	constraint customers_contacts_fk
		foreign key (contactId) references contacts (contactId)
);

create table if not exists employees
(
	employeeId int(5) auto_increment
		primary key,
	contactId int(5) not null,
	accountId int(5) null,
	jobTitle varchar(25) null,
	isDeleted tinyint(1) null,
	createdDate datetime null,
	modifiedDate datetime null,
	constraint employees_contactId_uindex
		unique (contactId),
	constraint employees_accounts_fk
		foreign key (accountId) references accounts (accountId),
	constraint employees_contacts_fk
		foreign key (contactId) references contacts (contactId)
);

create table if not exists articles
(
	articleId int(5) auto_increment
		primary key,
	articleTitle varchar(50) null,
	content text null,
	isDeleted tinyint(1) null,
	createdDate datetime null,
	modifiedDate datetime null,
	createdBy int(5) null,
	modifiedBy int(5) null,
	constraint articles_employee_cr_fk
		foreign key (createdBy) references employees (employeeId),
	constraint articles_employee_mo_fk
		foreign key (modifiedBy) references employees (employeeId)
);

create table if not exists categories
(
	categoryId int(5) auto_increment
		primary key,
	categoryName varchar(50) null,
	description text null,
	categoryImage varchar(200) null,
	isDeleted tinyint(1) null,
	createdDate datetime null,
	modifiedDate datetime null,
	createdBy int(5) null,
	modifiedBy int(5) null,
	constraint categories_employee_cr_fk
		foreign key (createdBy) references employees (employeeId),
	constraint categories_employee_mo_fk
		foreign key (modifiedBy) references employees (employeeId)
);

create table if not exists payments
(
	paymentId int(10) auto_increment
		primary key,
	customerId int(5) null,
	paymentDate date null,
	amount double(16,2) null,
	paymentMethods int(1) null,
	createdDate datetime null,
	constraint payments_customers_fk
		foreign key (customerId) references customers (customerId)
);

create table if not exists invoices
(
	invoiceId int(10) auto_increment
		primary key,
	customerId int(5) not null,
	invoiceDate date null,
	paymentId int(10) null,
	total double(16,2) null,
	createdDate datetime null,
	constraint invoices_customers_fk
		foreign key (customerId) references customers (customerId),
	constraint invoices_payments_fk
		foreign key (paymentId) references payments (paymentId)
);

create table if not exists products
(
	productId int(10) auto_increment
		primary key,
	productName varchar(50) not null,
	categoryId int(5) null,
	productDescription varchar(255) null,
	quantityInStock int null,
	buyPrice double(16,2) null,
	productImage varchar(200) null,
	discount double(16,2) null,
	isDeleted tinyint(1) null,
	createdDate datetime null,
	modifiedDate datetime null,
	createdBy int(5) null,
	modifiedBy int(5) null,
	constraint products_categories_fk
		foreign key (categoryId) references categories (categoryId),
	constraint products_employee_cr_fk
		foreign key (createdBy) references employees (employeeId),
	constraint products_employee_mo_fk
		foreign key (modifiedBy) references employees (employeeId)
);

create table if not exists orders
(
	orderNumber int(10) auto_increment
		primary key,
	invoiceId int(10) null,
	productId int(10) null,
	orderedQuantity int(5) null,
	createdDate datetime null,
	constraint orderLines_orders_fk
		foreign key (invoiceId) references invoices (invoiceId),
	constraint orderlines_products_fk
		foreign key (productId) references products (productId)
);

create table if not exists shoppingcarts
(
	shoppingCartId int(10) auto_increment
		primary key,
	customerId int(5) not null,
	productId int(10) not null,
	quantity int(5) null,
	createdDate datetime null,
	modifiedDate datetime null,
	constraint shoppingcarts_customers_fk
		foreign key (customerId) references customers (customerId),
	constraint shoppingcarts_products_fk
		foreign key (productId) references products (productId)
);

