package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysAlgorithm;

/**
 * 调度算法管理Mapper接口
 * 
 * @author ruoyi
 * @date 2022-04-07
 */
public interface SysAlgorithmMapper 
{
    /**
     * 查询调度算法管理
     * 
     * @param id 调度算法管理主键
     * @return 调度算法管理
     */
    public SysAlgorithm selectSysAlgorithmById(Long id);

    /**
     * 查询调度算法管理列表
     * 
     * @param sysAlgorithm 调度算法管理
     * @return 调度算法管理集合
     */
    public List<SysAlgorithm> selectSysAlgorithmList(SysAlgorithm sysAlgorithm);

    /**
     * 新增调度算法管理
     * 
     * @param sysAlgorithm 调度算法管理
     * @return 结果
     */
    public int insertSysAlgorithm(SysAlgorithm sysAlgorithm);

    /**
     * 修改调度算法管理
     * 
     * @param sysAlgorithm 调度算法管理
     * @return 结果
     */
    public int updateSysAlgorithm(SysAlgorithm sysAlgorithm);

    /**
     * 删除调度算法管理
     * 
     * @param id 调度算法管理主键
     * @return 结果
     */
    public int deleteSysAlgorithmById(Long id);

    /**
     * 批量删除调度算法管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysAlgorithmByIds(Long[] ids);
}
