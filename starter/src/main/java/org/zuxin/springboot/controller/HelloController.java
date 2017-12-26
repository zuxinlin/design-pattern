package org.zuxin.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * <p/>
 * Author: linzuxin
 * Date:   2017/12/26
 * Time:   下午4:20
 */
@RestController
@RequestMapping(value = "/hello")
public class HelloController {
    private Map<String, Object> success(Object data) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("success", true);
        result.put("code", 0);
        result.put("data", data);

        return result;
    }

    @GetMapping(value = "/say")
    public Object say(@RequestParam String msg) {
        return success(msg);
    }
}
