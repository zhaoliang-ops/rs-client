package com.ruoyi.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 本地资源管理对象 t_rs_standard_satellite_image
 * 
 * @author zhaoliang
 * @date 2022-04-06
 */
public class TRsStandardSatelliteImage extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long imageId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String catalogCode;

    /** $column.columnComment */
    private Long promotionId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String productName;

    /** $column.columnComment */
    private BigDecimal productPrice;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String productDescription;

    /** $column.columnComment */
    private String satelliteId;

    /** $column.columnComment */
    private String sensorId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String dataFormat;

    /** $column.columnComment */
    private String mapProjection;

    /** $column.columnComment */
    private String earthModel;

    /** $column.columnComment */
    private String spatialResolution;

    /** $column.columnComment */
    private String version;

    /** $column.columnComment */
    private String standardCode;

    /** $column.columnComment */
    private String imageCode;

    /** $column.columnComment */
    private String md5;

    /** $column.columnComment */
    private Long diskId;

    /** $column.columnComment */
    private String serverId;

    /** $column.columnComment */
    private Long wrsPath;

    /** $column.columnComment */
    private Long wrsRow;

    /** $column.columnComment */
    private String thumbView;

    /** $column.columnComment */
    private String quickView;

    /** $column.columnComment */
    private BigDecimal cloudPercent;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String filePath;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long dataSize;

    /** $column.columnComment */
    private BigDecimal centerLat;

    /** $column.columnComment */
    private BigDecimal centerLong;

    /** $column.columnComment */
    private BigDecimal upperLeftLat;

    /** $column.columnComment */
    private BigDecimal upperLeftLong;

    /** $column.columnComment */
    private BigDecimal lowerRightLat;

    /** $column.columnComment */
    private BigDecimal lowerRightLong;

    /** $column.columnComment */
    private String geom;

    /** $column.columnComment */
    private String dataUnitId;

    /** $column.columnComment */
    private String sourceProductId;

    /** $column.columnComment */
    private BigDecimal area;

    /** $column.columnComment */
    private BigDecimal sunElevation;

    /** $column.columnComment */
    private Date sensingStartDate;

    /** $column.columnComment */
    private Date sensingEndDate;

    /** $column.columnComment */
    private String datasetName;

    /** $column.columnComment */
    private String productType;

    /** $column.columnComment */
    private Date productDate;

    /** $column.columnComment */
    private String productLevel;

    /** $column.columnComment */
    private String bands;

    /** $column.columnComment */
    private BigDecimal upperRightLat;

    /** $column.columnComment */
    private BigDecimal upperRightLong;

    /** $column.columnComment */
    private BigDecimal lowerLeftLat;

    /** $column.columnComment */
    private BigDecimal lowerLeftLong;

    /** $column.columnComment */
    private String recStationId;

    /** $column.columnComment */
    private String algorithm;

    /** $column.columnComment */
    private String temporalResolution;

    /** $column.columnComment */
    private String creator;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date createDate;

    /** $column.columnComment */
    private String downloadTime;

    /** $column.columnComment */
    private Date modifyDate;

    public void setImageId(Long imageId) 
    {
        this.imageId = imageId;
    }

    public Long getImageId() 
    {
        return imageId;
    }
    public void setCatalogCode(String catalogCode) 
    {
        this.catalogCode = catalogCode;
    }

    public String getCatalogCode() 
    {
        return catalogCode;
    }
    public void setPromotionId(Long promotionId) 
    {
        this.promotionId = promotionId;
    }

    public Long getPromotionId() 
    {
        return promotionId;
    }
    public void setProductName(String productName) 
    {
        this.productName = productName;
    }

    public String getProductName() 
    {
        return productName;
    }
    public void setProductPrice(BigDecimal productPrice) 
    {
        this.productPrice = productPrice;
    }

    public BigDecimal getProductPrice() 
    {
        return productPrice;
    }
    public void setProductDescription(String productDescription) 
    {
        this.productDescription = productDescription;
    }

    public String getProductDescription() 
    {
        return productDescription;
    }
    public void setSatelliteId(String satelliteId) 
    {
        this.satelliteId = satelliteId;
    }

    public String getSatelliteId() 
    {
        return satelliteId;
    }
    public void setSensorId(String sensorId) 
    {
        this.sensorId = sensorId;
    }

    public String getSensorId() 
    {
        return sensorId;
    }
    public void setDataFormat(String dataFormat) 
    {
        this.dataFormat = dataFormat;
    }

    public String getDataFormat() 
    {
        return dataFormat;
    }
    public void setMapProjection(String mapProjection) 
    {
        this.mapProjection = mapProjection;
    }

    public String getMapProjection() 
    {
        return mapProjection;
    }
    public void setEarthModel(String earthModel) 
    {
        this.earthModel = earthModel;
    }

    public String getEarthModel() 
    {
        return earthModel;
    }
    public void setSpatialResolution(String spatialResolution) 
    {
        this.spatialResolution = spatialResolution;
    }

    public String getSpatialResolution() 
    {
        return spatialResolution;
    }
    public void setVersion(String version) 
    {
        this.version = version;
    }

    public String getVersion() 
    {
        return version;
    }
    public void setStandardCode(String standardCode) 
    {
        this.standardCode = standardCode;
    }

    public String getStandardCode() 
    {
        return standardCode;
    }
    public void setImageCode(String imageCode) 
    {
        this.imageCode = imageCode;
    }

    public String getImageCode() 
    {
        return imageCode;
    }
    public void setMd5(String md5) 
    {
        this.md5 = md5;
    }

    public String getMd5() 
    {
        return md5;
    }
    public void setDiskId(Long diskId) 
    {
        this.diskId = diskId;
    }

    public Long getDiskId() 
    {
        return diskId;
    }
    public void setServerId(String serverId) 
    {
        this.serverId = serverId;
    }

    public String getServerId() 
    {
        return serverId;
    }
    public void setWrsPath(Long wrsPath) 
    {
        this.wrsPath = wrsPath;
    }

    public Long getWrsPath() 
    {
        return wrsPath;
    }
    public void setWrsRow(Long wrsRow) 
    {
        this.wrsRow = wrsRow;
    }

    public Long getWrsRow() 
    {
        return wrsRow;
    }
    public void setThumbView(String thumbView) 
    {
        this.thumbView = thumbView;
    }

    public String getThumbView() 
    {
        return thumbView;
    }
    public void setQuickView(String quickView) 
    {
        this.quickView = quickView;
    }

    public String getQuickView() 
    {
        return quickView;
    }
    public void setCloudPercent(BigDecimal cloudPercent) 
    {
        this.cloudPercent = cloudPercent;
    }

    public BigDecimal getCloudPercent() 
    {
        return cloudPercent;
    }
    public void setFilePath(String filePath) 
    {
        this.filePath = filePath;
    }

    public String getFilePath() 
    {
        return filePath;
    }
    public void setDataSize(Long dataSize) 
    {
        this.dataSize = dataSize;
    }

    public Long getDataSize() 
    {
        return dataSize;
    }
    public void setCenterLat(BigDecimal centerLat) 
    {
        this.centerLat = centerLat;
    }

    public BigDecimal getCenterLat() 
    {
        return centerLat;
    }
    public void setCenterLong(BigDecimal centerLong) 
    {
        this.centerLong = centerLong;
    }

    public BigDecimal getCenterLong() 
    {
        return centerLong;
    }
    public void setUpperLeftLat(BigDecimal upperLeftLat) 
    {
        this.upperLeftLat = upperLeftLat;
    }

    public BigDecimal getUpperLeftLat() 
    {
        return upperLeftLat;
    }
    public void setUpperLeftLong(BigDecimal upperLeftLong) 
    {
        this.upperLeftLong = upperLeftLong;
    }

    public BigDecimal getUpperLeftLong() 
    {
        return upperLeftLong;
    }
    public void setLowerRightLat(BigDecimal lowerRightLat) 
    {
        this.lowerRightLat = lowerRightLat;
    }

    public BigDecimal getLowerRightLat() 
    {
        return lowerRightLat;
    }
    public void setLowerRightLong(BigDecimal lowerRightLong) 
    {
        this.lowerRightLong = lowerRightLong;
    }

    public BigDecimal getLowerRightLong() 
    {
        return lowerRightLong;
    }
    public void setGeom(String geom) 
    {
        this.geom = geom;
    }

    public String getGeom() 
    {
        return geom;
    }
    public void setDataUnitId(String dataUnitId) 
    {
        this.dataUnitId = dataUnitId;
    }

    public String getDataUnitId() 
    {
        return dataUnitId;
    }
    public void setSourceProductId(String sourceProductId) 
    {
        this.sourceProductId = sourceProductId;
    }

    public String getSourceProductId() 
    {
        return sourceProductId;
    }
    public void setArea(BigDecimal area) 
    {
        this.area = area;
    }

    public BigDecimal getArea() 
    {
        return area;
    }
    public void setSunElevation(BigDecimal sunElevation) 
    {
        this.sunElevation = sunElevation;
    }

    public BigDecimal getSunElevation() 
    {
        return sunElevation;
    }
    public void setSensingStartDate(Date sensingStartDate) 
    {
        this.sensingStartDate = sensingStartDate;
    }

    public Date getSensingStartDate() 
    {
        return sensingStartDate;
    }
    public void setSensingEndDate(Date sensingEndDate) 
    {
        this.sensingEndDate = sensingEndDate;
    }

    public Date getSensingEndDate() 
    {
        return sensingEndDate;
    }
    public void setDatasetName(String datasetName) 
    {
        this.datasetName = datasetName;
    }

    public String getDatasetName() 
    {
        return datasetName;
    }
    public void setProductType(String productType) 
    {
        this.productType = productType;
    }

    public String getProductType() 
    {
        return productType;
    }
    public void setProductDate(Date productDate) 
    {
        this.productDate = productDate;
    }

    public Date getProductDate() 
    {
        return productDate;
    }
    public void setProductLevel(String productLevel) 
    {
        this.productLevel = productLevel;
    }

    public String getProductLevel() 
    {
        return productLevel;
    }
    public void setBands(String bands) 
    {
        this.bands = bands;
    }

    public String getBands() 
    {
        return bands;
    }
    public void setUpperRightLat(BigDecimal upperRightLat) 
    {
        this.upperRightLat = upperRightLat;
    }

    public BigDecimal getUpperRightLat() 
    {
        return upperRightLat;
    }
    public void setUpperRightLong(BigDecimal upperRightLong) 
    {
        this.upperRightLong = upperRightLong;
    }

    public BigDecimal getUpperRightLong() 
    {
        return upperRightLong;
    }
    public void setLowerLeftLat(BigDecimal lowerLeftLat) 
    {
        this.lowerLeftLat = lowerLeftLat;
    }

    public BigDecimal getLowerLeftLat() 
    {
        return lowerLeftLat;
    }
    public void setLowerLeftLong(BigDecimal lowerLeftLong) 
    {
        this.lowerLeftLong = lowerLeftLong;
    }

    public BigDecimal getLowerLeftLong() 
    {
        return lowerLeftLong;
    }
    public void setRecStationId(String recStationId) 
    {
        this.recStationId = recStationId;
    }

    public String getRecStationId() 
    {
        return recStationId;
    }
    public void setAlgorithm(String algorithm) 
    {
        this.algorithm = algorithm;
    }

    public String getAlgorithm() 
    {
        return algorithm;
    }
    public void setTemporalResolution(String temporalResolution) 
    {
        this.temporalResolution = temporalResolution;
    }

    public String getTemporalResolution() 
    {
        return temporalResolution;
    }
    public void setCreator(String creator) 
    {
        this.creator = creator;
    }

    public String getCreator() 
    {
        return creator;
    }
    public void setCreateDate(Date createDate) 
    {
        this.createDate = createDate;
    }

    public Date getCreateDate() 
    {
        return createDate;
    }
    public void setDownloadTime(String downloadTime)
    {
        this.downloadTime = downloadTime;
    }

    public String getDownloadTime()
    {
        return downloadTime;
    }
    public void setModifyDate(Date modifyDate) 
    {
        this.modifyDate = modifyDate;
    }

    public Date getModifyDate() 
    {
        return modifyDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("imageId", getImageId())
            .append("catalogCode", getCatalogCode())
            .append("promotionId", getPromotionId())
            .append("productName", getProductName())
            .append("productPrice", getProductPrice())
            .append("productDescription", getProductDescription())
            .append("satelliteId", getSatelliteId())
            .append("sensorId", getSensorId())
            .append("dataFormat", getDataFormat())
            .append("mapProjection", getMapProjection())
            .append("earthModel", getEarthModel())
            .append("spatialResolution", getSpatialResolution())
            .append("version", getVersion())
            .append("standardCode", getStandardCode())
            .append("imageCode", getImageCode())
            .append("md5", getMd5())
            .append("diskId", getDiskId())
            .append("serverId", getServerId())
            .append("wrsPath", getWrsPath())
            .append("wrsRow", getWrsRow())
            .append("thumbView", getThumbView())
            .append("quickView", getQuickView())
            .append("cloudPercent", getCloudPercent())
            .append("filePath", getFilePath())
            .append("dataSize", getDataSize())
            .append("centerLat", getCenterLat())
            .append("centerLong", getCenterLong())
            .append("upperLeftLat", getUpperLeftLat())
            .append("upperLeftLong", getUpperLeftLong())
            .append("lowerRightLat", getLowerRightLat())
            .append("lowerRightLong", getLowerRightLong())
            .append("geom", getGeom())
            .append("dataUnitId", getDataUnitId())
            .append("sourceProductId", getSourceProductId())
            .append("area", getArea())
            .append("sunElevation", getSunElevation())
            .append("sensingStartDate", getSensingStartDate())
            .append("sensingEndDate", getSensingEndDate())
            .append("datasetName", getDatasetName())
            .append("productType", getProductType())
            .append("productDate", getProductDate())
            .append("productLevel", getProductLevel())
            .append("bands", getBands())
            .append("upperRightLat", getUpperRightLat())
            .append("upperRightLong", getUpperRightLong())
            .append("lowerLeftLat", getLowerLeftLat())
            .append("lowerLeftLong", getLowerLeftLong())
            .append("recStationId", getRecStationId())
            .append("algorithm", getAlgorithm())
            .append("temporalResolution", getTemporalResolution())
            .append("creator", getCreator())
            .append("createDate", getCreateDate())
            .append("downloadTime", getDownloadTime())
            .append("modifyDate", getModifyDate())
            .toString();
    }
}
