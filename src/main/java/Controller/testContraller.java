package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2015/9/10 0010.
 */
@Controller
@RequestMapping("/test")
public class testContraller {
    @ResponseBody
    @RequestMapping("/test")
    public void test(){
        System.out.println(111111);
    }
}
