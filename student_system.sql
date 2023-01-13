/*
 Navicat Premium Data Transfer

 Source Server         : likingpig
 Source Server Type    : MySQL
 Source Server Version : 80031 (8.0.31)
 Source Host           : localhost:3306
 Source Schema         : student_system

 Target Server Type    : MySQL
 Target Server Version : 80031 (8.0.31)
 File Encoding         : 65001

 Date: 14/01/2023 00:45:17
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for class
-- ----------------------------
DROP TABLE IF EXISTS `class`;
CREATE TABLE `class`  (
  `classid` int NOT NULL COMMENT '班级id',
  `classname` int NOT NULL COMMENT '几班',
  `major name` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '专业名称',
  PRIMARY KEY (`classid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of class
-- ----------------------------
INSERT INTO `class` VALUES (1, 1, 'math');
INSERT INTO `class` VALUES (2, 2, 'math');
INSERT INTO `class` VALUES (3, 3, 'math');
INSERT INTO `class` VALUES (4, 1, 'chinese');
INSERT INTO `class` VALUES (5, 2, 'chinese');
INSERT INTO `class` VALUES (6, 3, 'chinese');
INSERT INTO `class` VALUES (7, 1, 'history');
INSERT INTO `class` VALUES (8, 2, 'history');
INSERT INTO `class` VALUES (9, 3, 'history');
INSERT INTO `class` VALUES (10, 1, 'engineer');
INSERT INTO `class` VALUES (11, 2, 'engineer');
INSERT INTO `class` VALUES (12, 3, 'engineer');

-- ----------------------------
-- Table structure for connect
-- ----------------------------
DROP TABLE IF EXISTS `connect`;
CREATE TABLE `connect`  (
  `classid` int NOT NULL,
  `id` int NOT NULL COMMENT '学生id',
  `enter_time` timestamp NULL DEFAULT NULL COMMENT '进入时间'
) ENGINE = InnoDB CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of connect
-- ----------------------------
INSERT INTO `connect` VALUES (1, 1, '2023-01-13 19:00:00');
INSERT INTO `connect` VALUES (1, 2, '2023-01-13 19:00:15');
INSERT INTO `connect` VALUES (1, 3, '2023-01-13 19:00:28');
INSERT INTO `connect` VALUES (2, 4, '2023-01-13 19:00:45');
INSERT INTO `connect` VALUES (2, 5, '2023-01-13 19:01:03');
INSERT INTO `connect` VALUES (2, 6, '2023-01-13 19:01:16');
INSERT INTO `connect` VALUES (3, 7, '2023-01-13 19:01:29');
INSERT INTO `connect` VALUES (3, 8, '2023-01-13 00:23:49');
INSERT INTO `connect` VALUES (3, 9, '2023-01-13 01:19:54');
INSERT INTO `connect` VALUES (4, 10, '2023-01-13 11:09:47');
INSERT INTO `connect` VALUES (4, 11, '2023-01-13 23:55:48');
INSERT INTO `connect` VALUES (4, 12, '2023-01-13 01:11:51');
INSERT INTO `connect` VALUES (5, 13, '2023-01-13 10:05:33');
INSERT INTO `connect` VALUES (5, 14, '2023-01-13 02:15:31');
INSERT INTO `connect` VALUES (5, 15, '2023-01-13 08:20:55');
INSERT INTO `connect` VALUES (6, 16, '2023-01-13 13:56:39');
INSERT INTO `connect` VALUES (6, 17, '2023-01-13 12:31:23');
INSERT INTO `connect` VALUES (6, 18, '2023-01-13 23:31:13');
INSERT INTO `connect` VALUES (7, 19, '2023-01-13 08:44:08');
INSERT INTO `connect` VALUES (7, 20, '2023-01-13 13:27:28');
INSERT INTO `connect` VALUES (7, 21, '2023-01-13 16:33:12');
INSERT INTO `connect` VALUES (8, 22, '2023-01-13 00:05:13');
INSERT INTO `connect` VALUES (8, 23, '2023-01-13 15:18:30');
INSERT INTO `connect` VALUES (8, 24, '2023-01-13 12:59:40');
INSERT INTO `connect` VALUES (9, 25, '2023-01-13 10:03:50');
INSERT INTO `connect` VALUES (9, 26, '2023-01-13 10:23:23');
INSERT INTO `connect` VALUES (9, 27, '2023-01-13 15:48:32');
INSERT INTO `connect` VALUES (10, 28, '2023-01-13 12:12:00');
INSERT INTO `connect` VALUES (10, 29, '2023-01-13 10:22:11');
INSERT INTO `connect` VALUES (10, 30, '2023-01-13 19:30:35');
INSERT INTO `connect` VALUES (11, 31, '2023-01-13 08:59:12');
INSERT INTO `connect` VALUES (11, 32, '2023-01-13 06:14:22');
INSERT INTO `connect` VALUES (11, 33, '2023-01-13 12:54:12');
INSERT INTO `connect` VALUES (12, 34, '2023-01-13 14:06:09');
INSERT INTO `connect` VALUES (12, 35, '2023-01-13 11:02:14');
INSERT INTO `connect` VALUES (12, 36, '2023-01-13 21:44:40');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `id` int NOT NULL COMMENT '学生id',
  `name` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '学生姓名',
  `gender` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '性别',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (1, 'Amber Grant', 'F');
INSERT INTO `student` VALUES (2, 'Harada Ryota', 'M');
INSERT INTO `student` VALUES (3, 'Ichikawa Aoi', 'F');
INSERT INTO `student` VALUES (4, 'Wada Yota', 'M');
INSERT INTO `student` VALUES (5, 'Arai Hikari', 'F');
INSERT INTO `student` VALUES (6, 'Shing Siu Wai', 'F');
INSERT INTO `student` VALUES (7, 'Yung Yun Fat', 'M');
INSERT INTO `student` VALUES (8, 'Ti Lik Sun', 'M');
INSERT INTO `student` VALUES (9, 'Qian Zhennan', 'M');
INSERT INTO `student` VALUES (10, 'Ota Mitsuki', 'F');
INSERT INTO `student` VALUES (11, 'William Evans', 'M');
INSERT INTO `student` VALUES (12, 'Lo Wai Man', 'F');
INSERT INTO `student` VALUES (13, 'Earl Miller', 'M');
INSERT INTO `student` VALUES (14, 'Ying Hui Mei', 'F');
INSERT INTO `student` VALUES (15, 'Raymond Garza', 'M');
INSERT INTO `student` VALUES (16, 'Ishii Ikki', 'M');
INSERT INTO `student` VALUES (17, 'Sandra Ramos', 'F');
INSERT INTO `student` VALUES (18, 'Han Xiaoming', 'M');
INSERT INTO `student` VALUES (19, 'John Munoz', 'M');
INSERT INTO `student` VALUES (20, 'Miu Chieh Lun', 'M');
INSERT INTO `student` VALUES (21, 'Matsuda Nanami', 'M');
INSERT INTO `student` VALUES (22, 'Su Xiuying', 'F');
INSERT INTO `student` VALUES (23, 'Cao Anqi', 'F');
INSERT INTO `student` VALUES (24, 'Connie Patterson', 'F');
INSERT INTO `student` VALUES (25, 'Ma Jialun', 'M');
INSERT INTO `student` VALUES (26, 'Abe Mitsuki', 'F');
INSERT INTO `student` VALUES (27, 'Morita Mio', 'F');
INSERT INTO `student` VALUES (28, 'Hung Kwok Wing', 'M');
INSERT INTO `student` VALUES (29, 'Matsui Nanami', 'M');
INSERT INTO `student` VALUES (30, 'Choi Tak Wah', 'M');
INSERT INTO `student` VALUES (31, 'Joanne Hicks', 'F');
INSERT INTO `student` VALUES (32, 'Gu Ziyi', 'M');
INSERT INTO `student` VALUES (33, 'Chung Siu Wai', 'F');
INSERT INTO `student` VALUES (34, 'Qin Jialun', 'M');
INSERT INTO `student` VALUES (35, 'Ding Jiehong', 'M');
INSERT INTO `student` VALUES (37, 'alex', 'M');

SET FOREIGN_KEY_CHECKS = 1;
