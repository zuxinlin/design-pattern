package org.zuxin.common.service;

import com.sun.xml.internal.xsom.impl.EmptyImpl;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * <p/>
 * Author: linzuxin
 * Date:   2017/12/26
 * Time:   下午5:53
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({EmployeeServiceImpl.class})
public class EmployeeServiceImplTest extends TestCase {
    @Mock
    EmployeeService employeeService;

    public void testGetEmployeeCount() {
//        EmployeeService employeeService = PowerMockito.mock(EmployeeService.class);
//        PowerMockito.mockStatic(EmployeeServiceImpl.class); //<-- mock静态类
        PowerMockito.when(EmployeeServiceImpl.getNo()).thenReturn(8);
        PowerMockito.when(employeeService.getEmployeeCount()).thenReturn(9);
        EmployeeController employeeController = new EmployeeController(employeeService);
        assertEquals(9, employeeController.getEmployeeCount());
        assertEquals(8, EmployeeServiceImpl.getNo());
    }

    public void testSaveEmployee() {
    }
}