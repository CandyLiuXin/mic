package com.microservice.microservicesimpleprovideruser.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Pandong
 * @since 2019-03-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("ct_user")
public class CtUser extends Model<CtUser> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "user_id", type = IdType.UUID)
    private String userId;

    /**
     * 用户名称
     */
    @TableField("user_name")
    private String userName;

    /**
     * 年龄ß
     */
    private Integer age;

    /**
     * 价格
     */
    private BigDecimal balance;


    @Override
    protected Serializable pkVal() {
        return this.userId;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "CtUser [age=" + age + ", balance=" + balance + ", userId=" + userId + ", userName=" + userName + "]";
    }


}