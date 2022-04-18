package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysAlgorithmMapper;
import com.ruoyi.system.domain.SysAlgorithm;
import com.ruoyi.system.service.ISysAlgorithmService;

/**
 * 调度算法管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-04-07
 */
@Service
public class SysAlgorithmServiceImpl implements ISysAlgorithmService 
{
    @Autowired
    private SysAlgorithmMapper sysAlgorithmMapper;

    /**
     * 查询调度算法管理
     * 
     * @param id 调度算法管理主键
     * @return 调度算法管理
     */
    @Override
    public SysAlgorithm selectSysAlgorithmById(Long id)
    {
        return sysAlgorithmMapper.selectSysAlgorithmById(id);
    }

    /**
     * 查询调度算法管理列表
     * 
     * @param sysAlgorithm 调度算法管理
     * @return 调度算法管理
     */
    @Override
    public List<SysAlgorithm> selectSysAlgorithmList(SysAlgorithm sysAlgorithm)
    {
        return sysAlgorithmMapper.selectSysAlgorithmList(sysAlgorithm);
    }

    /**
     * 新增调度算法管理
     * 
     * @param sysAlgorithm 调度算法管理
     * @return 结果
     */
    @Override
    public int insertSysAlgorithm(SysAlgorithm sysAlgorithm)
    {
        return sysAlgorithmMapper.insertSysAlgorithm(sysAlgorithm);
    }

    /**
     * 修改调度算法管理
     * 
     * @param sysAlgorithm 调度算法管理
     * @return 结果
     */
    @Override
    public int updateSysAlgorithm(SysAlgorithm sysAlgorithm)
    {
        return sysAlgorithmMapper.updateSysAlgorithm(sysAlgorithm);
    }

    /**
     * 批量删除调度算法管理
     * 
     * @param ids 需要删除的调度算法管理主键
     * @return 结果
     */
    @Override
    public int deleteSysAlgorithmByIds(Long[] ids)
    {
        return sysAlgorithmMapper.deleteSysAlgorithmByIds(ids);
    }

    /**
     * 删除调度算法管理信息
     * 
     * @param id 调度算法管理主键
     * @return 结果
     */
    @Override
    public int deleteSysAlgorithmById(Long id)
    {
        return sysAlgorithmMapper.deleteSysAlgorithmById(id);
    }
}
