package com.yky.myaicode.core.saver;


import cn.hutool.core.util.StrUtil;
import com.yky.myaicode.ai.model.HtmlCodeResult;
import com.yky.myaicode.exception.BusinessException;
import com.yky.myaicode.exception.ErrorCode;
import com.yky.myaicode.model.enums.CodeGenTypeEnum;

/**
 * HTML 代码文件保存器
 *
 * @author ykycoder
 */
public class HtmlCodeFileSaverTemplate extends CodeFileSaverTemplate<HtmlCodeResult> {

    @Override
    protected CodeGenTypeEnum getCodeType() {
        return CodeGenTypeEnum.HTML;
    }

    @Override
    protected void saveFiles(HtmlCodeResult result, String baseDirPath) {
        writeToFile(baseDirPath, "index.html", result.getHtmlCode());
    }

    @Override
    protected void validateInput(HtmlCodeResult result) {
        super.validateInput(result);
        // HTML 代码不能为空
        if (StrUtil.isBlank(result.getHtmlCode())) {
            throw new BusinessException(ErrorCode.SYSTEM_ERROR, "HTML 代码不能为空");
        }
    }

}
