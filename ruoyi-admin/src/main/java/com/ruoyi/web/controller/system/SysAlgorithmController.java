package com.ruoyi.web.controller.system;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.SysAlgorithm;
import com.ruoyi.system.service.ISysAlgorithmService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 调度算法管理Controller
 * 
 * @author ruoyi
 * @date 2022-04-07
 */
@RestController
@RequestMapping("/system/algorithm")
public class SysAlgorithmController extends BaseController
{
    @Autowired
    private ISysAlgorithmService sysAlgorithmService;

    /**
     * 查询调度算法管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:algorithm:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysAlgorithm sysAlgorithm)
    {
        startPage();
        List<SysAlgorithm> list = sysAlgorithmService.selectSysAlgorithmList(sysAlgorithm);
        return getDataTable(list);
    }

    /**
     * 导出调度算法管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:algorithm:export')")
    @Log(title = "调度算法管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysAlgorithm sysAlgorithm)
    {
        List<SysAlgorithm> list = sysAlgorithmService.selectSysAlgorithmList(sysAlgorithm);
        ExcelUtil<SysAlgorithm> util = new ExcelUtil<SysAlgorithm>(SysAlgorithm.class);
        util.exportExcel(response, list, "调度算法管理数据");
    }

    /**
     * 获取调度算法管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:algorithm:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(sysAlgorithmService.selectSysAlgorithmById(id));
    }

    /**
     * 新增调度算法管理
     */
    @PreAuthorize("@ss.hasPermi('system:algorithm:add')")
    @Log(title = "调度算法管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysAlgorithm sysAlgorithm)
    {
        return toAjax(sysAlgorithmService.insertSysAlgorithm(sysAlgorithm));
    }

    /**
     * 修改调度算法管理
     */
    @PreAuthorize("@ss.hasPermi('system:algorithm:edit')")
    @Log(title = "调度算法管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysAlgorithm sysAlgorithm)
    {
        return toAjax(sysAlgorithmService.updateSysAlgorithm(sysAlgorithm));
    }

    /**
     * 删除调度算法管理
     */
    @PreAuthorize("@ss.hasPermi('system:algorithm:remove')")
    @Log(title = "调度算法管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sysAlgorithmService.deleteSysAlgorithmByIds(ids));
    }
}
