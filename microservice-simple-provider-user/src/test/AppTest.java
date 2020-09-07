package src.main;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.authorize.AuthorizeApplication;
import com.authorize.entity.CtUser;
import com.authorize.service.authorize.ICtUserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * 
 * @filename CtSysyserControllerTest.java
 * @pakage com.authorize.controller
 * @descption TODO(用一句话表述类的作用)
 * @author Pandong
 * @date 2019年3月5日
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = AuthorizeApplication.class)
public class AppTest {

    @Autowired
    private ICtUserService ss;
    
    @Test
    public void test() {
        IPage<CtUser> page = new Page<>(1, 20);
        final QueryWrapper<CtUser> wapper = new QueryWrapper<>();
        page = ss.selectPage(page, wapper);
        System.out.println(page.getRecords());
    }
    
    
}