package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TRsStandardSatelliteImageMapper;
import com.ruoyi.system.domain.TRsStandardSatelliteImage;
import com.ruoyi.system.service.ITRsStandardSatelliteImageService;

/**
 * 本地资源管理Service业务层处理
 * 
 * @author zhaoliang
 * @date 2022-04-06
 */
@Service
public class TRsStandardSatelliteImageServiceImpl implements ITRsStandardSatelliteImageService 
{
    @Autowired
    private TRsStandardSatelliteImageMapper tRsStandardSatelliteImageMapper;

    /**
     * 查询本地资源管理
     * 
     * @param imageId 本地资源管理主键
     * @return 本地资源管理
     */
    @Override
    public TRsStandardSatelliteImage selectTRsStandardSatelliteImageByImageId(Long imageId)
    {
        return tRsStandardSatelliteImageMapper.selectTRsStandardSatelliteImageByImageId(imageId);
    }

    /**
     * 查询P2P网络内所有资源管理列表
     *
     * @param tRsStandardSatelliteImage 本地资源管理
     * @return 本地资源管理
     */
    @Override
    public List<TRsStandardSatelliteImage> getAllP2PImageList(TRsStandardSatelliteImage tRsStandardSatelliteImage)
    {
        return tRsStandardSatelliteImageMapper.getAllP2PImageList(tRsStandardSatelliteImage);
    }
    /**
     * 查询本地资源管理列表
     * 
     * @param tRsStandardSatelliteImage 本地资源管理
     * @return 本地资源管理
     */
    @Override
    public List<TRsStandardSatelliteImage> selectTRsStandardSatelliteImageList(TRsStandardSatelliteImage tRsStandardSatelliteImage)
    {
        return tRsStandardSatelliteImageMapper.selectTRsStandardSatelliteImageList(tRsStandardSatelliteImage);
    }
    /**
     * 查询本地资源管理列表
     *
     * @param tRsStandardSatelliteImage 本地资源管理
     * @return 本地资源管理
     */
    @Override
    public List<TRsStandardSatelliteImage> getDownLoadLocalImageList(TRsStandardSatelliteImage tRsStandardSatelliteImage)
    {
        return tRsStandardSatelliteImageMapper.getDownLoadLocalImageList(tRsStandardSatelliteImage);
    }
    @Override
    public List<TRsStandardSatelliteImage> getUploadLocalImageList(TRsStandardSatelliteImage tRsStandardSatelliteImage)
    {
        return tRsStandardSatelliteImageMapper.getUploadLocalImageList(tRsStandardSatelliteImage);
    }

    /**
     * 新增本地资源管理
     * 
     * @param tRsStandardSatelliteImage 本地资源管理
     * @return 结果
     */
    @Override
    public int insertTRsStandardSatelliteImage(TRsStandardSatelliteImage tRsStandardSatelliteImage)
    {
        return tRsStandardSatelliteImageMapper.insertTRsStandardSatelliteImage(tRsStandardSatelliteImage);
    }

    /**
     * 修改本地资源管理
     * 
     * @param tRsStandardSatelliteImage 本地资源管理
     * @return 结果
     */
    @Override
    public int updateTRsStandardSatelliteImage(TRsStandardSatelliteImage tRsStandardSatelliteImage)
    {
        return tRsStandardSatelliteImageMapper.updateTRsStandardSatelliteImage(tRsStandardSatelliteImage);
    }
    /**
     * 下载P2P网络资源管理
     *
     * @param tRsStandardSatelliteImage 本地资源管理
     * @return 结果
     */
    @Override
    public int downLoadTRsStandardSatelliteImage(TRsStandardSatelliteImage tRsStandardSatelliteImage)
    {
        return tRsStandardSatelliteImageMapper.downLoadTRsStandardSatelliteImage(tRsStandardSatelliteImage);
    }

    /**
     * 批量删除本地资源管理
     * 
     * @param imageIds 需要删除的本地资源管理主键
     * @return 结果
     */
    @Override
    public int deleteTRsStandardSatelliteImageByImageIds(Long[] imageIds)
    {
        return tRsStandardSatelliteImageMapper.deleteTRsStandardSatelliteImageByImageIds(imageIds);
    }

    /**
     * 删除本地资源管理信息
     * 
     * @param imageId 本地资源管理主键
     * @return 结果
     */
    @Override
    public int deleteTRsStandardSatelliteImageByImageId(Long imageId)
    {
        return tRsStandardSatelliteImageMapper.deleteTRsStandardSatelliteImageByImageId(imageId);
    }
}
