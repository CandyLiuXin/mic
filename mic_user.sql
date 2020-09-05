/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : PostgreSQL
 Source Server Version : 120003
 Source Host           : localhost:5432
 Source Catalog        : candy
 Source Schema         : public

 Target Server Type    : PostgreSQL
 Target Server Version : 120003
 File Encoding         : 65001

 Date: 05/09/2020 18:19:05
*/


-- ----------------------------
-- Table structure for mic_user
-- ----------------------------
DROP TABLE IF EXISTS "public"."mic_user";
CREATE TABLE "public"."mic_user" (
  "id" int4 NOT NULL,
  "username" varchar(255) COLLATE "pg_catalog"."default",
  "name" varchar(255) COLLATE "pg_catalog"."default",
  "age" int4
)
;
ALTER TABLE "public"."mic_user" OWNER TO "candy";

-- ----------------------------
-- Records of mic_user
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Primary Key structure for table mic_user
-- ----------------------------
ALTER TABLE "public"."mic_user" ADD CONSTRAINT "mic_user_pkey" PRIMARY KEY ("id");
