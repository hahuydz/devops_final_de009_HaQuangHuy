-- =============================================================================
--  database/init.sql - Khởi tạo dữ liệu cho đề 009: Quản lý phòng khách sạn
--  MySQL tự chạy file này ở LẦN KHỞI ĐỘNG ĐẦU TIÊN khi được mount vào
--  /docker-entrypoint-initdb.d/  (database và user do biến MYSQL_* tạo sẵn)
-- =============================================================================
SET NAMES utf8mb4;

USE ptit_hotel_db;

CREATE TABLE IF NOT EXISTS rooms (
    id              BIGINT AUTO_INCREMENT PRIMARY KEY,
    room_number     VARCHAR(10) NOT NULL,
    room_type       VARCHAR(30) NOT NULL,
    floor           INT NOT NULL,
    price_per_night DECIMAL(12,2) NOT NULL,
    status          VARCHAR(30) NOT NULL,
    created_at      TIMESTAMP DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

INSERT INTO rooms (room_number, room_type, floor, price_per_night, status) VALUES
    ('101', 'Standard', 1, 650000, 'Trống'),
    ('102', 'Standard', 1, 650000, 'Đã đặt'),
    ('201', 'Superior', 2, 900000, 'Trống'),
    ('202', 'Superior', 2, 900000, 'Đang dọn'),
    ('301', 'Deluxe', 3, 1300000, 'Trống'),
    ('302', 'Deluxe', 3, 1300000, 'Đã đặt'),
    ('501', 'Suite', 5, 2500000, 'Trống'),
    ('502', 'Family Suite', 5, 3200000, 'Đã đặt');
