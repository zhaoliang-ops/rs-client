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
import com.ruoyi.system.domain.TRsStandardSatelliteImage;
import com.ruoyi.system.service.ITRsStandardSatelliteImageService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 本地资源管理Controller
 * 
 * @author zhaoliang
 * @date 2022-04-06
 */
@RestController
@RequestMapping("/system/localimage")
public class TRsStandardSatelliteImageController extends BaseController
{
    @Autowired
    private ITRsStandardSatelliteImageService tRsStandardSatelliteImageService;

    /**
     * 查询P2P网络内所有资源管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:localimage:list')")
    @GetMapping("/all")
    public TableDataInfo getAllP2PList(TRsStandardSatelliteImage tRsStandardSatelliteImage)
    {
        startPage();
        logger.info(String.valueOf(tRsStandardSatelliteImage));
        List<TRsStandardSatelliteImage> list = tRsStandardSatelliteImageService.getAllP2PImageList(tRsStandardSatelliteImage);
        return getDataTable(list);
    }
    /**
     * 查询本地资源管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:localimage:list')")
    @GetMapping("/list")
    public TableDataInfo list(TRsStandardSatelliteImage tRsStandardSatelliteImage)
    {
        startPage();
        logger.info(String.valueOf(tRsStandardSatelliteImage));
        List<TRsStandardSatelliteImage> list = tRsStandardSatelliteImageService.selectTRsStandardSatelliteImageList(tRsStandardSatelliteImage);
        return getDataTable(list);
    }
    /**
     * 查询下载资源管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:localimage:list')")
    @GetMapping("/downList")
    public TableDataInfo getDownLoadLocalImageList(TRsStandardSatelliteImage tRsStandardSatelliteImage)
    {
        startPage();
        List<TRsStandardSatelliteImage> list = tRsStandardSatelliteImageService.getDownLoadLocalImageList(tRsStandardSatelliteImage);
        return getDataTable(list);
    }    /**
     * 查询上传资源管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:localimage:list')")
    @GetMapping("/upList")
    public TableDataInfo getUploadLocalImageList(TRsStandardSatelliteImage tRsStandardSatelliteImage)
    {
        startPage();
        List<TRsStandardSatelliteImage> list = tRsStandardSatelliteImageService.getUploadLocalImageList(tRsStandardSatelliteImage);
        return getDataTable(list);
    }

    /**
     * 导出本地资源管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:localimage:export')")
    @Log(title = "本地资源管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TRsStandardSatelliteImage tRsStandardSatelliteImage)
    {
        List<TRsStandardSatelliteImage> list = tRsStandardSatelliteImageService.selectTRsStandardSatelliteImageList(tRsStandardSatelliteImage);
        ExcelUtil<TRsStandardSatelliteImage> util = new ExcelUtil<TRsStandardSatelliteImage>(TRsStandardSatelliteImage.class);
        util.exportExcel(response, list, "本地资源管理数据");
    }

    /**
     * 获取本地资源管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:localimage:query')")
    @GetMapping(value = "/{imageId}")
    public AjaxResult getInfo(@PathVariable("imageId") Long imageId)
    {
        return AjaxResult.success(tRsStandardSatelliteImageService.selectTRsStandardSatelliteImageByImageId(imageId));
    }

    /**
     * 新增本地资源管理
     */
    @PreAuthorize("@ss.hasPermi('system:localimage:add')")
    @Log(title = "本地资源管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TRsStandardSatelliteImage tRsStandardSatelliteImage)
    {
        return toAjax(tRsStandardSatelliteImageService.insertTRsStandardSatelliteImage(tRsStandardSatelliteImage));
    }

    /**
     * 修改本地资源管理
     */
    @PreAuthorize("@ss.hasPermi('system:localimage:edit')")
    @Log(title = "本地资源管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TRsStandardSatelliteImage tRsStandardSatelliteImage)
    {
        return toAjax(tRsStandardSatelliteImageService.updateTRsStandardSatelliteImage(tRsStandardSatelliteImage));
    }
    /**
     * 下载P2P网络资源
     */
    @PreAuthorize("@ss.hasPermi('system:localimage:edit')")
    @Log(title = "本地资源管理", businessType = BusinessType.UPDATE)
    @PutMapping("/download")
    public AjaxResult download(@RequestBody TRsStandardSatelliteImage tRsStandardSatelliteImage)
    {

        return toAjax(tRsStandardSatelliteImageService.downLoadTRsStandardSatelliteImage(tRsStandardSatelliteImage));
    }
    /**
     * 删除本地资源管理
     */
    @PreAuthorize("@ss.hasPermi('system:localimage:remove')")
    @Log(title = "本地资源管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{imageIds}")
    public AjaxResult remove(@PathVariable Long[] imageIds)
    {
        return toAjax(tRsStandardSatelliteImageService.deleteTRsStandardSatelliteImageByImageIds(imageIds));
    }
}
