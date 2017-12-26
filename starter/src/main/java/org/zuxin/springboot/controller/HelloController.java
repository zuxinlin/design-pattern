package org.zuxin.springboot.controller;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p/>
 * Author: linzuxin
 * Date:   2017/12/26
 * Time:   下午4:20
 */
@RestController
@ConfigurationProperties(prefix="my")
@RequestMapping(value = "/hello")
@Data
public class HelloController {
    private String name;
    private Integer port;
    private List<String> servers = new ArrayList<String>();

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

    @GetMapping(value = "/getConfig")
    public Object getConfig() {
        return success(name + port + servers);
    }
}
