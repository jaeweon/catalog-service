ALTER TABLE catalog
MODIFY created_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP;

insert into catalog(product_id, product_name, stock, unit_price)
values ('CATALOG-001', 'lee1', '200', '1200');

insert into catalog(product_id, product_name, stock, unit_price)
values ('CATALOG-002', 'lee2', '200', '1000');


