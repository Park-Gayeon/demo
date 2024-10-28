-- db 생성
CREATE DATABASE IF NOT EXISTS demo_db DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE demo_db;
# USE `demo_db`;

-- user 생성
create user IF NOT EXISTS 'itsmart'@'%' IDENTIFIED BY 'itsmart1!';

-- 권한 부여
GRANT ALL PRIVILEGES ON `demo_db`.* TO 'itsmart'@'%' with grant option;
flush privileges;

-- 초기 데이터 생성
CREATE TABLE IF NOT EXISTS emp (
                                   EMPNO INT(4) NOT NULL AUTO_INCREMENT,
                                   ENAME VARCHAR(12),
                                   HIREDATE VARCHAR(8),
                                   DEPTNO INT(4) NOT NULL,
                                   PRIMARY KEY (EMPNO)
);

INSERT INTO emp (ENAME, HIREDATE, DEPTNO) VALUES ('박가연', '20240401', 1000);