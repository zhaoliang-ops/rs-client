package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 调度算法管理对象 sys_algorithm
 * 
 * @author ruoyi
 * @date 2022-04-07
 */
public class SysAlgorithm extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 中文名称 */
    @Excel(name = "中文名称")
    private String nameZh;

    /** 英文名称 */
    @Excel(name = "英文名称")
    private String name;

    /** 版本号 */
    @Excel(name = "版本号")
    private String version;

    /** 状态 */
    @Excel(name = "状态")
    private String isActive;

    /** 注册时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "注册时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date date;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setNameZh(String nameZh) 
    {
        this.nameZh = nameZh;
    }

    public String getNameZh() 
    {
        return nameZh;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setVersion(String version) 
    {
        this.version = version;
    }

    public String getVersion() 
    {
        return version;
    }
    public void setIsActive(String isActive) 
    {
        this.isActive = isActive;
    }

    public String getIsActive() 
    {
        return isActive;
    }
    public void setDate(Date date) 
    {
        this.date = date;
    }

    public Date getDate() 
    {
        return date;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("nameZh", getNameZh())
            .append("name", getName())
            .append("version", getVersion())
            .append("isActive", getIsActive())
            .append("date", getDate())
            .toString();
    }
}
