package org.zuxin.common.service;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * <p/>
 * Author: linzuxin
 * Date:   2017/12/26
 * Time:   下午6:33
 */
@Data
@AllArgsConstructor
public class EmployeeController {
    EmployeeService employeeService;

    public static int getEmployeeCount() {
        return 9;
    }
}
