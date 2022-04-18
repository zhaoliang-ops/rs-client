package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.TRsStandardSatelliteImage;

/**
 * 本地资源管理Mapper接口
 * 
 * @author zhaoliang
 * @date 2022-04-06
 */
public interface TRsStandardSatelliteImageMapper 
{
    /**
     * 查询本地资源管理
     * 
     * @param imageId 本地资源管理主键
     * @return 本地资源管理
     */
    public TRsStandardSatelliteImage selectTRsStandardSatelliteImageByImageId(Long imageId);

    /**
     * 查询P2P网络内所有资源管理列表
     *
     * @param tRsStandardSatelliteImage 本地资源管理
     * @return 本地资源管理集合
     */
    public List<TRsStandardSatelliteImage> getAllP2PImageList(TRsStandardSatelliteImage tRsStandardSatelliteImage);
    /**
     * 查询本地资源管理列表
     * 
     * @param tRsStandardSatelliteImage 本地资源管理
     * @return 本地资源管理集合
     */
    public List<TRsStandardSatelliteImage> selectTRsStandardSatelliteImageList(TRsStandardSatelliteImage tRsStandardSatelliteImage);
    /**
     * 查询本地资源管理列表
     *
     * @param tRsStandardSatelliteImage 本地资源管理
     * @return 本地资源管理集合
     */
    public List<TRsStandardSatelliteImage> getDownLoadLocalImageList(TRsStandardSatelliteImage tRsStandardSatelliteImage);
    /**
     * 查询本地资源管理列表
     *
     * @param tRsStandardSatelliteImage 本地资源管理
     * @return 本地资源管理集合
     */
    public List<TRsStandardSatelliteImage> getUploadLocalImageList(TRsStandardSatelliteImage tRsStandardSatelliteImage);

    /**
     * 新增本地资源管理
     * 
     * @param tRsStandardSatelliteImage 本地资源管理
     * @return 结果
     */
    public int insertTRsStandardSatelliteImage(TRsStandardSatelliteImage tRsStandardSatelliteImage);

    /**
     * 修改本地资源管理
     * 
     * @param tRsStandardSatelliteImage 本地资源管理
     * @return 结果
     */
    public int updateTRsStandardSatelliteImage(TRsStandardSatelliteImage tRsStandardSatelliteImage);

    /**
     * 下载资源管理
     *
     * @param tRsStandardSatelliteImage 本地资源管理
     * @return 结果
     */
    public int downLoadTRsStandardSatelliteImage(TRsStandardSatelliteImage tRsStandardSatelliteImage);

    /**
     * 删除本地资源管理
     * 
     * @param imageId 本地资源管理主键
     * @return 结果
     */
    public int deleteTRsStandardSatelliteImageByImageId(Long imageId);

    /**
     * 批量删除本地资源管理
     * 
     * @param imageIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTRsStandardSatelliteImageByImageIds(Long[] imageIds);
}
