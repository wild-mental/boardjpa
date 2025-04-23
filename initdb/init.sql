-- init.sql: 컨테이너 최초 실행 시 자동 적용되는 SQL
SET NAMES utf8mb4;
SET CHARACTER SET utf8mb4;
SET collation_connection = utf8mb4_unicode_ci;

-- 데이터베이스 재생성
DROP DATABASE IF EXISTS boarddb;
CREATE DATABASE boarddb;
USE boarddb;

-- 테이블 재생성
DROP TABLE IF EXISTS user;

CREATE TABLE user (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
    email VARCHAR(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL UNIQUE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

DROP TABLE IF EXISTS board;

CREATE TABLE board (
    bno BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
    content TEXT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
    id BIGINT,
    created_at DATETIME,
    updated_at DATETIME,
    FOREIGN KEY (id) REFERENCES user(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- 초기 데이터 (필요 시)
-- INSERT INTO users (name, email) VALUES
-- (N'홍길동', 'hong@example.com'),
-- (N'김영희', 'kim@example.com');