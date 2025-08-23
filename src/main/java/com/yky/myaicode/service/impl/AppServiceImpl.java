package com.yky.myaicode.service.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import com.yky.myaicode.model.entity.App;
import com.yky.myaicode.mapper.AppMapper;
import com.yky.myaicode.service.AppService;
import org.springframework.stereotype.Service;

/**
 * 应用 服务层实现。
 *
 * @author <a href="https://github.com/ykycoder">ykycoder</a>
 */
@Service
public class AppServiceImpl extends ServiceImpl<AppMapper, App>  implements AppService{

}
