package com.stylefeng.guns.rest.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 演员表
 * </p>
 *
 * @author chenzhibin
 * @since 2020-03-31
 */
public class ActorDO extends Model<ActorDO> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键编号
     */
    @TableId(value = "UUID", type = IdType.AUTO)
    private Integer uuid;
    /**
     * 演员名称
     */
    @TableField("actor_name")
    private String actorName;
    /**
     * 演员图片位置
     */
    @TableField("actor_img")
    private String actorImg;


    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public String getActorImg() {
        return actorImg;
    }

    public void setActorImg(String actorImg) {
        this.actorImg = actorImg;
    }

    @Override
    protected Serializable pkVal() {
        return this.uuid;
    }

    @Override
    public String toString() {
        return "ActorDO{" +
        "uuid=" + uuid +
        ", actorName=" + actorName +
        ", actorImg=" + actorImg +
        "}";
    }
}