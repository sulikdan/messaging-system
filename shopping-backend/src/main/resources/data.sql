-- WARNING - NOT being used as there is issue with multi-line parsing - NOT gonna go through this disaster
-- Customer

INSERT INTO customer (created_at, updated_at, id, email, first_name, last_name) VALUES (NOW(), '2025-06-14 11:50:12.000000', gen_random_uuid(), 'sopo@gmail.com', 'Daniel', 'Solo');
INSERT INTO customer (id, first_name, last_name, email, created_at, updated_at) VALUES (gen_random_uuid(), 'Alice', 'Smith', 'alice.smith@example.com', NOW(), NOW());
INSERT INTO customer (id, first_name, last_name, email, created_at, updated_at) VALUES ('223e4567-e89b-12d3-a456-426614174001'::uuid, 'Bob', 'Johnson', 'bob.johnson@example.com', NOW(), NOW());
INSERT INTO customer (id, first_name, last_name, email, created_at, updated_at) VALUES ('323e4567-e89b-12d3-a456-426614174002'::uuid, 'Carol', 'Williams', 'carol.williams@example.com', NOW(), NOW());


-- Cart
INSERT INTO cart (id, fk_customer, created_at, updated_at)
VALUES
    ('a1e4567e-e89b-12d3-a456-426614174000'::uuid, '123e4567-e89b-12d3-a456-426614174001'::uuid, NOW(), NOW()),
    ('a2e4567e-e89b-12d3-a456-426614174001'::uuid, '223e4567-e89b-12d3-a456-426614174002'::uuid, NOW(), NOW());


-- ---- Insert example products
-- INSERT INTO product (id, fk_order, product_model_id)
-- VALUES
--     ('111e1111-e89b-12d3-a456-426614170001'::uuid, NULL, NULL),
--     ('111e1111-e89b-12d3-a456-426614170002'::uuid, NULL, NULL),
--     ('111e1111-e89b-12d3-a456-426614170003'::uuid, NULL, NULL);
